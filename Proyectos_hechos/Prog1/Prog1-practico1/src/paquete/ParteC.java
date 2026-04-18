package paquete;
import java.util.Scanner;
/*c) Pida por pantalla un monto de dinero en pesos y el valor de 1 dolar,
 *  convierta los pesos a dolares, muestre el resultado en pantalla.
 */
public class ParteC {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner (System.in);
	
		double number1;
		System.out.print("Ingrese valor del peso: ");
		number1 = entrada.nextDouble();
	
		double number2;
		System.out.print("Ingrese valor del dolar: ");
		number2 = entrada.nextDouble();
	
		double resultado1;
	
		resultado1 = number1 / number2;
	
		System.out.println("El valor del dolar es =" + resultado1);
	}
}


