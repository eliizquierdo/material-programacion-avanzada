package paquete1;
import java.util.Scanner;
/*1) a) En el paquete1, crear una clase llamada Main, codifique un programa que lea números desde el teclado 
 * y vaya sumándolos, termina cuando se ingresa un 100. Mostrar el resultado de la suma en pantalla

   b) Agregar lo necesario al programa anterior para que pueda hallar el promedio y mostrarlo en pantalla al finalizar.

   c) Agregar lo necesario para que pueda contar la cantidad de números mayores de 50, mostrando dicha cuenta al finalizar.

   d) Agregar lo que sea necesario al  programa para que se repita 5 veces
   */
class Main_DoWhile {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int suma=0;
		int contador=0;
		int mayor50=0;
		
		do {
			System.out.println("Ingrese numero:");
			num = sc.nextInt();
			if(num!=100) {
				suma=suma+num;
				contador++;
				if(num>50) {
					mayor50++;
				}	
			}
		}while(num!=100);
		System.out.println("la suma de los numeros ingresados es:"+suma);
	    
		float promedio=suma/contador;
	    System.out.println("el promedio de los numeros ingresados es: "+ promedio);
	    System.out.println("hay "+ mayor50+ " numeros mayores de 50");
	}

}


