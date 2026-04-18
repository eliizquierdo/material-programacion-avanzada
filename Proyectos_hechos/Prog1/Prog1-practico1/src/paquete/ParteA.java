package paquete;
import java.util.Scanner;
/*a) Pida por pantalla la base y altura de un triángulo y 
 * luego calcule y muestre en pantalla el área del mismo
 */
public class ParteA {

public static void main(String[]args) {

	Scanner entrada = new Scanner (System.in);

	int number1;
	System.out.print("Ingrese la altura del triangulo : ");
	number1 = entrada.nextInt();

	int number2;
	System.out.print("Ingrese la base del triangulo : ");
	number2 = entrada.nextInt();

	int resultado;

	resultado = number1 * number2 / 2;

	System.out.println("El area de su triangulo es =" + resultado);

	}
}
