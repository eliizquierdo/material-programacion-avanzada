package presentacion;

import java.awt.GridLayout;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logica.*;
 
public class AgregarPersona extends JDialog implements ActionListener {
	
	private JPanel pnlSuperior;
	private JLabel lblCedula, lblNombre, lblApellido;//, lblGrupo;
	private JTextField txtCedula, txtNombre, txtApellido;
	private JButton btnGuardar, btnLimpiar;
	
	
	public AgregarPersona(){
		
		setTitle("Agregar Persona");
		setLocationRelativeTo(null);
		setResizable(true);
		iniciarComponentes();
		pack();
	}
	
	private void iniciarComponentes() {
		
		
		pnlSuperior =new JPanel();   
		pnlSuperior.setLayout(new GridLayout(5,2,5,5)); 
		/*genera espacio vacío alrededor para que no que todo contra los bordes*/
		pnlSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		/*Definimos  los componentes del panel superior*/
		lblCedula=new JLabel("Cedula:"); 
		txtCedula= new JTextField();
		lblNombre= new JLabel("Nombre:"); 
		txtNombre= new JTextField();
		lblApellido= new JLabel("Apellido:");
		txtApellido= new JTextField();
		btnGuardar= new JButton("Guardar");
		btnGuardar.addActionListener(this);
		btnLimpiar= new JButton("Limpiar");
		btnLimpiar.addActionListener(this);
				
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
		this.add(pnlSuperior);
					
	}
	
	//resolvemos los eventos
	
	@Override
	public void actionPerformed(ActionEvent evento) {
				
		if (evento.getSource()==btnGuardar){
			try{
			   int auxCed=Integer.parseInt(txtCedula.getText());
		       String auxNom=txtNombre.getText();
		       String auxApe=txtApellido.getText();
		       Persona p1 =new Persona(auxCed,auxNom,auxApe);
		       Controlador.agregarPersona(p1);
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
		if (evento.getSource()==btnLimpiar){
			txtCedula.setText("");
			txtNombre.setText("");
			txtApellido.setText("");	
		}
	}
	   
}
	
