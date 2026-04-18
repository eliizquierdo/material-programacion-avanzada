package Grafica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Logica.Articulo_Libro;
import static Grafica.FrmPrincipal.coleccion;
public class InListadosLibros extends JInternalFrame {
	
	private JPanel pnlCentral;
	private DefaultTableModel miModelo;	//modelo
	private JTable tablaLibros;	//tabla
	private JScrollPane scrPanel;//barra de desplazamiento
	private JButton btnActualizar;
	
	public static void main(String[] args) {
		InListadosAlumnos ventana = new InListadosAlumnos();
		ventana.setVisible(true);
	}
	public InListadosLibros() {
		setClosable(true);
		setBounds(600,0,400,800);//pos y tamaño
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setTitle("Listado de Libros");
			setResizable(true);
			/*Instanciamos un panel y le aplicamos BorderLayout */
			pnlCentral =new JPanel();
			pnlCentral.setLayout(new BorderLayout());
			//instanciamos un botón 
			btnActualizar = new JButton("Actualizar Listado");
			getContentPane().add(btnActualizar, BorderLayout.SOUTH);
			Iniciartabla();
	}
		
			
		
		private void IniciarManejadorEventos() {
			btnActualizar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					cargarTabla();
				}
			});
		}
		
		private void Iniciartabla() {
			scrPanel = new JScrollPane();
			pnlCentral.add(scrPanel, BorderLayout.CENTER);
		
			tablaLibros = new JTable();
			scrPanel.setViewportView(tablaLibros);
	       
			getContentPane().add(pnlCentral, BorderLayout.CENTER);
			pack();		
			String titulos[]={"Nombre", "Autores", "Codigo ISBN", "Cantidad de Ejemplares"};
			miModelo=new DefaultTableModel(null,titulos);
			tablaLibros.setModel(miModelo);
		}
		
		
		private void cargarTabla() {
			String fila[]=new String[miModelo.getColumnCount()];
	       	try{
		      	for(int i=0;i<coleccion.cantidad();i++){
		      		fila[0] = coleccion.devolver(i).getTitulo();
		      		fila[1] = String.valueOf(coleccion.devolver(i).getCodigoISBN());
		      		fila[2] = coleccion.devolver(i).getAutores();
		      		fila[3] = String.valueOf(coleccion.devolver(i).getCantEjemplares());
		      	    miModelo.addRow(fila);
		      	}
		        tablaLibros.setModel(miModelo);
	       	}catch (Exception e) {
	       		System.out.println("error"+e);
	       	}
		}
	}
		
		
		


	
		
	
	


