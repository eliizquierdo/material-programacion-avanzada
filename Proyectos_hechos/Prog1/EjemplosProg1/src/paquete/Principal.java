package paquete;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese la calificación:");
		int calificacion=teclado.nextInt();
		if (calificacion>5)
			System.out.println("Aceptable");
		else
			System.out.println("Insuficiente");

	}

}
