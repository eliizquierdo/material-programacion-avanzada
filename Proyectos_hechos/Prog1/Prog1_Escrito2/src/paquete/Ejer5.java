package paquete;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = teclado.nextInt();

        if (numero > 0) {
            System.out.println("El número ingresado es positivo.");
            
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo.");
            
        } else {
            System.out.println("El número ingresado es cero.");
        }
    }
}

