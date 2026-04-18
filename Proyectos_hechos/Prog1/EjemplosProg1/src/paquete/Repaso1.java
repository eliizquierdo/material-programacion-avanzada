package paquete;
import java.util.Scanner;

public class Repaso1 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese un mes entre enero y junio:");
		String mes=teclado.next();
		if (mes.equals("enero")||mes.equals("marzo") || mes.equals("mayo")) {
			System.out.println(31);
		}else {
			if (mes.equals("febrero")) {
				System.out.println(28);
			}else{
				if (mes.equals("abril")||mes.equals("junio")) {
					System.out.println(30);
				}else
					System.out.println("Fuera del semestre");
				}
		}
	}
}

