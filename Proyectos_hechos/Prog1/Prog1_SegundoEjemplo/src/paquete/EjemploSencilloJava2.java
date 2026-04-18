package paquete;
// 1) Realizar un programa en el que se pidan tres números 
//para las variables enteras A, B y C, y visualizar 
//el resultado correspondiente a la operación:
// (A/B) + (C/A) – (B/C).

import java.util.Scanner;

public class EjemploSencilloJava2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C;
		double resultado;
		final double pi=3.1416;//constante
		double area;
		
		System.out.println("Ingrese el valor para A: ");
		A=teclado.nextInt();
		System.out.println("Ingrese el valor para B: ");
		B=teclado.nextInt();
		System.out.println("Ingrese el valor para C: ");
		C=teclado.nextInt();
		resultado=(A/B) + (C/A) - (B/C);
		System.out.println("El resultado de la operación es:" + resultado);
		
		//Calcule el área del circulo de radio A,
		//recuerde que el área del círculo = PI * radio * radio (radio al cuadrado)
		area=pi*A*A;
		System.out.println("El área del círculo es: "+area);
		
	}//fin del main

}//fin de la clase
