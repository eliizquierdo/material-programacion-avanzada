package paquete;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgregarLibro extends JDialog {

	private JPanel pnlInferior, pnlSuperior;
	private JButton btnAceptar;
	private JTextField txtNombre, txtApellidoAutor, txtCantidadPaginas;
	private JComboBox cmbPais;	
	private JLabel lblNombre, lblApellidoAutor, lblCantidadPaginas, lblPais;
	
	public AgregarLibro(){
				
		iniciarComponentes();
		iniciarManejadoresEventos();
	}

	private void iniciarComponentes() {
		
		setTitle("Ingreso de Libros");
		setLocationRelativeTo(null);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout());
		
		pnlSuperior =new JPanel();   /*instanciamos el contenedor de los datos personales*/
		//crea un borde vacio que genera un espacio de 10 px en cada lado del panel
		pnlSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlSuperior.setLayout(new GridLayout(5,2,10,5)); 
		
		/*Definimos  los componentes del panel superior*/
		lblNombre= new JLabel("Nombre:"); 
		txtNombre= new JTextField();
		lblApellidoAutor= new JLabel("Apellido Autor:");
		txtApellidoAutor= new JTextField();
		lblPais= new JLabel("Pais:");
		cmbPais = new JComboBox();
		cmbPais.addItem("Uruguay");
		cmbPais.addItem("Argentina");
		cmbPais.addItem("Brasil");
		cmbPais.setSelectedIndex(0);
		lblCantidadPaginas=new JLabel("Cantidad páginas:");
		txtCantidadPaginas=new JTextField();
		
		
		/*agregamos los componentes del panel superior*/
		pnlSuperior.add(lblNombre);
		pnlSuperior.add(txtNombre);
		pnlSuperior.add(lblApellidoAutor);
		pnlSuperior.add(txtApellidoAutor);
		pnlSuperior.add(lblPais);
		pnlSuperior.add(cmbPais);
		pnlSuperior.add(lblCantidadPaginas);
		pnlSuperior.add(txtCantidadPaginas);
						
		getContentPane().add(pnlSuperior, BorderLayout.NORTH);
		
		btnAceptar= new JButton();
		btnAceptar.setText("Aceptar");
		
		/*instanciamos el contenedor para los botones de la parte inferior*/
		pnlInferior=new JPanel();
		/*Agregamos los componentes al Contenedor Inferior*/
		
		pnlInferior.add(btnAceptar);
		
		getContentPane().add(pnlInferior, BorderLayout.SOUTH);
		
		
		
		
	}
	
	public void iniciarManejadoresEventos(){
		
		 
	}
	
	


}