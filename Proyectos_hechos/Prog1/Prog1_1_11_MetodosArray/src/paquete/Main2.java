package paquete;
import java.util.Random;
import java.util.Scanner;

public class Main2 {

    // Generamos un número aleatorio entre 1 y 20
    static Random random = new Random();
    static int numero = random.nextInt(20) + 1;

    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("*     BIENVENIDOS AL ADIVINADOR    *");
        System.out.println("************************************");
        System.out.println("Estoy pensando en un número entre 1 y 20. ¡Intenta adivinarlo!");
        pideNumero(); // Llamamos a la función para iniciar el programa
    }

    // Definimos la función para solicitar un número
    public static void pideNumero() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Dame un número entre 1 y 20: \n");
            int miNumero = scanner.nextInt();
            comprueba(miNumero);
        } catch (Exception e) {
            System.out.println("Por favor, introduce un número válido.");
            pideNumero();
        }
    }

    // Definimos la función para comprobar el número
    public static void comprueba(int deljugador) {
        if (deljugador == numero) {
            System.out.println("¡Felicidades! Adivinaste el número.");
        } else {
            System.out.println("Ese no es el número. Intenta de nuevo.");
            pideNumero();
        }
    }
}
