package paquete;

import java.util.Scanner;

public class ej {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double a, b, c, resultado;
		double area;
		
		System.out.println("Ingrese el lado:");
		a=teclado.nextInt();
		area=a*a;
		System.out.println("El área del cuadrado es: "+area);
	}//fin del main
}//fin de la clase
