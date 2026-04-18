package paquete;

import java.util.Scanner;

public class Autos {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int opcion;
		int contadorV=0, contadorC=0, contadorF=0;
		do {
			System.out.println("1-Volkswagen");
			System.out.println("2-Chevrolet");
			System.out.println("3-Ford");
			System.out.println("0-Salir");
			System.out.println("Ingrese una opción:");
			opcion=teclado.nextInt();
			
			switch (opcion) {
				case 1:
					contadorV++;
					break;
				case 2:
					contadorC++;
					break;
				case 3:
					contadorF++;
					break;
				case 0:
					System.out.println("Volkswagen vendidos:"+contadorV);
					System.out.println("Chevrolet vendidos:"+contadorC);
					System.out.println("Ford vendidos:"+contadorF);
					break;
			}
		}while(opcion!=0);
	}
}
