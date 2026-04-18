package paquete;

import java.util.Scanner;

public class Ejer2 {
	static int numero;  //alcance global
	public static void main(String[] args) {
		int opcion=0;	//alcance local
		int a, b, resultado;
		Scanner teclado=new Scanner(System.in);
		numero=3;
		while(opcion!=5) {
			System.out.println("MENÚ DE OPERACIONES");
			System.out.println("1-Suma");
			System.out.println("2-Resta");
			System.out.println("3-Producto");
			System.out.println("4-Mitad");
			System.out.println("5-Salir");
			System.out.println("Elija una opción:");
			opcion=teclado.nextInt();
			switch(opcion) {
			
			case 1:
				System.out.println("Sumar");
				System.out.println("Ingrese dos números:");
				a=teclado.nextInt();
				b=teclado.nextInt();
				System.out.println("La suma es:"+suma(a,b));
				break;
			case 2:
				System.out.println("Resta");
				break;
				
			default:
				System.out.println("Opción incorrecta");
				
			}//fin switch
		}//fin while
		
	}//fin main
	
public static double suma(double num1, double num2)	{
	return num1+num2;
	
}//fin suma

}//final de clase
