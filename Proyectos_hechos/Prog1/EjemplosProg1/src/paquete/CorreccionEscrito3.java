package paquete;

import java.util.Scanner;

public class CorreccionEscrito3 {
	public static void main(String[] args) { 
		 System.out.println("Ingrese el 1° numero");//1------
			Scanner teclado = new Scanner(System.in);
			int a=teclado.nextInt(); //--------
			System.out.println("Ingrese el 2° numero");//-------
			int b=teclado.nextInt();
			if (a==b)//-----------
				System.out.println("los numeros son iguales");//---
			else{
				if (a>b)
					System.out.println("El primer número es mayor que el segundo");
				else 
					System.out.println("El primer número no es mayor que el segundo");
			  }
			}//main
}//clase