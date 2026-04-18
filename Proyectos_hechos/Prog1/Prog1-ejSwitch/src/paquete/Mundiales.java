package paquete;

import java.util.Scanner;

public class Mundiales {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		 do {
			do {
				System.out.println("Ingrese un año: ");
				opcion=teclado.nextInt();
				if ((opcion<1930) || (opcion>2015))
					System.out.println("Para esta versión los años tienen que estar entre 1930 y 2014");
			}while((opcion<1930) || (opcion>2015));
	    	
	   
			switch (opcion) {
				case 1930:
					System.out.println("Uruguay");
					break;
				case 1934:
					System.out.println("Italia");
					break;
				case 1938:
					System.out.println("Francia");
					break;
				case 1950:
					System.out.println("Brasil");
					break;
				case 1954:
					System.out.println("Suiza");
					break;
					//Y así continuá hasta 2014
				case 2015:
					System.out.println("Fin del programa");
					break;
				default:
					System.out.println("No se jugó mundial en ese año");
				
			}//switch
	    }while(opcion!=2015);
	   }//main

	}


