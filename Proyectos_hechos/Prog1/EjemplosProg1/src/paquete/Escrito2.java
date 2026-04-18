package paquete;

import java.util.Scanner;
import java.util.Random;

public class Escrito2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//--------------------------------1-------------------------------
		/* 	System.out.println("Ingrese un mes entre 1 y 12:");
		int mes=teclado.nextInt();
				
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(31);
				break;
			case 4: case 6: case 9 : case 11:
				System.out.println(30);
				break;
			case 2:
				System.out.println(28);
				break;
			default:
				System.out.println("Mes inexistente");
		}
		
		//--------------------------------2-------------------------------
		       Random random = new Random();
		        int cara=0, cruz=0;
		        int numero=0;
		        for (int i = 0; i<10; i++) {
		            numero = random.nextInt(2);
		            
		            System.out.println(" Cara (0) o cruz (1)");
		            if (numero==0)
		                cara++;
		            else
		            	cruz++;
		        }   
		  */
		//--------------------------------3-------------------------------
		System.out.println("Ingrese un mes entre 1 y 12:");
		int mes=teclado.nextInt();
		System.out.println("Ingrese un dia entre 1 y 31:");
		int dia=teclado.nextInt();		
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if (dia>=1 && dia <=31)
					System.out.println("Fecha valida");
				else
					System.out.println("Fecha invalida");
				break;
			case 4: case 6: case 9 : case 11:
				if (dia>=1 && dia <=30)
					System.out.println("Fecha valida");
				else
					System.out.println("Fecha invalida");
				break;
			case 2:
				if (dia>=1 && dia <=28)
					System.out.println("Fecha valida");
				else
					System.out.println("Fecha invalida");
				break;
			default:
				System.out.println("Fecha invalida");
		}
		
	}

}
