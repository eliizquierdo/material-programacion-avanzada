//1-11-2024
package paquete;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
	int calificaciones[]=new int [10];
	
	cargarArray(calificaciones);
	System.out.println("Calificaciones");
	//mostrarArray(calificaciones);
	

	/*int a=notaMasBaja(calificaciones);
		int b=posMasBaja(calificaciones); //posición donde está la nota más baja
	int c=notaMasAlta(calificaciones);
	int d=posMasAlta(calificaciones);
	System.out.println("La nota mas baja es: " + a);
	System.out.println("La nota mas baja es: " + a);
	System.out.println("La posicion mas baja es: " + b);
	System.out.println("La nota mas alta es: " + c);
	//System.out.println("La posicion mas alta es: " + d);
	
	*/
	}
	
	public static void cargarArray(int arreglo1[]) {
		Random azar = new Random();
		
		int nota;
		for(int i=0; i<10; i++) {
			nota=azar.nextInt(10)+1;
			arreglo1[i]=nota;
		}
	}//fin cargarArray
	
	public static void misterioArray(int arreglo2[]) {
		for(int j=0; j<arreglo2.length; j++) {
			System.out.println(arreglo2[j]);
		}
	}//fin mostrarArray
	
	
	public static double promedio(int arreglo3[]) {
		int acu=0;
		for(int j=0; j<arreglo3.length; j++) {
			acu=acu+arreglo3[j];
		}
		return acu/arreglo3.length;
		
	}//fin de promedio
	
	
	
}
