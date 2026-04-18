package grafica;

import javax.swing.*;

import logica.*;

import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame{
	
	//creación de la colección de Personas
	public static ListaPersonas coleccion = new ListaPersonas();
    
	private JMenuBar mnbPrincipal = new JMenuBar(); //Barra de menus
	private JPanel contentPane;
    private JDesktopPane desktopPane;
	private  JMenu jMenuPersonas;
    // opciones del menu Personas
    private JMenuItem itemAlta;
    private JMenuItem itemBuscar;
    private JMenuItem itemVer;
    
    //constructor
    public MenuPrincipal() {        
    	setTitle("Menu Principal Personas");
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setResizable(false);
    	this.setBounds(0,0,1200,700);
    	contentPane = new JPanel();
    	setContentPane(contentPane);
		contentPane.setLayout(null);
        iniciarComponentes();
        iniciarManejadoresEventos();
      
                     
    }
    
    private void iniciarComponentes() {
    	    	
    	//barra de menú principal
    	mnbPrincipal = new JMenuBar();
    	//Menú Personas
        jMenuPersonas = new  JMenu("Personas");
        //opciones de menú Personas
        itemAlta = new  JMenuItem("Agregar Persona");
        itemBuscar = new  JMenuItem("Buscar Persona");
        itemVer= new  JMenuItem("Ver Personas");
                
        //agregamos los itemMenú  al menú
        jMenuPersonas.add(itemAlta);
        jMenuPersonas.add(itemBuscar);
        jMenuPersonas.add(itemVer);
        
        //agregamos el menú Personas a la barra de menú
        mnbPrincipal.add(jMenuPersonas);
        
        //colocamos el menú principal en el JFrame
        setJMenuBar(mnbPrincipal);
        
      //creación del desktopPane para manejar los JInternalFrame
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(153, 0, 0));
		desktopPane.setBounds(0, 22, 1200, 678); 	//pos y tam
		contentPane.add(desktopPane);
               
    }

   
    private void iniciarManejadoresEventos() {
    	itemAlta.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    	    AgregarPersona altaPer = new AgregarPersona(); 
	    		altaPer.setVisible(true);
	    		desktopPane.add(altaPer);
	    	}
    	});
    
    	itemBuscar.addActionListener(new ActionListener() {
    	    	public void actionPerformed(ActionEvent arg0) {	
		    		BuscarPersona busPer = new BuscarPersona(); 
		    		busPer.setVisible(true);
		    		desktopPane.add(busPer);
    	    	}
    	});
    	
    	itemVer.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {	
				VerPersonasTabla tablaPer = new VerPersonasTabla(); 
				tablaPer.setVisible(true);
				desktopPane.add(tablaPer);
    		}
    	});
	  	
    }
    
   
    public static void main(String args[]) {
    	
    	MenuPrincipal m=new MenuPrincipal();
    	m.setVisible(true);
    }

	
	
}
