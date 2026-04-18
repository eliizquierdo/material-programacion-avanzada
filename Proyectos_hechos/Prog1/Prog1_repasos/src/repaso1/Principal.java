package repaso1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			int edad;
			char genero;
			String nombre;
			float altura;


			System.out.println("Esto es una plantilla de estudiante \n");
			System.out.println("Completa la tabla \n");
			System.out.println("Edad: ");
			edad = sc.nextInt();
			System.out.println("Nombre: "); 
			nombre =sc.next();
			System.out.println("Altura: (utilice ',' para los decimales)");
			altura = sc.nextFloat();
			System.out.println("género (M o F):");
			genero =sc.next().charAt(0);
			boolean resultado = edad <= 18;
			boolean esM = genero=='M' || genero =='m';
			System.out.println("\n===================================\n");
			System.out.println("Resultados del estudiante: \n");
			System.out.println("Su nombre es :" + nombre);
			System.out.println("Su edad es de: " +  edad);
			System.out.println("Su altura es de: "+ altura);
			System.out.println("¿ El estudiante es menor? " + resultado);
			System.out.println("¿Su género es masculino?" + esM);
		}
		
	
}
