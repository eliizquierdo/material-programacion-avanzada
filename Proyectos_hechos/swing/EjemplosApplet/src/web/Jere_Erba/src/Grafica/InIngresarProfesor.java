package Grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Logica.Articulo_Alumno;
import Logica.Articulo_Libro;
import Logica.Articulo_Normal;
import Logica.Articulo_Profesores;
import Logica.Libro;
import Logica.Normal;
import Logica.Profesores;
import Logica.Alumno;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;

	
public class InIngresarProfesor extends JInternalFrame {
	private JTextField txtDireccionP;
	private JTextField txtNombreP;
	private JTextField txtCI_P;
	private JTable table;
	
	Profesores pPr = new Profesores();
	DefaultTableModel model = new DefaultTableModel();
	private final JPanel panel_1 = new JPanel();
	private JButton btnLimpiar;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JTextField txtTelefonoP;
	private JTextField txtAsignaturaQueDictaP;


	public static void main(String[] args) {
		InIngresarProfesor ventana = new InIngresarProfesor();
		ventana.setVisible(true);
	}
	public InIngresarProfesor() {
		setTitle("Socios");
		getContentPane().setBackground(Color.GRAY);
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setBounds(100, 100, 925, 563);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingresar Profesor", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(10, 11, 460, 471);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			txtNombreP = new JTextField();
			txtNombreP.setBounds(101, 41, 304, 20);
			panel.add(txtNombreP);
			txtNombreP.setColumns(10);
			
			JLabel lblNombreP = new JLabel("Nombre");
			lblNombreP.setForeground(Color.WHITE);
			lblNombreP.setBounds(20, 44, 71, 14);
			panel.add(lblNombreP);
			
			txtDireccionP = new JTextField();
			txtDireccionP.setBounds(101, 221, 304, 20);
			panel.add(txtDireccionP);
			txtDireccionP.setColumns(10);
			
			txtCI_P = new JTextField();
			txtCI_P.setBounds(101, 130, 304, 20);
			panel.add(txtCI_P);
			txtCI_P.setColumns(10);
			
			JLabel lblCI_P = new JLabel("CI");
			lblCI_P.setForeground(Color.WHITE);
			lblCI_P.setBounds(20, 133, 46, 14);
			panel.add(lblCI_P);
			
			JLabel lblDireccionP = new JLabel("Direcci\u00F3n");
			lblDireccionP.setForeground(Color.WHITE);
			lblDireccionP.setBounds(20, 224, 71, 14);
			panel.add(lblDireccionP);
			
			JLabel lblTeléfonoP = new JLabel("Tel\u00E9fono");
			lblTeléfonoP.setForeground(Color.WHITE);
			lblTeléfonoP.setBounds(20, 314, 81, 14);
			panel.add(lblTeléfonoP);
			
			JLabel lblAsignaturaDictadaP = new JLabel("Asignatura que Dicta");
			lblAsignaturaDictadaP.setForeground(Color.WHITE);
			lblAsignaturaDictadaP.setBounds(20, 404, 168, 14);
			panel.add(lblAsignaturaDictadaP);
			
			txtTelefonoP = new JTextField();
			txtTelefonoP.setBounds(101, 311, 304, 20);
			panel.add(txtTelefonoP);
			txtTelefonoP.setColumns(10);
			
			txtAsignaturaQueDictaP = new JTextField();
			txtAsignaturaQueDictaP.setBounds(101, 429, 304, 20);
			panel.add(txtAsignaturaQueDictaP);
			txtAsignaturaQueDictaP.setColumns(10);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(480, 11, 419, 471);
			getContentPane().add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);		
			model.addColumn("Nombre");
			model.addColumn("C.I");
			model.addColumn("Direccion");
			model.addColumn("Telefono");
			model.addColumn("Asignatura que Dicta");
			table.setModel(model);
			panel_1.setBounds(0, 493, 909, 40);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(88, 11, 89, 23);
			panel_1.add(btnLimpiar);
			
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(539, 11, 89, 23);
			panel_1.add(btnRegistrar);
			
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(779, 11, 89, 23);
			panel_1.add(btnEliminar);
			
			btnSalir = new JButton("Salir");
			btnSalir.setBounds(314, 11, 89, 23);
			panel_1.add(btnSalir);
	}
		
		private void IniciarManejadorEventos() {		
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				try {
					Articulo_Profesores l;
					String Nombre = txtNombreP.getText();
					int CI = Integer.parseInt(txtCI_P.getText());
					String Direccion = txtDireccionP.getText();
					int Telefono = Integer.parseInt(txtTelefonoP.getText());
					String AsignaturaDictada = txtAsignaturaQueDictaP.getText();

					
					 l = new Articulo_Profesores(CI, Nombre, Direccion, Telefono, AsignaturaDictada);
					 pPr.adicionar(l);
					 JOptionPane.showMessageDialog(null, 
				    		   "Datos guardados ok","Mensaje ",
				    		   JOptionPane.INFORMATION_MESSAGE);
					
					model.setRowCount(0);
					for(int i=0; i < pPr.tamaño(); i++) {
						Object[] fila = {
								pPr.obtener(i).getNombreP(),
								pPr.obtener(i).getCI_P(),
								pPr.obtener(i).getDireccionP(),
								pPr.obtener(i).getTelefonoP(),
								pPr.obtener(i).getAsignaturaDictadaP()
						};
						model.addRow(fila);
					}
				}catch(Exception p)
					{
					JOptionPane.showMessageDialog(null, "Error!!, "
							+ "la cedula debe ser numerica  \n",
							"Error",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
			
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int fila = table.getSelectedRow();
					model.removeRow(fila);
				}
			});

			
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			
			btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtNombreP.setText(null);
					txtCI_P.setText(null);
					txtDireccionP.setText(null);
					txtTelefonoP.setText(null);
					txtAsignaturaQueDictaP.setText(null);
				}
			});
			
		}
	}



