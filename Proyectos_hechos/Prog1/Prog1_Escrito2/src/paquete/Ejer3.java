package paquete;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();

        if (edad >= 18 && edad< 70) {
            System.out.println("Estás en edad de conducir");
        } else {
            System.out.println("No tienes edad para conducir");
        }
    }
}

