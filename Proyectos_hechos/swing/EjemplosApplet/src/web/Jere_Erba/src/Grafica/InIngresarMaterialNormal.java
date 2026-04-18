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

import static Grafica.FrmPrincipal.coleccion; //Importar coleccion1 normal
import static Grafica.FrmPrincipal.coleccion1;

import Logica.Articulo_Libro;
import Logica.Articulo_Normal;
import Logica.Libro;
import Logica.Normal;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	
public class InIngresarMaterialNormal extends JInternalFrame {
	private JTextField txtAutores;
	private JTextField txtCodigo;
	private JTextField txtTitulo;
	private JTable table;
	
	Normal pPr = new Normal();
	DefaultTableModel model = new DefaultTableModel();
	private final JPanel panel_1 = new JPanel();
	private JButton btnLimpiar;
	private JButton btnRegistrar;
	private JButton btnEliminar;
	private JButton btnSalir;


	public static void main(String[] args) {
		InIngresarMaterialNormal ventana = new InIngresarMaterialNormal();
		ventana.setVisible(true);
	}
	public InIngresarMaterialNormal() {
		setTitle("Material Normal");
		getContentPane().setBackground(Color.GRAY);
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setBounds(100, 100, 925, 376);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Agregar Material", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(10, 11, 460, 284);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			txtCodigo = new JTextField();
			txtCodigo.setBounds(101, 41, 304, 20);
			panel.add(txtCodigo);
			txtCodigo.setColumns(10);
			
			JLabel lblCodigo = new JLabel("C\u00F3digo");
			lblCodigo.setForeground(Color.WHITE);
			lblCodigo.setBounds(20, 44, 46, 14);
			panel.add(lblCodigo);
			
			txtAutores = new JTextField();
			txtAutores.setBounds(101, 221, 304, 20);
			panel.add(txtAutores);
			txtAutores.setColumns(10);
			
			txtTitulo = new JTextField();
			txtTitulo.setBounds(101, 130, 304, 20);
			panel.add(txtTitulo);
			txtTitulo.setColumns(10);
			
			JLabel lblTitulo = new JLabel("T\u00EDtulo");
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setBounds(20, 133, 46, 14);
			panel.add(lblTitulo);
			
			JLabel lblAutores = new JLabel("Autor/Es");
			lblAutores.setForeground(Color.WHITE);
			lblAutores.setBounds(20, 224, 46, 14);
			panel.add(lblAutores);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(480, 11, 419, 284);
			getContentPane().add(scrollPane);
			
			table = new JTable();
			scrollPane.setViewportView(table);		
			model.addColumn("Codigo");
			model.addColumn("Titulo");
			model.addColumn("Autor/Es");
			table.setModel(model);
			panel_1.setBounds(0, 306, 909, 40);
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
					int codigo = Integer.parseInt(txtCodigo.getText());
					String titulo = txtTitulo.getText();
					String autores = txtAutores.getText();
					int CantidadEjemplares = 0;
					Articulo_Normal b = new Articulo_Normal(codigo,titulo,autores,CantidadEjemplares);
					coleccion1.adicionar(b); //Se agrega al arraylist normal
					 JOptionPane.showMessageDialog(null, 
				    		   "Datos guardados ok","Mensaje ",
				    		   JOptionPane.INFORMATION_MESSAGE);
					model.setRowCount(0);
					for(int i=0; i < coleccion1.tamaño(); i++) {
						
						Object[] fila = {
								coleccion1.obtener(i).getCodigo(),
								coleccion1.obtener(i).getTitulo(),
								coleccion1.obtener(i).getAutores()
						};
						model.addRow(fila);
					}
				}catch(Exception p)
				{
					JOptionPane.showMessageDialog(null, "Error!!, "
							+ "El Codigo debe ser numerico, al igual que la Cantidad de Ejemplares\n",
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
					txtCodigo.setText(null);
					txtTitulo.setText(null);
					txtAutores.setText(null);
				}
			});
			
		}
	}
