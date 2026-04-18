package Logica;

import java.util.ArrayList;

// La clase Lista_Mujeres representa una lista de objetos de tipo Mujer.
public class Lista_Mujeres {
    // ArrayList para almacenar objetos de tipo Mujer.
    private ArrayList<Mujer> lista;
    
    // Constructor que inicializa la lista de mujeres.
    public Lista_Mujeres() {
        lista = new ArrayList<Mujer>();
    }
    
    // MÈtodo para agregar una mujer a la lista.
    public void add(Mujer mujer) {
        lista.add(mujer);
    }
    
    // MÈtodo para obtener una mujer por su √≠ndice en la lista.
    public Mujer get(int id) {
        return lista.get(id);
    }
    
    // MÈtodo para obtener el tama√±o de la lista de mujeres.
    public int size() {
        return lista.size();
    }
}
