package paquete;

import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		int contadorV=0, contadorC=0, contadorF=0;
		int mes;
		
		do {
		    System.out.println("Ingrese un mes para mesa de examen: ");
		    mes=teclado.nextInt();
		}while((mes>12) || (mes<1));
	    	
	    
			switch (mes) {
				case 2:
					System.out.println("Febrero");
					break;
				case 4:
					System.out.println("Abril");
					break;
				case 7:
					System.out.println("Julio");
					break;
				case 9:
					System.out.println("Setiembre");
					break;
				case 12:
					System.out.println("Diciembre");
					break;
				default:
					System.out.println("No hay mesa");
			
			}
	    
	   }

	
	
}

