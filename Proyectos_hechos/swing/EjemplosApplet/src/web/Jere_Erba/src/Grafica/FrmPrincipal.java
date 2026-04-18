package Grafica;

import java.awt.Component;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Libro;
import Logica.Normal;
import Logica.Prestamos;
import Logica.Socio_Alumno;
import Logica.Socio_Profesor;
import java.awt.Color;
import javax.swing.UIManager;



public class FrmPrincipal extends JFrame {
	public static Libro coleccion = new Libro();
	public static Normal coleccion1 = new Normal();
	public static Prestamos coleccion2 = new Prestamos();
	public static Socio_Alumno coleccion3 = new Socio_Alumno();
	public static Socio_Profesor coleccion4 = new Socio_Profesor();
	
	

	private JPanel contentPane;
	private final JDesktopPane desktopPane = new JDesktopPane();
	private JMenuBar menuBar;
	private JMenuItem mntmAgregarLibro;
	private JMenuItem mntmRealizarPrestamos;
	private JMenuItem mntmListadoProfesores;
	private JMenuItem mntmAgregarMaterialNormal;
	private JMenuItem mntmAgregarAlumno;
	private JMenuItem mntmAgregarProfesor;
	private JMenu mnPrestamos;
	private JMenuItem mntmListadoAlumno;
	private JMenuItem mntmListarLibros;
	private JMenuItem mntmListarMaterialNormal;
	

	public static void main(String[] args) {
		FrmPrincipal frame = new FrmPrincipal();
		frame.setVisible(true);
	}

	public FrmPrincipal() {
		iniciarManjeadorEventos();
		iniciarComponentes();
	}
	
	private void iniciarManjeadorEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1382, 731);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRegistrarMaterial = new JMenu("Registrar Material");
		menuBar.add(mnRegistrarMaterial);
		
		mntmAgregarMaterialNormal = new JMenuItem("Agregar Material Normal");
		mnRegistrarMaterial.add(mntmAgregarMaterialNormal);
		
		mntmAgregarLibro = new JMenuItem("Agregar Libro");
		mnRegistrarMaterial.add(mntmAgregarLibro);
		
		JMenu mnRegistrarSocios = new JMenu("Registrar Socios");
		menuBar.add(mnRegistrarSocios);
		
		mntmAgregarAlumno = new JMenuItem("Agregar Alumno");
		mnRegistrarSocios.add(mntmAgregarAlumno);
		
		mntmAgregarProfesor = new JMenuItem("Agregar Profesor");
		mnRegistrarSocios.add(mntmAgregarProfesor);
		
		mnPrestamos = new JMenu("Prestamos");
		
		menuBar.add(mnPrestamos);
		
		mntmRealizarPrestamos = new JMenuItem("Realizar Prestamo");
		mnPrestamos.add(mntmRealizarPrestamos);
		
		JMenu mnListados = new JMenu("Listados");
		menuBar.add(mnListados);
		
		JMenu mnListadoMaterial = new JMenu("Listado de Material");
		mnListados.add(mnListadoMaterial);
		
		mntmListarLibros = new JMenuItem("Listar Libros");
		mnListadoMaterial.add(mntmListarLibros);
		
		mntmListarMaterialNormal = new JMenuItem("Listar material Normal");
		mnListadoMaterial.add(mntmListarMaterialNormal);
		
		JMenu mnListadoSocios = new JMenu("Listados de Socios");
		mnListados.add(mnListadoSocios);
		
		mntmListadoProfesores = new JMenuItem("Listado de Profesores");
		mnListadoSocios.add(mntmListadoProfesores);
		
		mntmListadoAlumno = new JMenuItem("Listado de Alumno");
		mnListadoSocios.add(mntmListadoAlumno);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(0, 0, 1370, 684);
		contentPane.add(desktopPane);
	}
		


	public void iniciarComponentes() {
		
		mntmAgregarLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InIngresarMaterialLibro opconAdLibro = new InIngresarMaterialLibro();
				opconAdLibro.setVisible(true);
			    desktopPane.add(opconAdLibro);
			}
		});
		
		mntmAgregarMaterialNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InIngresarMaterialNormal opcionAdMaterial = new InIngresarMaterialNormal();
				opcionAdMaterial.setVisible(true);
				desktopPane.add(opcionAdMaterial);
			}
		});
		
		
		mntmAgregarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InIngresarAlumno opcionAdAlumno = new InIngresarAlumno();
				opcionAdAlumno.setVisible(true);
			    desktopPane.add(opcionAdAlumno);
			}
		});
		
		
		mntmAgregarProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InIngresarProfesor opcionAdProfesor = new InIngresarProfesor();
				opcionAdProfesor.setVisible(true);
			    desktopPane.add(opcionAdProfesor);	
			}
		});
		
		mntmRealizarPrestamos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InPrestamos opcionAdPrestamos = new InPrestamos();
				opcionAdPrestamos.setVisible(true);
			    desktopPane.add(opcionAdPrestamos);
			}
		});
		
		mntmListadoAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InListadosAlumnos opcionListadoAlumno = new InListadosAlumnos();
				opcionListadoAlumno.setVisible(true);
			    desktopPane.add(opcionListadoAlumno);
			}
		});
		
		mntmListadoProfesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InListadosProfesores opcionListadoProfesor = new InListadosProfesores();
				opcionListadoProfesor.setVisible(true);
			    desktopPane.add(opcionListadoProfesor);
			}
		});
		
		mntmListarLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InListadosLibros opcionListadoLibros = new InListadosLibros();
				opcionListadoLibros.setVisible(true);
			    desktopPane.add(opcionListadoLibros);
			}
		});
		
		mntmListarMaterialNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InListadosMaterialNormal opcionListadoMatNormal = new InListadosMaterialNormal();
				opcionListadoMatNormal.setVisible(true);
			    desktopPane.add(opcionListadoMatNormal);
			}
		});
		
		
		
	}
}
