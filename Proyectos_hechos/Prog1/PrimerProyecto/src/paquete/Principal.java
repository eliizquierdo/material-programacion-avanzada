package paquete;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int numero, jugar, aleatorio, contador = 0;
		boolean salir = false;
		Scanner tecla = new Scanner(System.in);
		System.out.println("Adivine un numero entre 1 y 1000.");
		do {
			System.out.print("Seleccione 1 para jugar o 0 para salir: ");
			jugar = tecla.nextInt();
			Random azar = new Random();
			aleatorio = azar.nextInt(1001);
			
			switch (jugar) {
				case 1:
					
					do {
						System.out.print(aleatorio + " Ingresar un valor entre 1 y 1000: ");
						numero = tecla.nextInt();
						
						if (numero > aleatorio) {
							System.out.println("Demaciado alto. Intente de nuevo.");
						}else if(numero < aleatorio){//agregue if para que solo imprima demasiado bajo... si es menor si es igual no imprime y sale del bucle
							System.out.println("Demaciado bajo. Intente de nuevo.");
						}contador++;
						
					}while (numero != aleatorio);
					System.out.println("Felicidades. Adivino el numero.");
					if(contador <= 10) {
						if(contador < 10) {
							System.out.println("¡O ya sabía usted el secreto, o tuvo suerte!");
						}else
							System.out.println("¡Sabía usted el secreto!");
					}else {
						System.out.println("¡Debería haberlo hecho mejor!");
					}
					
					contador = 0;
					break;
				
				case 0:
					salir = true;
					break;
					
				default:
					System.out.println("no es una opcion correcta");
			}
		}while (salir != true);
	}
}