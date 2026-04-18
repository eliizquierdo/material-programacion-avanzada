package paquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int mes;
		Scanner teclado=new Scanner(System.in);
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


