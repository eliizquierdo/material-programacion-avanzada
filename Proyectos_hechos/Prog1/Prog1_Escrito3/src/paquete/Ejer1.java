package paquete;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            suma =suma + numero;
        }

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}


