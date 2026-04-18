package grafica;


import static grafica.MenuPrincipal.coleccion;

import java.awt.GridLayout;
import javax.swing.*;

import logica.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class AgregarPersona extends JInternalFrame{
	
	private JPanel pnlSuperior;
	private JLabel lblCedula, lblNombre, lblApellido;
	private JTextField txtCedula, txtNombre, txtApellido;
	private JButton btnGuardar, btnLimpiar;
	
	
	public AgregarPersona(){
		setClosable(true);
		setTitle("Agregar Persona");
		setResizable(true);
		iniciarComponentes();
		iniciarManejadoresEventos();
		pack();
	}
	
	private void iniciarComponentes() {
		
		
		pnlSuperior =new JPanel();   
		pnlSuperior.setLayout(new GridLayout(5,2,5,5)); 
		/*genera espacio vacio alrededor para que no que todo contra los bordes*/
		pnlSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		/*Definimos  los componentes del panel superior*/
		lblCedula=new JLabel("Cedula:"); 
		txtCedula= new JTextField();
		lblNombre= new JLabel("Nombre:"); 
		txtNombre= new JTextField();
		lblApellido= new JLabel("Apellido:");
		txtApellido= new JTextField();
		btnGuardar= new JButton("Guardar");
		btnLimpiar= new JButton("Limpiar");
						
		/*agregamos los componentes del panel superior*/
		pnlSuperior.add(lblCedula);
		pnlSuperior.add(txtCedula);
		pnlSuperior.add(lblNombre);
		pnlSuperior.add(txtNombre);
		pnlSuperior.add(lblApellido);
		pnlSuperior.add(txtApellido);
		pnlSuperior.add(btnLimpiar);
		pnlSuperior.add(btnGuardar);
		//agregamos el panel al JFrame		
		getContentPane().add(pnlSuperior);
					
	}
	
	//resolvemos los eventos
	private void iniciarManejadoresEventos() {
		// TODO Auto-generated method stub
		
		btnGuardar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
				try{
				   int auxCed=Integer.parseInt(txtCedula.getText());
			       String auxNom=txtNombre.getText();
			       String auxApe=txtApellido.getText();
			       Persona p1 =new Persona(auxCed,auxNom,auxApe);
			       coleccion.agregar(p1);						//
			       JOptionPane.showMessageDialog(null, 
			    		   "Datos guardados ok","Mensaje ",
			    		   JOptionPane.INFORMATION_MESSAGE);
			    }catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error!!, "
							+ "la cedula debe ser numerica  \n",
							"Error",JOptionPane.ERROR_MESSAGE);
			    }
			}
		});
		btnLimpiar.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
		
				txtCedula.setText("");
				txtNombre.setText("");
				txtApellido.setText("");	
	    	}
		});
	}
}
	   

	

