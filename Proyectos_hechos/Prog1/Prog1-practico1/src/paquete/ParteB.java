package paquete;
import java.util.Scanner;
/*b) Pida por pantalla el largo y ancho y luego 
 * calcule y muestre en pantalla el área y perímetro del rectángulo 
 */
class ParteB {

public static void main(String[]args) {

Scanner entrada = new Scanner (System.in);

	double number1;
	System.out.print("Ingrese el ancho del rectangulo: ");
	number1 = entrada.nextDouble();

	double number2;
	System.out.print("Ingrese el largo del rectangulo: ");
	number2 = entrada.nextDouble();

	double resultado1 = number1 * number2;

	double resultado2;

	resultado2 = number1 * number2 * 2;

	System.out.println("El area de su rectangulo es =" + resultado1);

	System.out.println("y el perimetro es =" + resultado2);

	}
}
