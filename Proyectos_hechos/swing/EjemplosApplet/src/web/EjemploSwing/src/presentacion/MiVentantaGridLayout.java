package presentacion;
/*********************************************************/
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.*;

public class MiVentantaGridLayout extends JFrame{
	private JLabel label1, label2, label3, label4;
	private JButton btnAceptar, btnCancelar;
		 
    public MiVentantaGridLayout(){
    	
    	setTitle("Mi ventana con GridLayout ");
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	iniciarComponentes();
    	
    }
    	
    	private void iniciarComponentes(){
    		
        	
        	getContentPane().setLayout(new GridLayout(3,2));
        	//creamos los componentes atómicos
        	label1 = new JLabel("Etiqueta1");
        	label2 = new JLabel("Etiqueta2");
        	label3 = new JLabel("Etiqueta3");
        	label4 = new JLabel("Etiqueta4");
        	btnAceptar = new JButton("Aceptar");
        	btnCancelar = new JButton("Cancelar");
        	//agregamos los componentes atómicos al panel
        	getContentPane().add(label1);
        	getContentPane().add(label2);
        	getContentPane().add(label3);
        	getContentPane().add(label4);
        	getContentPane().add(btnAceptar);
        	getContentPane().add(btnCancelar);
        
    }
    		
    public static void main(String[] args) {
    	MiVentantaGridLayout v=new MiVentantaGridLayout();
		v.setVisible(true);
		v.pack();
   }
}
