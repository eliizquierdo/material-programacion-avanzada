package vista;

import modelo.vo.*;		//
//import modelo.dao.*;	//agregue
import static vista.MenuPrincipal.coleccion;		//
								


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class VerPersonasTabla extends JDialog implements ActionListener{
	
	private JPanel pnlCentral;
	private DefaultTableModel miModelo;	//modelo
	private JTable tablaPersonas;	//tabla
	private JScrollPane scrPanel;//barra de desplazamiento		

	private JButton btnActualizar;
	
	public VerPersonasTabla(){
		iniciarComponentes();
		iniciarTabla();
	}
	
	public void iniciarComponentes(){
		setTitle("Listado de Personas");
		setLocationRelativeTo(null);
		setResizable(true);
		/*Instanciamos un panel y le aplicamos BorderLayout */
		pnlCentral =new JPanel();
		pnlCentral.setLayout(new BorderLayout());
		//instanciamos un botón 
		btnActualizar = new JButton("Actualizar Listado");
		getContentPane().add(btnActualizar, BorderLayout.SOUTH);
		btnActualizar.addActionListener(this);
		
	}
	
	public void iniciarTabla(){
		
		scrPanel = new JScrollPane();
		pnlCentral.add(scrPanel, BorderLayout.CENTER);
	
		tablaPersonas = new JTable();
		scrPanel.setViewportView(tablaPersonas);
       
		this.add(pnlCentral, BorderLayout.CENTER);
		pack();		
		String titulos[]={"Cedula","Nombre", "Apellido"};
		miModelo=new DefaultTableModel(null,titulos);
		
		tablaPersonas.setModel(miModelo);
	}
		
	private void cargarTabla() {
		//PersonaDAO pDAO=new PersonaDAO();	//agregue
		//ListaPersonas listado= pDAO.listarPersonas();  //cambie
		//cambiar en este método donde dice coleccion por listado 
		String fila[]=new String[miModelo.getColumnCount()];
       	try{
	      	for(int i=0;i<coleccion.largo();i++){
	      		fila[0]=String.valueOf(coleccion.devolver(i).
	      				getCedula());
	      		fila[1]=coleccion.devolver(i).getNombre();
	      		fila[2]=coleccion.devolver(i).getApellido();
	      		miModelo.addRow(fila);
	      	}
	        tablaPersonas.setModel(miModelo);
       	}catch (Exception e) {
       		System.out.println("error"+e);
       	}
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==btnActualizar){
			cargarTabla();
		}
		
	}
	
	

}