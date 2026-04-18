package web;

/** Este es un applet muy sencillo */
import java.applet.Applet;
import javax.swing.JApplet ;
import java.awt.Graphics;


public class MiApplet extends JApplet {
	 public void paint (Graphics g) {
		 g.drawString( "Ejemplo de applet en java", 25, 25 ) ;
	 }
}