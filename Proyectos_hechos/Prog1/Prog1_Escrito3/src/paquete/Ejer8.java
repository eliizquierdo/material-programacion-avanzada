package paquete;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 10; i = i + 2) {
            suma = suma + i;
        }
        System.out.println("La suma de los números impares del 1 al 10 es: " + suma);
    }
}

