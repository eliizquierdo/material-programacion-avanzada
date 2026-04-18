package presentacion;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

	public class MiVentanaFlowLayout extends JFrame {
		//definimos todos los componentes como atributos de la clase
		private JPanel panel1;
		private JPanel panel2;
		private JLabel label1;
		private JTextField texto;
		private JButton button1;
		private JButton button2;
	
		 
	    public MiVentanaFlowLayout(){
	    	iniciarComponentes();
	    }
	    	
	    private void iniciarComponentes(){
		    	setTitle("Mi ventana con FlowLayout");
		    	setLocationRelativeTo(null);
		    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		    	//creamos los paneles y los agegamos a la ventana
	    		panel1=new JPanel();
	    		getContentPane().add(panel1);	
	    		panel2=new JPanel();
	    		getContentPane().add(panel2);
	    		/*OJO: el JPanel por defecto tiene un  FlowLayout definido así que no es necesario definir ninguno pues es el que usaremos en este caso.*/
	    		
	    		/*se aplica un color de fondo para distinguir los JPanel del JFJrame,
	    		y entre ellos, este método pertenece al paquete  java.awt*/
	        	panel1.setBackground(Color.YELLOW);	
	        	panel2.setBackground(Color.	GREEN);	
	        	
	        	//definimos los componentes atómicos
	        	label1 = new JLabel("Primer Label");
	        	texto = new JTextField(10);
	        	button1 = new JButton("Botón1");
	        	button2 = new JButton("Botón2");
	        	panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	        	
	        	
	        	//agregamos los componentes a los paneles correspondientes 
	        	panel1.add(label1);
	        	panel1.add(texto);
	        	panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	        	
	        	panel2.add(button1);
	        	panel2.add(button2);
	    }
	    		
	    public static void main(String[] args) {
			MiVentanaFlowLayout v=new MiVentanaFlowLayout();
			v.setVisible(true);
			v.pack(); 
	
	   }
	}
