package paquete;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        int contador = 1;
        int producto = 1;

        while (contador <= 5) {
            System.out.print("Ingrese un número: ");
            int numero = teclado.nextInt();
            producto = producto * numero;
            contador++;
        }

        System.out.println("El producto de los números ingresados es: " + producto);
    }
}

