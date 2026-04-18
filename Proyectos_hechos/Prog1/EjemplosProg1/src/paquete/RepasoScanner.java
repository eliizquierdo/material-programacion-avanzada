package paquete;
import java.util.Scanner;

public class RepasoScanner {
	
	    public static void main(String[] args) {
	        // Crear el objeto Scanner
	        Scanner scanner = new Scanner(System.in);

	        // Leer una cadena de texto
	        System.out.print("Introduce tu nombre: ");
	        String nombre = scanner.nextLine();
	        System.out.println("Hola, " + nombre);

	        // Leer un entero
	        System.out.print("Introduce tu edad: ");
	        int edad = scanner.nextInt();
	        System.out.println("Tienes " + edad + " años.");

	        // Leer un número decimal
	        System.out.print("Introduce tu altura en metros: ");
	        double altura = scanner.nextDouble();
	        System.out.println("Mides " + altura + " metros.");

	        }
	}
