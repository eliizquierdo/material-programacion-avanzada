package paquete;
import java.util.Scanner;

public class For1 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Pedir un nro y mostrar la tabla de dicho nro.
		System.out.println("Ingrese un nro: ");
		int num1=teclado.nextInt();
		for(int i=1; i<=10;i++) {
			System.out.println(num1+"x"+i+"="+num1*i);
		}
		
		
	}

}
