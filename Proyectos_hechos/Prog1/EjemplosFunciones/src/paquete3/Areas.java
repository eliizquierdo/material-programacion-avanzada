package paquete3;
//https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-metodos-y-funciones-de-java/

/*Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla

Aquí te mostramos que necesita cada figura:

Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado*/

import javax.swing.JOptionPane;
	
public class Areas {
	    public static void main(String[] args) {
	        //Declaramos esta variable para reutilizarla y no tener que declarar tantas variables
	        String texto="";
	        //Declaramos esta variable para mostrar al final el resultado
	        double resultado=0;
	        String eleccion=JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
	        switch (eleccion){
	        //Segun la figura realizamos una serie de acciones
	        case "circulo":
	            texto=JOptionPane.showInputDialog("Introduce el radio");
	            int radio=Integer.parseInt(texto);
	            resultado=areaCirculo(radio);
	            break;
	        case "triangulo":
	            texto=JOptionPane.showInputDialog("Introduce la base");
	            int base=Integer.parseInt(texto);
	            texto=JOptionPane.showInputDialog("Introduce la altura");
	            int altura=Integer.parseInt(texto);
	            resultado=areaTriangulo(base, altura);
	            break;
	        case "cuadrado":
	            texto=JOptionPane.showInputDialog("Introduce la medida de un lado");
	            int lado=Integer.parseInt(texto);
	            resultado=areaCuadrado(lado);
	            break;
	        default:
	            System.out.println("No has introducido una figura correcta");
	        }
	        System.out.println("El area del "+eleccion+" es "+resultado);
	   }
	   public static double areaCirculo (int radio){
	        return Math.pow(radio, 2)*Math.PI;
	    }
	   public static double areaTriangulo (int base, int altura){
	        return base*altura/2;
	    }
	   public static double areaCuadrado (int lado){
	        return lado*lado;
	    }
}


