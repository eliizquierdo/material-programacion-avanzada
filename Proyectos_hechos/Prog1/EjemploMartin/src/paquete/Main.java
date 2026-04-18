package paquete;
import java.util.Scanner;

public class Main {

	public static void main(String[] a) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingresa tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("ingresa tu edad: ");
		int edad = teclado.nextInt();

		System.out.println("tu nombre es " + nombre + "\ntu edad es " + edad);
	}

}
