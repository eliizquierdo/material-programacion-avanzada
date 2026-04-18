package paquete;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero;
        boolean salir = false; 

        while (salir != true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = teclado.nextInt();
            if (numero == 0) {
               salir = true;
            }
            suma = suma + numero;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

