package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuPrincipal;
	private JMenu JMenuAlumnos;
	private JMenuItem itemAltaAlumno;
	private JMenuItem itemBuscarAlumno;
	private JMenuItem itemVerAlumno;

	public MenuPrincipal() {
		
		iniciarComponentes();
		iniciarManejadoresEventos();
	}
	
	public void iniciarComponentes(){
		setTitle("Menú Principal Alumnos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//crea barra de menú Principal
		menuPrincipal = new JMenuBar();
		setJMenuBar(menuPrincipal);
		
		//crea menú Alumnos
		JMenuAlumnos = new JMenu("Alumnos");
		menuPrincipal.add(JMenuAlumnos);
		
		//crea opciones de Alumnos
		itemAltaAlumno = new JMenuItem("Agregar Alumno");
		
		JMenuAlumnos.add(itemAltaAlumno);
		itemBuscarAlumno = new JMenuItem("Buscar Alumno");
		JMenuAlumnos.add(itemBuscarAlumno);
		itemVerAlumno = new JMenuItem("Ver Alumo");
		JMenuAlumnos.add(itemVerAlumno);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}
	
	public void iniciarManejadoresEventos(){
		itemAltaAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AgregarAlumno agregAlu=new AgregarAlumno();
				agregAlu.setVisible(true);
				agregAlu.pack();
			}
		});
	}
	
	public static void main(String[] args) {
		MenuPrincipal vent=new MenuPrincipal();
		vent.setVisible(true);
		
	}
	
}

