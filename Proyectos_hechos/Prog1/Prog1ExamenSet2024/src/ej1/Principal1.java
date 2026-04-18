package ej1;
//a) (2 ptos) Solicitar al usuario, que ingrese 
//dos números enteros  num1 y num2  por teclado. 
//Chequear que dichos valores sean mayores de 0, 
//en caso contrario mostrar “error” y 
//volver a solicitar que se ingresen.
//b) (1 pto) Visualizar el resultado correspondiente a la suma
//y la resta de los  números anteriores.
import java.util.Scanner;
public class Principal1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num1, num2, suma, resta;
		do {
			System.out.println("Ingrese dos números: ");
			num1=teclado.nextInt();
			num2=teclado.nextInt();
			if (num1<0 || num2<0)
				System.out.println("Error");
		}while(num1<0 || num2<0);
		suma=num1+num2;
		resta=num1-num2;
		System.out.println("La suma es:"+suma);
		System.out.println("la resta es: "+resta);
		
	}

}
