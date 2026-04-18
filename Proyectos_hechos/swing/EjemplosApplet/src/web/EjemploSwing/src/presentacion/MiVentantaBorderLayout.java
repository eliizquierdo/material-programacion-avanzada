package presentacion;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class MiVentantaBorderLayout extends JFrame {
	private JButton btnSur;
	private JButton btnIzquierdo;
	private JButton btnDerecho;
	private JLabel lblCentral;
	private JTextField txtSuperior;
	
		public MiVentantaBorderLayout() {
			iniciarComponentes();
		}
   
    	private void iniciarComponentes(){
    		setTitle("Mi ventana con BorderLayout ");
        	setLocationRelativeTo(null);
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	getContentPane().setLayout(new BorderLayout(0, 0));
        	
        	btnSur = new JButton("Botón sur");
        	getContentPane().add(btnSur, BorderLayout.SOUTH);
        	
        	btnIzquierdo = new JButton("Botón izquierdo");
        	getContentPane().add(btnIzquierdo, BorderLayout.WEST);
        	
        	btnDerecho = new JButton("Botón derecho");
        	getContentPane().add(btnDerecho, BorderLayout.EAST);
        	
        	lblCentral = new JLabel("Etiqueta central");
        	getContentPane().add(lblCentral, BorderLayout.CENTER);
        	
        	txtSuperior = new JTextField();
        	txtSuperior.setText("Caja de texto superior");
        	getContentPane().add(txtSuperior, BorderLayout.NORTH);
        	txtSuperior.setColumns(10);
    }
    		
    public static void main(String[] args) {
    	MiVentantaBorderLayout v=new MiVentantaBorderLayout();
		v.setVisible(true);
		v.pack();
	}
}      
