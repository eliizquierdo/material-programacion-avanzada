package presentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
//import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class AgregarAlumno extends JDialog {

	private JPanel pnlSuperior, pnlCursos, pnlSexo, pnlCentral, pnlInferior;
	private JLabel lblNombre, lblApellido, lblNacionalidad;
	private JTextField txtNombre, txtApellido;
	private JButton btnAceptar, btnLimpiar;
	private JTextField txtResultado;
	private JComboBox cmbNacionalidad;
	private ButtonGroup grupo;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFemenino;
	private JCheckBox chkJava;
	private JCheckBox chkNet;
	private JCheckBox chkRedes;
	private JLabel lbnFechaNac;
	private JDateChooser dateChooserFecha;
	
	
	public AgregarAlumno(){
		
		
		iniciarComponentes();
		iniciarManejadoresEventos();
	
	}

	private void iniciarComponentes() {
		
		setTitle("Ingreso de alumnos");
		/*tama�o de la ventana, no es necesario */
		setLocationRelativeTo(null);
		setResizable(true);
		getContentPane().setLayout(new BorderLayout());
		
		pnlSuperior =new JPanel();   /*instanciamos el contenedor de los datos personales*/
		//pone un borde con titulo
		pnlSuperior.setBorder(BorderFactory.createTitledBorder("Datos Personales")); 
		//crea un borde vacio que genera un espacio de 10 px en cada lado del panel
		pnlSuperior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		pnlSuperior.setLayout(new GridLayout(4,2,10,5)); /*definimos el Layout de 4 filas, 2 columnas y espacios*/
		
		/*Definimos  los componentes del panel superior*/
		lblNombre= new JLabel("Nombre:"); //lblNombre.setAlignmentX(CENTER_ALIGNMENT);
		txtNombre= new JTextField();
		lblApellido= new JLabel("Apellido:");
		txtApellido= new JTextField();
		lblNacionalidad= new JLabel("Nacionalidad:");
		cmbNacionalidad = new JComboBox();
		cmbNacionalidad.addItem("Uruguaya");
		cmbNacionalidad.addItem("Argentina");
		cmbNacionalidad.addItem("Brasilera");
		cmbNacionalidad.setSelectedIndex(0);
		
		/*agregamos los componentes del panel superior*/
		pnlSuperior.add(lblNombre);
		pnlSuperior.add(txtNombre);
		pnlSuperior.add(lblApellido);
		pnlSuperior.add(txtApellido);
		pnlSuperior.add(lblNacionalidad);
		pnlSuperior.add(cmbNacionalidad);
		/*instanciamos el contenedor para Sexo*/
		pnlSexo=new JPanel();
		pnlSexo.setBorder(BorderFactory.createTitledBorder("Sexo"));
		pnlSexo.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		grupo=new ButtonGroup();
		rdbtnMasculino = new JRadioButton("Masculino",false);
		grupo.add(rdbtnMasculino);
		rdbtnFemenino = new JRadioButton("Femenino",false);
		grupo.add(rdbtnFemenino);
		/*agregamos los componentes del panel Sexo*/
		pnlSexo.add(rdbtnFemenino);
		pnlSexo.add(rdbtnMasculino);
		/*instanciamos el contenedor para los datos de los cursos*/
		pnlCursos=new JPanel();
		//pnlCursos.setLayout(new FlowLayout(FlowLayout.CENTER));  no es necesario pues ya tiene esto por defecto
		pnlCursos.setBorder(BorderFactory.createTitledBorder("Cursos"));
		/*Definimos  los componentes del panel cursos*/
		chkJava = new JCheckBox("Java");
		chkNet = new JCheckBox(".Net");
		chkRedes = new JCheckBox("Redes");
		/*agregamos los componentes del panel Cursos*/
		pnlCursos.add(chkJava);
		pnlCursos.add(chkNet);
		pnlCursos.add(chkRedes);
		
		btnAceptar= new JButton();
		btnAceptar.setText("Aceptar");
		btnLimpiar= new JButton();
		btnLimpiar.setText("Limpiar");
		/*instanciamos el contenedor para los botones de la parte inferior*/
		pnlInferior=new JPanel();
		/*Agregamos los componentes al Contenedor Inferior*/
		
		pnlInferior.add(btnAceptar);
		pnlInferior.add(btnLimpiar);
		//en la parte central tienen que ir dos paneles el pnlSexo y el pnlCursos por lo que deberemos agregarlos a un 
		//tercer panel que llamarenos pnlCentral, ya que en un BorderLayout solo puede ir un componente por zona 
		pnlCentral = new JPanel();
		pnlCentral.setLayout(new GridLayout(2,1));
		pnlCentral.add(pnlSexo);
		pnlCentral.add(pnlCursos);
		//agregamos cada panel a la zona correspondiendte
		getContentPane().add(pnlSuperior, BorderLayout.NORTH);
		
		lbnFechaNac = new JLabel("Fecha nacimiento:");
		pnlSuperior.add(lbnFechaNac);
		
		dateChooserFecha = new JDateChooser();
		pnlSuperior.add(dateChooserFecha);
		getContentPane().add(pnlCentral, BorderLayout.CENTER);
		getContentPane().add(pnlInferior, BorderLayout.SOUTH);
		
		
			
	}
	
	public void iniciarManejadoresEventos(){
		
		 btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtNombre.setText("");
					txtApellido.setText("");	
					cmbNacionalidad.setSelectedIndex(0);
					/*deseleccionalas opciones marcadas del grupo de radioButton*/
					grupo.clearSelection();		
					rdbtnFemenino.setSelected(false);
					/*deselecciona el calendario*/
					dateChooserFecha.setCalendar(null);
					chkJava.setSelected(false);
					chkNet.setSelected(false);
					chkRedes.setSelected(false);
					
						
				}
			});
		 
		 btnAceptar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String datos=mostrarDatos(); 
					JOptionPane.showMessageDialog(null, "Datos capturados:  \n("+datos+")");
					
				}
			});
		 
	}
	
	
	
	private String mostrarDatos(){
		String salida="";
		String auxNombre=txtNombre.getText()+"  ";
		String auxApellido=txtApellido.getText()+"  ";
		String auxNacionalidad=  cmbNacionalidad.getSelectedItem().toString();
		String auxSexo="";
		String auxCurso="";
		
		if (rdbtnMasculino.isSelected())
			auxSexo="Masculino";
		else
			auxSexo="Femenino";
		if(chkJava.isSelected())
			auxCurso="Java ";
		if(chkNet.isSelected())
			auxCurso+=".Net ";
		if(chkRedes.isSelected())
			auxCurso+="Redes ";
		int anio = dateChooserFecha.getCalendar().get(Calendar.YEAR);
		int mes = dateChooserFecha.getCalendar().get(Calendar.MONTH)+1;
		int dia = dateChooserFecha.getCalendar().get(Calendar.DAY_OF_MONTH);

		//concateno todos los String capturados
		salida=auxNombre+" "+auxApellido+" "+auxNacionalidad+" "+ dia+"/"+mes+"/"+anio+" "+auxSexo+" "+ auxCurso;
		
		return salida;
	}
	

/*********************************************************/

	public static void main(String[] args) {
		AgregarAlumno vent=new AgregarAlumno();
		vent.setVisible(true);
		vent.pack();
	}

}