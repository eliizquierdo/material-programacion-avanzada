package paquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	      
	      int x;
	      Scanner teclado=new Scanner(System.in); 
	      System.out.println("-------------Ejercicio 1-------------");
	      System.out.println("Ingrese un nro: ");
	      x=teclado.nextInt();
	      int digitos=cantDigitos(x);
	      System.out.println("El numero tiene " + digitos + " digitos"); 
	      System.out.println("-------------Ejercicio 2-------------");
	      System.out.println("El producto de los nros ingresados es: "+ multiplicarN());

	   }

	//Realizar un método llamado cantDigitos que recibe un entero y retorna la cantidad de digitos que dicho nro tiene
	private static int cantDigitos(int x) {
		int cant=0;
		 do{ 
	          x = x / 10; 
	          cant++; 
	       }while (x > 0); 
		return cant;
	}

	//Realizar un método llamado multiplicarN que pida números hasta que se ingrese 1
	//y retorne el producto de todos ellos.
	
	private static int multiplicarN() {
		Scanner teclado=new Scanner(System.in); 
		int resul=1;
		int x=1;
		
		  do {			  
			  System.out.println("Ingrese un nro: ");
			  x=teclado.nextInt();
			  resul=resul*x;
		  }while (x!=1);
		  return resul;
		  
	}
	
	/*
	
	/*1. Solicitar por teclado el radio de la esfera (dato real).
	2. En el caso de que el radio sea menor o igual que 0, muestre por pantalla el mensaje:
		"ERROR: El radio debe ser mayor que cero."
		3. Repetir los pasos 1 y 2, mientras que, el radio introducido sea incorrecto.
		4. Calcular el área de la esfera
		5. Mostrar por pantalla:
		"El área de una esfera de radio <radio> es: <área>".
		Nota 1: Área de una esfera = 4 * pi * radio2*/
	
	
	
}


