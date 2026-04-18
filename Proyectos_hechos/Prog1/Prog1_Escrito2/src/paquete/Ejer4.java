package paquete;
import java.util.Random;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
	
	Random azar = new Random();
	Scanner teclado = new Scanner(System.in);
	
	int num1 = azar.nextInt(10) + 1; //entre 1 y 10
	int num2 = azar.nextInt(11) + 10; //entre 10 y 20
	
	System.out.print(" Ingrese un numero: ");
	int valor = teclado.nextInt();
	
	int resultado = (num1 + num2) * valor;
	System.out.print("El resultado de multiplicar la suma de los nros aleatorios"
			+ " por el nro ingresado es: " + resultado + ".");
	}
}