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
import static Grafica.FrmPrincipal.coleccion4;
public class InListadosProfesores extends JInternalFrame {
	
	private JPanel pnlCentral;
	private DefaultTableModel miModelo;	//modelo
	private JTable tablaProfesores;	//tabla
	private JScrollPane scrPanel;//barra de desplazamiento
	private JButton btnActualizar;
	
	public static void main(String[] args) {
		InListadosProfesores ventana = new InListadosProfesores();
		ventana.setVisible(true);
	}
	public InListadosProfesores() {
		setClosable(true);
		setBounds(600,0,518,459);//pos y tamaño
		IniciarComponentes();
		IniciarManejadorEventos();
	}
		
		private void IniciarComponentes() {
			setTitle("Listado de Profesores");
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
		
			tablaProfesores = new JTable();
			scrPanel.setViewportView(tablaProfesores);
	       
			getContentPane().add(pnlCentral, BorderLayout.CENTER);
			pack();		
			String titulos[]={"Nombre", "Cedula", "Direccion", "Telefono", "Asignatura que Dicta"};
			miModelo=new DefaultTableModel(null,titulos);
			tablaProfesores.setModel(miModelo);
		}
		
		
		private void cargarTabla() {
			String fila[]=new String[miModelo.getColumnCount()];
	       	try{
		      	for(int i=0;i<coleccion4.cantidad();i++) {
		      		fila[0]= coleccion4.devolver(i).getNombreP();
		      		fila[1]= coleccion4.devolver(i).getDireccionP();
		      		fila[2]= coleccion4.devolver(i).getAsignaturaDictadaP();
		      		fila[3]= String.valueOf(coleccion4.devolver(i).getCI_P());
		      		fila[4]= String.valueOf(coleccion4.devolver(i).getTelefonoP());
		      	    miModelo.addRow(fila);
		      	}
		        tablaProfesores.setModel(miModelo);
	       	}catch (Exception e) {
	       		System.out.println("error"+e);
	       	}
		}
	}
		
		
		


	
		
	
	


