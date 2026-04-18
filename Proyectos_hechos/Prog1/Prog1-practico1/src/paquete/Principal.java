package paquete;
import java.util.Scanner;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random azar = new Random();
		int moneda= azar.nextInt(2);
		System.out.println("Moneda: "+moneda);
		int dado = azar.nextInt(6)+1;
		System.out.println("Dado: "+dado);
			
		/*int num1, num2, num3, resultado;
		System.out.print("Ingrese número 1: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese número 2: ");
		num2 = teclado.nextInt();
		System.out.print("Ingrese número 3: ");
		num3 = teclado.nextInt();
		resultado = num1 + num2 + num3;
		System.out.print("El resultado de la suma es: " + resultado);
		*/

	}

}
