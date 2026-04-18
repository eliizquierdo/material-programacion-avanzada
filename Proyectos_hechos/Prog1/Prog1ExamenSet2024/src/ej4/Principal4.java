package ej4;

import java.util.Scanner;

//Realizar un programa que  pida números por teclado
//hasta ingresar el número 0. 
//Mostrar en pantalla  la suma de  números negativos ingresados

public class Principal4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=1, totalNegativos=0;
		
		while (numero!=0) {
			System.out.println("Ingrese números, termine con 0: ");
			numero=teclado.nextInt();
			if (numero<0)
				totalNegativos=totalNegativos+numero;
		
	}
	System.out.println("Total de negativos: "+totalNegativos);
}
		

}
