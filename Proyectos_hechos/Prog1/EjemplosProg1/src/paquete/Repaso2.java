package paquete;
import java.util.Scanner;
public class Repaso2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un mes entre enero y junio:");
		String mes=teclado.next();
		switch(mes) {
			case "enero","marzo","mayo":
				System.out.println(31);
				break;
			case "febrero":
				System.out.println(28);
				break;
			case "abril", "junio":
				System.out.println(30);
				break;
			default:
				System.out.println("Fuera del semestre");
		}
	}
}
