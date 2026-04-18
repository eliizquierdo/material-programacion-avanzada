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
import static Grafica.FrmPrincipal.coleccion1;
public class InListadosMaterialNormal extends JInternalFrame {
	
	private JPanel pnlCentral;
	private DefaultTableModel miModelo;	//modelo
	private JTable tablaMatNormal;	//tabla
	private JScrollPane scrPanel;//barra de desplazamiento
	private JButton btnActualizar;
	
	public static void main(String[] args) {
		InListadosAlumnos ventana = new InListadosAlumnos();
		ventana.setVisible(true);
	}
	public InListadosMaterialNormal() {
		setClosable(true);
		setBounds(600,0,400,800);//pos y tamaño
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setTitle("Listado de Material Normal");
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
		
			tablaMatNormal = new JTable();
			scrPanel.setViewportView(tablaMatNormal);
	       
			getContentPane().add(pnlCentral, BorderLayout.CENTER);
			pack();		
			String titulos[]={"Codigo", "Título", "Autores"};
			miModelo=new DefaultTableModel(null,titulos);
			tablaMatNormal.setModel(miModelo);
		}
		
		
		private void cargarTabla() {
			String fila[]=new String[miModelo.getColumnCount()];
	       	try{
		      	for(int i=0;i<coleccion1.cantidad();i++){
		      		fila[0] = String.valueOf(coleccion1.devolver(i).getCodigo());
		      		fila[1] = coleccion1.devolver(i).getTitulo();
		      		fila[2] = coleccion1.devolver(i).getAutores();
		      	    miModelo.addRow(fila);
		      	}
		      	tablaMatNormal.setModel(miModelo);
	       	}catch (Exception e) {
	       		System.out.println("error"+e);
	       	}
		}
	}
		
		
		


	
		
	
	


