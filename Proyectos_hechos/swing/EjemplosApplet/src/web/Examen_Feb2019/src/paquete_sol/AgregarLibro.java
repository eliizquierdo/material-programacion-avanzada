package paquete_sol;

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
import javax.swing.SwingConstants;

public class AgregarLibro extends JDialog {

	private JPanel pnlInferior, pnlSuperior;
	private JButton btnAceptar, btnLimpiar;
	private JTextField txtNombre, txtCantidadPaginas, txtCodigo, txtPrecio;
	private JLabel lblCodigo, lblCantidadPaginas, lblNombre, lblPrecio;
	
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
		pnlSuperior.setLayout(new GridLayout(6,2,10,5)); 
		
		/*Definimos  los componentes del panel superior*/
		lblCodigo= new JLabel("Codigo:"); 
		txtNombre= new JTextField();
		lblCantidadPaginas=new JLabel("Cantidad  p\u00E1ginas:");
		txtCantidadPaginas=new JTextField();
		lblNombre=new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtCodigo=new JTextField();
		lblPrecio=new JLabel("Precio: ");
		txtPrecio=new JTextField();
		txtPrecio.setEditable(false);
		
		/*agregamos los componentes del panel superior*/
		pnlSuperior.add(lblCodigo);
		pnlSuperior.add(txtNombre);
		pnlSuperior.add(lblCantidadPaginas);
		pnlSuperior.add(txtCantidadPaginas);
		pnlSuperior.add(lblNombre);
		pnlSuperior.add(txtCodigo);
		pnlSuperior.add(lblPrecio);
		pnlSuperior.add(txtPrecio);
		
		
		getContentPane().add(pnlSuperior, BorderLayout.NORTH);
		
		btnAceptar= new JButton();
		btnAceptar.setText("Aceptar");
		btnLimpiar= new JButton();
		btnLimpiar.setText("Limpiar");
		/*instanciamos el contenedor para los botones de la parte inferior*/
		pnlInferior=new JPanel();
		/*Agregamos los componentes al Contenedor Inferior*/
		
		pnlInferior.add(btnAceptar);
		pnlInferior.add(btnLimpiar);
		getContentPane().add(pnlInferior, BorderLayout.SOUTH);
		
	}
	
	public void iniciarManejadoresEventos(){
		
		 btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					txtNombre.setText("");
					txtCantidadPaginas.setText("");	
					txtCodigo.setText("");						
					
					
				}
			});
		 
		 btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String datos=mostrarDatos(); 
					//String precio=calcularPrecio();
					JOptionPane.showMessageDialog(null, "Datos capturados:  \n("+datos+")");
					
				}
			});
		 
	}
	
	private String mostrarDatos(){
		String salida="";
		String auxNombre=txtNombre.getText()+"  ";
		String auxCantidadPaginas=txtCantidadPaginas.getText();
		String auxCodigo=txtCodigo.getText();
		String auxPrecio=txtPrecio.getText();
		
		//concateno todos los String capturados
		salida=auxCodigo+" "+auxNombre+" "+auxCantidadPaginas+" "+" "+auxPrecio;
		
		return salida;
	}
	


}