package escrito;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        int resultado = numero * 10;
        System.out.println("El resultado de la operación es: " + resultado);
    }
}

