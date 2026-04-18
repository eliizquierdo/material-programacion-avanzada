package grafica;

import javax.swing.*;

import static grafica.MenuPrincipal.coleccion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;



public class VerPersonasTabla extends JInternalFrame{
	
	private JPanel pnlCentral;
	private DefaultTableModel miModelo;	//modelo
	private JTable tablaPersonas;	//tabla
	private JScrollPane scrPanel;//barra de desplazamiento		

	private JButton btnActualizar;
	
	public VerPersonasTabla(){
		setClosable(true);
		setBounds(600,0,400,800);//pos y tamaño
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	
	public void iniciarComponentes(){
		setTitle("Listado de Personas");
		setResizable(true);
		/*Instanciamos un panel y le aplicamos BorderLayout */
		pnlCentral =new JPanel();
		pnlCentral.setLayout(new BorderLayout());
		//instanciamos un botón 
		btnActualizar = new JButton("Actualizar Listado");
		getContentPane().add(btnActualizar, BorderLayout.SOUTH);
		iniciarTabla();
			
	}
			
	private void iniciarManejadoresEventos() {
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarTabla();
			}
		});
	}
	
	public void iniciarTabla(){
		
		scrPanel = new JScrollPane();
		pnlCentral.add(scrPanel, BorderLayout.CENTER);
	
		tablaPersonas = new JTable();
		scrPanel.setViewportView(tablaPersonas);
       
		getContentPane().add(pnlCentral, BorderLayout.CENTER);
		pack();		
		String titulos[]={"Cedula","Nombre", "Apellido"};
		miModelo=new DefaultTableModel(null,titulos);
		tablaPersonas.setModel(miModelo);
	}
	
	private void cargarTabla() {
		String fila[]=new String[miModelo.getColumnCount()];
       	try{
	      	for(int i=0;i<coleccion.cantidad();i++){
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
}