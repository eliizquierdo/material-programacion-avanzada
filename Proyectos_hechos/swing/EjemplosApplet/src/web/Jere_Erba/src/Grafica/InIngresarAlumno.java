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
import Logica.Libro;
import Logica.Normal;
import Logica.Alumno;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import static Grafica.FrmPrincipal.coleccion3;

	
public class InIngresarAlumno extends JInternalFrame {
	private JTextField txtDireccionA;
	private JTextField txtNombreA;
	private JTextField txtCI_A;
	private JTable table;
	
	Alumno pPr = new Alumno();
	DefaultTableModel model = new DefaultTableModel();
	private final JPanel panel_1 = new JPanel();
	private JButton btnLimpiar;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JTextField txtTelefonoA;
	private JTextField txtGrupoA;


	public static void main(String[] args) {
		InIngresarMaterialNormal ventana = new InIngresarMaterialNormal();
		ventana.setVisible(true);
	}
	public InIngresarAlumno() {
		setTitle("Socios");
		getContentPane().setBackground(Color.GRAY);
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setBounds(100, 100, 925, 563);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ingresar Alumno", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 255, 255)));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(10, 11, 460, 471);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			txtNombreA = new JTextField();
			txtNombreA.setBounds(101, 41, 304, 20);
			panel.add(txtNombreA);
			txtNombreA.setColumns(10);
			
			JLabel lblNombreA = new JLabel("Nombre");
			lblNombreA.setForeground(Color.WHITE);
			lblNombreA.setBounds(20, 44, 46, 14);
			panel.add(lblNombreA);
			
			txtDireccionA = new JTextField();
			txtDireccionA.setBounds(101, 221, 304, 20);
			panel.add(txtDireccionA);
			txtDireccionA.setColumns(10);
			
			txtCI_A = new JTextField();
			txtCI_A.setBounds(101, 130, 304, 20);
			panel.add(txtCI_A);
			txtCI_A.setColumns(10);
			
			JLabel lblCI_A = new JLabel("CI");
			lblCI_A.setForeground(Color.WHITE);
			lblCI_A.setBounds(20, 133, 46, 14);
			panel.add(lblCI_A);
			
			JLabel lblDireccionA = new JLabel("Direcci\u00F3n");
			lblDireccionA.setForeground(Color.WHITE);
			lblDireccionA.setBounds(20, 224, 46, 14);
			panel.add(lblDireccionA);
			
			JLabel lblTeléfonoA = new JLabel("Tel\u00E9fono");
			lblTeléfonoA.setForeground(Color.WHITE);
			lblTeléfonoA.setBounds(20, 314, 46, 14);
			panel.add(lblTeléfonoA);
			
			JLabel lblGrupoA = new JLabel("Grupo");
			lblGrupoA.setForeground(Color.WHITE);
			lblGrupoA.setBounds(20, 404, 46, 14);
			panel.add(lblGrupoA);
			
			txtTelefonoA = new JTextField();
			txtTelefonoA.setBounds(101, 311, 304, 20);
			panel.add(txtTelefonoA);
			txtTelefonoA.setColumns(10);
			
			txtGrupoA = new JTextField();
			txtGrupoA.setBounds(101, 401, 304, 20);
			panel.add(txtGrupoA);
			txtGrupoA.setColumns(10);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(480, 11, 419, 471);
			getContentPane().add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);		
			model.addColumn("Nombre");
			model.addColumn("C.I");
			model.addColumn("Direccion");
			model.addColumn("Telefono");
			model.addColumn("Grupo");
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
					Articulo_Alumno p;
					String Nombre = txtNombreA.getText();
					int CI = Integer.parseInt(txtCI_A.getText());
					String Direccion = txtDireccionA.getText();
					int Telefono = Integer.parseInt(txtTelefonoA.getText());
					int Grupo = Integer.parseInt(txtGrupoA.getText());

					
					 p = new Articulo_Alumno(CI, Nombre, Direccion, Telefono, Grupo);
					 coleccion3.adicionar(p);
					 JOptionPane.showMessageDialog(null, 
				    		   "Datos guardados ok","Mensaje ",
				    		   JOptionPane.INFORMATION_MESSAGE);
					
					model.setRowCount(0);
					for(int i=0; i < coleccion3.tamaño(); i++) {
						Object[] fila = {
								coleccion3.obtener(i).getNombreA(),
								coleccion3.obtener(i).getCi_A(),
								coleccion3.obtener(i).getDireccionA(),
								coleccion3.obtener(i).getTelefonoA(),
								coleccion3.obtener(i).getGrupoA()	
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
					txtNombreA.setText(null);
					txtCI_A.setText(null);
					txtDireccionA.setText(null);
					txtTelefonoA.setText(null);
					txtGrupoA.setText(null);
				}
			});
			
		}
	}


