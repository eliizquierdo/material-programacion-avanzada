package ej2;

import java.util.Scanner;

//a) (2 ptos) Dado el siguiente cabezal de un método:
//public static void pares(int nro){
//	//bloque de código
//}
//Completar el bloque de código para que muestre los pares  por pantalla
//desde el nro hasta el 100
//b) (1 pto) En el main, solicitar un número por teclado y llamar al método pares

public class Principal2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		int num1=teclado.nextInt();
		pares(num1);
	}

	public static void pares(int nro){
		for (int i = nro; i <= 100; i++) {
			if (i%2==0)
				System.out.print(i+" ");
			
		}
	}
}
