package paquete;
import java.util.Scanner;

public class For2 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Pedir 10 nros e ir sumandolos.
		//Al final, mostrar el resultado de la suma 
		int num1;
		int resultado=0;//inicializar el acumulador
		
		
		for(int i=1; i<=5;i++) {
			System.out.println("Ingrese un nro: ");
			num1=teclado.nextInt();
			resultado=resultado+num1;//acumulador
		}
		
		
	}

}
