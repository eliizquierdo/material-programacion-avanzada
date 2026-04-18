package paquete;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int producto = 1;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            producto = producto * numero;
        }

        System.out.println("El producto de los números ingresados es: " + producto);
    }
}


