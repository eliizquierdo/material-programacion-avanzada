package paquete;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        int contador = 1;
        int suma = 0;

        while (contador <= 5) {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            suma = suma + numero;
            contador++;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}


