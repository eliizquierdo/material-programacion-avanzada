package paquete;

import java.util.Random;
import java.util.Scanner;

public class Ejer1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        // Solicitar al usuario el importe total pagado
	        System.out.print("Ingrese el importe total pagado: ");
	        double importe = scanner.nextDouble();

	        // Verificar si el importe es mayor a 1000
	        if (importe > 1000) {
	            // Extraer un número aleatorio entre 1 y 50
	           
	        	int num= random.nextInt(10) + 2;                // Genera un número entre 1 y 50
	            System.out.println("Número extraído: " + num);

	            // Determinar el premio según el número extraído
	            String premio;
	            switch (num  ) {
	                case 15:
	                    premio = "una taza";
	                    break;
	                case 35:
	                    premio = "una camiseta";
	                    break;
	                default:
	                    premio = "sin premio";
	                    break;
	            }

	            // Mostrar el premio obtenido
	            System.out.println("Obtuvo: " + premio);
	        } else {
	            System.out.println("No tiene derecho a extraer un número, el importe debe ser mayor a 500.");
	        }

	        scanner.close();
	    }
	}

