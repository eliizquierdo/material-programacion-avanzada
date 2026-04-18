package Logica;

import javax.swing.*;

import Grafica.BasedeDatos;
import Persistencia.*;

// Clase que contiene operaciones l�gicas relacionadas con la lista de mujeres
public class Operaciones {
    // Atributos de la clase
    private Lista_Mujeres lista; // Lista de mujeres
    private Lista_Id lista_id; 	 // Lista de identificadores
    private Consultas consultas; // Consultas relacionadas con la persistencia de datos

    
    // Constructor vac�o que inicializa las consultas
    public Operaciones() {
        this.lista = new Lista_Mujeres(); // Inicializaci�n de la lista de mujeres
        this.lista_id = new Lista_Id(); // Inicializaci�n de la lista de identificadores
        this.consultas = new Consultas(); // Inicializaci�n de las consultas
        
        consultas.BdSize(lista_id); // Obtiene el tama�o de la lista de identificadores
        for (int i = 0; i < lista_id.size(); i++) {
            consultas.obtenerMujer(i, lista); // Obtiene los datos de la mujer en la posici�n i
        }
    }

    // M�todo para inicializar la lista de mujeres y cargar datos en la interfaz
    public void Inicializar(JComboBox comboBox) {
        
        // Iteraci�n sobre la lista de identificadores
        for (int i = 0; i < lista_id.size(); i++) {
            // Verifica que no sea la primera mujer (�ndice 0) para evitar problemas
            if (i != 0) {
                // Construye el nombre completo de la mujer
                String nombre_completo = lista.get(i).getNombre();
                
                // Agrega el segundo nombre si existe
                if (lista.get(i).getSegundo_nombre() != null) {
                    nombre_completo += " " + lista.get(i).getSegundo_nombre();
                }
                
                // Agrega el apellido
                nombre_completo += " " + lista.get(i).getApellido();
                
                // Agrega el segundo apellido si existe
                if (lista.get(i).getSegundo_apellido() != null) {
                    nombre_completo += " " + lista.get(i).getSegundo_apellido();
                }

                comboBox.addItem(nombre_completo); // Agrega el nombre completo al ComboBox en la interfaz
            }
        }
    }
    
    public void cambiarDatos(JComboBox comboBox, JTextField nombre, JTextField segundo_nombre, 
    		JTextField apellido, JTextField segundo_apellido, JLabel nacionalidad, JLabel nacimiento,
    		JLabel fallecimiento, JTextField logros, JTextField ocupacion, JLabel foto) {
    	int id = comboBox.getSelectedIndex();
    	
    	nombre.setText(this.lista.get(id).getNombre());
    	segundo_nombre.setText(this.lista.get(id).getSegundo_nombre());
    	apellido.setText(this.lista.get(id).getApellido());
    	segundo_apellido.setText(this.lista.get(id).getSegundo_apellido());
    	
    	nacionalidad.setText(lista.get(id).getNacionalidad());
    	nacimiento.setText(lista.get(id).getFecha_nacimiento());
    	fallecimiento.setText(lista.get(id).getFecha_fallecimiento());
    	
    	logros.setText(lista.get(id).getLogro());
    	
    	String ocupaciones = "";
    	for(int i=0; i<lista.get(id).getOcupacion().size(); i++) {
    		ocupaciones += lista.get(id).getOcupacion().get(i)+"-";
    	}
    	ocupacion.setText(ocupaciones);
    	
    	foto.setIcon(new javax.swing.ImageIcon(getClass().getResource(lista.get(id).getImagen())));
    }
    
}
