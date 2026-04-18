package Grafica;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.*;
import static Grafica.FrmPrincipal.coleccion; //Importar coleccion libro
import static Grafica.FrmPrincipal.coleccion1;

//import static Grafica.FrmPrincipal.coleccion;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;




public class InIngresarMaterialLibro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTituloL;
	private JTextField txtAutoresL;
	private JTextField txtCodigoISBNL;
	private JTextField txtCantidadEjemplaresL;
	private JButton btnRegistrar;
	private JButton btnLimpiar;
	private JPanel panel;
	private JTable table;
	private JButton btnEliminar;

	Libro pPr = new Libro();
	Articulo_Libro l = new Articulo_Libro();
	Prestamos b = new Prestamos();
	DefaultTableModel model = new DefaultTableModel();
	private JButton btnSalir;

	
	public static void main(String[] args) {
		InIngresarMaterialLibro ventana = new InIngresarMaterialLibro();
		ventana.setVisible(true);
	}	
	public InIngresarMaterialLibro() {
		IniciarComponentes();
		IniciarManejadorEventos();
	}


		private void IniciarComponentes() {
			setTitle("Libros");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 998, 565);
			contentPane = new JPanel();
			contentPane.setBackground(SystemColor.activeCaption);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JPanel pnlLibro = new JPanel();
			pnlLibro.setBorder(new TitledBorder(null, "Agregar Libro", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
			pnlLibro.setBackground(Color.DARK_GRAY);
			pnlLibro.setBounds(10, 11, 480, 468);
			contentPane.add(pnlLibro);
			pnlLibro.setLayout(null);
			
			JLabel lblTitulo = new JLabel("T\u00EDtulo");
			lblTitulo.setForeground(Color.WHITE);
			lblTitulo.setBounds(21, 115, 137, 14);
			pnlLibro.add(lblTitulo);
			
			txtTituloL = new JTextField();
			txtTituloL.setBounds(182, 112, 246, 20);
			pnlLibro.add(txtTituloL);
			txtTituloL.setColumns(10);
			
			JLabel lblAutores = new JLabel("Autor/Es");
			lblAutores.setForeground(Color.WHITE);
			lblAutores.setBackground(Color.WHITE);
			lblAutores.setBounds(21, 196, 166, 14);
			pnlLibro.add(lblAutores);
			
			txtAutoresL = new JTextField();
			txtAutoresL.setBounds(182, 193, 246, 20);
			pnlLibro.add(txtAutoresL);
			txtAutoresL.setColumns(10);
			
			JLabel lblCodigISBN = new JLabel("C\u00F3digo ISBN");
			lblCodigISBN.setForeground(Color.WHITE);
			lblCodigISBN.setBounds(21, 277, 166, 14);
			pnlLibro.add(lblCodigISBN);
			
			txtCodigoISBNL = new JTextField();
			txtCodigoISBNL.setBounds(182, 274, 246, 20);
			pnlLibro.add(txtCodigoISBNL);
			txtCodigoISBNL.setColumns(10);
			
			JLabel lblCantidadEjemplares = new JLabel("Cantidad de \r\n  Ejemplares");
			lblCantidadEjemplares.setForeground(Color.WHITE);
			lblCantidadEjemplares.setBounds(21, 344, 197, 39);
			pnlLibro.add(lblCantidadEjemplares);
			
			txtCantidadEjemplaresL = new JTextField();
			txtCantidadEjemplaresL.setBounds(182, 353, 246, 20);
			pnlLibro.add(txtCantidadEjemplaresL);
			txtCantidadEjemplaresL.setColumns(10);
			
			panel = new JPanel();
			panel.setBounds(0, 490, 982, 36);
			contentPane.add(panel);
			panel.setLayout(null);
			
			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(41, 11, 157, 23);
			panel.add(btnLimpiar);
			
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(492, 11, 157, 23);
			panel.add(btnRegistrar);
			
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(771, 11, 157, 23);
			panel.add(btnEliminar);
			
			btnSalir = new JButton("Salir");
			btnSalir.setBounds(259, 11, 157, 23);
			panel.add(btnSalir);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(500, 10, 461, 468);
			contentPane.add(scrollPane);
			
		
			table = new JTable();
			scrollPane.setViewportView(table);
			model.addColumn("Título");
			model.addColumn("Código ISBN");
			model.addColumn("Autor/Es");
			model.addColumn("Cantidad de ejemplares");
			table.setModel(model);
	}
		
		private void IniciarManejadorEventos() {		
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						int codigoISBN = Integer.parseInt(txtCodigoISBNL.getText());
						int CantidadEjemplares = Integer.parseInt(txtCantidadEjemplaresL.getText());
						String titulo = txtTituloL.getText();
						String autores = txtAutoresL.getText();
						Articulo_Libro a = new Articulo_Libro(codigoISBN,CantidadEjemplares,titulo,autores);
						coleccion.adicionar(a); //Se agrega al arraylist libro
						JOptionPane.showMessageDialog(null, 
					    		   "Datos guardados ok","Mensaje ",
					    		   JOptionPane.INFORMATION_MESSAGE);
						model.setRowCount(0);
						for(int i=0; i < coleccion.tamaño(); i++) {
							
							Object[] fila = {
									coleccion.obtener(i).getTitulo(),
									coleccion.obtener(i).getCodigoISBN(),
									coleccion.obtener(i).getAutores(),
									coleccion.obtener(i).getCantEjemplares()
							};
							model.addRow(fila);
						}
				
				}catch(Exception p)
					{
					JOptionPane.showMessageDialog(null, "Error!!, "
							+ "El Codigo ISBN debe ser numerico, al igual que la Cantidad de Ejemplares \n",
							"Error",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			
					
			btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//textos de Libros
					txtTituloL.setText(null);
					txtAutoresL.setText(null);
					txtCodigoISBNL.setText(null);
					txtCantidadEjemplaresL.setText(null);
				}
			});
			
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int fila = table.getSelectedRow();
					model.removeRow(fila);
				}
			});
		}
}		
		



