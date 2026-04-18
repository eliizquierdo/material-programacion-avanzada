package vista;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame  implements ActionListener{
    
	//lo único que contendrá este JFrame será la barra de menú
	
	//**************************************************		
	private JMenuBar mnbPrincipal = new JMenuBar(); //Barra de menus
	//**************************************************
	
	//menu 
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
    	this.setBounds(200, 50,600,500);
        iniciarComponentes();
      
                     
    }
    
    private void iniciarComponentes() {
    	    	
    	//barra de menú principal
    	mnbPrincipal = new JMenuBar();
    	
    	//Menú Personas
        jMenuPersonas = new  JMenu("Personas");
               
        //opciones de menú Personas
        itemAlta = new  JMenuItem("Agregar Persona");
        itemAlta.addActionListener(this);
        
        itemBuscar = new  JMenuItem("Buscar Persona");
        itemBuscar.addActionListener(this);
        
        itemVer= new  JMenuItem("Ver Personas");
        itemVer.addActionListener(this);
        
        //agregamos los itemMenú  al menú
        jMenuPersonas.add(itemAlta);
        jMenuPersonas.add(itemBuscar);
        jMenuPersonas.add(itemVer);
        
        //agregamos el menú Alumnos a la barra de menú
        mnbPrincipal.add(jMenuPersonas);
        
        //colocamos el menú principal en el JFrame
        setJMenuBar(mnbPrincipal);
       
        
    }

   
       
    @Override
	public void actionPerformed(ActionEvent e) {
    	if (e.getSource()==itemAlta){
    		
    		AgregarPersona altaPer = new AgregarPersona(); 
    		altaPer.setVisible(true);
    	}
    	if (e.getSource()==itemBuscar){
			
    		BuscarPersona busPer = new BuscarPersona(); 
    		busPer.setVisible(true);
    	}
    	if (e.getSource()==itemVer){
    		
			VerPersonasTabla tablaPer = new VerPersonasTabla(); 
			tablaPer.setVisible(true);
    		
    		
    	}
	  	
    }
    
   
    public static void main(String[] args){
		MenuPrincipal mp=new MenuPrincipal();
		mp.setVisible(true);
		
	}
}
