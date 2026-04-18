package presentacion;

import logica.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		ListaPersonas listado=Controlador.devolverPersonas();  
		
		String fila[]=new String[miModelo.getColumnCount()];
       	try{
	      	for(int i=0;i<listado.largo();i++){
	      		fila[0]=String.valueOf(listado.devolver(i).
	      				getCedula());
	      		fila[1]=listado.devolver(i).getNombre();
	      		fila[2]=listado.devolver(i).getApellido();
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