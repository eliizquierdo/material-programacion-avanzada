package paquete;

import java.util.Scanner;

public class Ejer1 {

    static int monedas = 0; // variable global

    // Procedimiento que da la bienvenida
    public static void saludar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
    }

    // Función que retorna true o false de acuerdo a la respuesta
    public static boolean contestarPregunta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conteste 1-True o 0-False");
        System.out.print("Los dinosaurios vivieron hace 30.000 años: ");
        int pregunta1 = scanner.nextInt();
        boolean respuesta = pregunta1 == 0;
        return respuesta;
    }

    // Procedimiento que aumenta o disminuye la cantidad de monedas ganadas
    public static void darMoneda(boolean res) {
        if (res) {
            monedas += 101; // pusimos 101 para probar porque tenemos una sola pregunta
        } else {
            monedas -= 100; // idem 25
        }
    }

    // Procedimiento que muestra el final
    public static void mostrarCofre() {
        if (monedas >= 100) {
            System.out.println("Llegaste a 100 puntos, te ganaste el cofre");
        }
    }

    // Programa principal
    public static void main(String[] args) {
        saludar();
        while (monedas <= 100) {
            darMoneda(contestarPregunta());
        }
        mostrarCofre();
    }
}
