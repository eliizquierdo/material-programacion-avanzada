package Grafica;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;


import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Caret;

import Logica.*;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import static Grafica.FrmPrincipal.coleccion2; 
import static Grafica.FrmPrincipal.coleccion1;
import static Grafica.FrmPrincipal.coleccion;

public class InPrestamos extends JInternalFrame {
	private JTable table;
	private JButton btnRealizarPrestamo;


	Libro pPr = new Libro();
	Articulo_Libro l = new Articulo_Libro();
	Prestamos b = new Prestamos();
	DefaultTableModel model = new DefaultTableModel();
	private JButton btnSalir;
	private JButton btnLimpiar;
	private JTextField txtCodigoISBNL;
	private JButton btnRegistrar;
	private JTextField txtTituloL;
	private JTextField txtAutoresL;
	private JTextField txtCantidadEjemplaresL;
	private JButton btnEliminar;
	
	public static void main(String[] args) {
		InPrestamos ventana = new InPrestamos();
		ventana.setVisible(true);
	}
	
	public InPrestamos() {
		setTitle("Prestamos");
		InciarManejadorEventos();
		IniciarComponentes();
	}

		private void InciarManejadorEventos() {
		// TODO Auto-generated method stub
			getContentPane().setBackground(Color.GRAY);
			setBounds(100, 100, 975, 529);
			getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos sobre el libro que desea retirar:", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(10, 11, 478, 183);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblCodigoISBN = new JLabel("Codigo ISBN");
			lblCodigoISBN.setForeground(Color.WHITE);
			lblCodigoISBN.setBounds(20, 105, 96, 14);
			panel.add(lblCodigoISBN);
			
			txtCodigoISBNL = new JTextField();
			txtCodigoISBNL.setBounds(126, 102, 315, 20);
			panel.add(txtCodigoISBNL);
			txtCodigoISBNL.setColumns(10);
			
			btnRealizarPrestamo = new JButton("Realizar Prestamo");
	
			btnRealizarPrestamo.setBounds(783, 455, 147, 23);
			getContentPane().add(btnRealizarPrestamo);
			
			btnSalir = new JButton("Salir");
			btnSalir.setBounds(447, 455, 89, 23);
			getContentPane().add(btnSalir);
			
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(498, 11, 451, 415);
			getContentPane().add(scrollPane);

			btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(34, 455, 89, 23);
			getContentPane().add(btnLimpiar);
			
			btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(667, 455, 89, 23);
			getContentPane().add(btnRegistrar);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Conoce algunos de estos datos sobre el libro?", TitledBorder.CENTER, TitledBorder.TOP, null, Color.WHITE));
			panel_1.setBackground(Color.DARK_GRAY);
			panel_1.setBounds(10, 205, 478, 221);
			getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblTituloL = new JLabel("T\u00EDtulo");
			lblTituloL.setForeground(Color.WHITE);
			lblTituloL.setBounds(37, 53, 46, 14);
			panel_1.add(lblTituloL);
			
			txtTituloL = new JTextField();
			txtTituloL.setBounds(162, 47, 292, 20);
			panel_1.add(txtTituloL);
			txtTituloL.setColumns(10);
			
			JLabel lblAutoresL = new JLabel("Autores");
			lblAutoresL.setForeground(Color.WHITE);
			lblAutoresL.setBackground(Color.WHITE);
			lblAutoresL.setBounds(37, 105, 46, 14);
			panel_1.add(lblAutoresL);
			
			txtAutoresL = new JTextField();
			txtAutoresL.setBounds(162, 102, 292, 20);
			panel_1.add(txtAutoresL);
			txtAutoresL.setColumns(10);
			
			JLabel lblCantidadEjemplaresL = new JLabel("Cantidad de Ejemplares");
			lblCantidadEjemplaresL.setForeground(Color.WHITE);
			lblCantidadEjemplaresL.setBackground(Color.WHITE);
			lblCantidadEjemplaresL.setBounds(10, 164, 145, 14);
			panel_1.add(lblCantidadEjemplaresL);
			
			txtCantidadEjemplaresL = new JTextField();
			txtCantidadEjemplaresL.setBounds(162, 161, 292, 20);
			panel_1.add(txtCantidadEjemplaresL);
			txtCantidadEjemplaresL.setColumns(10);
			
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(148, 455, 89, 23);
			getContentPane().add(btnEliminar);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			model.addColumn("Codigo ISBN");
			model.addColumn("Título");
			model.addColumn("Autores");
			model.addColumn("Cantidad de Ejemplares");
			table.setModel(model);
		}

		
		private void IniciarComponentes() {
			btnRegistrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				try {
					int codigoISBN = Integer.parseInt(txtCodigoISBNL.getText());
					String titulo = txtTituloL.getText();
					String autores = txtAutoresL.getText();
					int CantidadEjemplares = Integer.parseInt(txtCodigoISBNL.getText());
					
					
					Articulo_Libro b = new Articulo_Libro(codigoISBN, CantidadEjemplares, titulo, autores);
					coleccion.adicionar(b); //Se agrega al arraylist normal
					
					model.setRowCount(0);
					for(int i = 0; i < coleccion.tamaño(); i++)
					{
						Object[] fila = {
								coleccion.obtener(i).getCodigoISBN(),
								coleccion.obtener(i).getTitulo(),
								coleccion.obtener(i).getAutores(),
								coleccion.obtener(i).getCantEjemplares()
						};
						model.addRow(fila);
					}
				}catch(Exception p)
				{
					JOptionPane.showMessageDialog(null, "Error", "Error.exe", JOptionPane.WARNING_MESSAGE);
				}
				}
			});
			
			
			btnRealizarPrestamo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent p) {
					try {		
						Fecha fecha1;
						Fecha fecha2;
						DefaultTableModel modelo = (DefaultTableModel) table.getModel();
						if (table.getSelectedRow() != -1) {
							JOptionPane.showConfirmDialog(null, "¿Esta seguro de que Quiere pedir un libro?", "Confirmar prestamo",
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						
						    //no se porque no pasa de esta condicion. 
							
							System.out.println(txtCodigoISBNL);
							int ISBN1 = Integer.parseInt(txtCodigoISBNL.getText());
							fecha1 = new Fecha(02,11,2021);
							fecha2 = new Fecha(03,11,2021);
							
							if(coleccion.obtener(ISBN1).getCantEjemplares() == 0) {
								JOptionPane.showMessageDialog(null, "No hay mas libros", "Mnesaje", JOptionPane.INFORMATION_MESSAGE);
							}else
							{
								Articulo_Normal o = new Articulo_Normal();	
								coleccion.buscar(ISBN1);
								b.doPrestamo(o.getCodigo(), fecha1, fecha2, ISBN1);
									JOptionPane.showMessageDialog(null, "Prestamo realizado, tiene 1 semana para "
											+ "hacer la devolucion(?","Mensaje ", JOptionPane.INFORMATION_MESSAGE);
							
									int Resta;
									int codigoISBN = Integer.parseInt(txtCodigoISBNL.getText()); //tomo datos
									Resta = coleccion.buscar(codigoISBN).getCodigoISBN(); //se lo paso a la coleccion
									Resta = Resta - 1; // resto uno
									coleccion1.buscar(codigoISBN).setCantEjemplares(Resta);
							}
						}
					}catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int fila = table.getSelectedRow();
					model.removeRow(fila);
				}
			});
			
		
		
				btnLimpiar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							txtCodigoISBNL.setText(null);
						}
					});
		
			
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
}
				
				
				
	

					
				
			
		

			
				
		

		