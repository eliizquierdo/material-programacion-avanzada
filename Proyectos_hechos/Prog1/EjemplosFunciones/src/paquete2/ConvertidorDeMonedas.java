package paquete2;
/*Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, 
 * estas pueden ser a dolares, yenes o libras. 
 * El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena,
 *  este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
El cambio de divisas son:

0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 € 
 */
import javax.swing.JOptionPane;
	
public class ConvertidorDeMonedas {
	    public static void main(String[] args) {
	        String texto=JOptionPane.showInputDialog("Escribe una cantidad en euros");
	        double cantidad=Double.parseDouble(texto);
	        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
	        double resul=conversor(cantidad, moneda);
	        //System.out.println(cantidad+ " convertido a dolares es: " +moneda+ " son " +resul);
	        JOptionPane.showMessageDialog(null, cantidad+" convertido a dolares es: "+ resul);
	        
	    }
	    
	   public static double conversor (double cantidad, String moneda){
	        double res=0;
	 
	        //Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de moneda correcto
	        boolean correcto = true;
	       	 
	        //Segun la moneda, calculamos la cantidad
	        switch (moneda){
	        case "libras":
	            res=cantidad*0.86;
	            break;
	        case "dolares":
	            res=cantidad*1.29;
	            break;
	        case "yenes":
	            res=cantidad*129.852;
	            break;
	        default:
	            System.out.println("No has introducido una moneda correcta");
	            correcto=false;
	        }
	 
	        //Solo si es correcto muestra el mensaje
	        if (correcto){
	          	return res;
	            
	        }
	        return 0;
	 
	    }
	}
