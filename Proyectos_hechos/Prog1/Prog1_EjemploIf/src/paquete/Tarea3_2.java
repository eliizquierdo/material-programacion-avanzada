package paquete;
/*1) a) Visualizar el valor generado en pantalla y en caso de que el valor sea mayor que 0,
 *  visualizar su cubo (azar * azar * azar), en caso de ser 0,
 *   visualizar "El valor generado es 0"*/
 
import java.util.Scanner;
import java.util.Random;

public class Tarea3_2 {
	public static void main(String[] args) {
	int nro1;
	Random azar= new Random();
	/*int dado= 1 + azar.nextInt(6);
	int moneda=azar.nextInt(2);						//0=cara; 1=cruz
	System.out.println("Dado: "+dado);
	System.out.println("moneda: "+moneda);*/
	
	int valor=azar.nextInt(11);	//chequear tope si es 10 o 11
	System.out.println("El valor generado es:"+ valor);
	if (valor==0)
		System.out.println("El valor generado es cero");
	else
		System.out.println("El cubo es:"+valor*valor*valor);
		
	/*b) Imprimir un cartel que diga si el número generado es mayor que 5 o no*/
	// no  !
	//y	&&
	// o ||
	
	if (valor>5)
		System.out.println("El valor generado es mayor que 5");
	else
		System.out.println("El valor generado es menor que 5");
	
	/* 3)Informar si el valor al azar es divisible entre 3 o no
	 *  (el módulo entre el valor al azar y 3 deberá ser 0)
	 */
	if (valor%3==0)
		System.out.println("el valor es divisible entre 3");
	else
		System.out.println("el valor no es divisible entre 3");
	
	//chequear si el valor esta entre 2 y 4 --- 2  3  4
	if ((valor>=2 && valor<=4))
		System.out.println("El valor generado es está entre 2 y 4");
	else
		System.out.println("El valor generado no está entre 2 y 4");
	
	
	//chequear si el valor no esta entre 2 y 4 --- 2  3  4
		if (!(valor>=2 && valor<=4))
			System.out.println("El valor generado es está entre 2 y 4");
		else
			System.out.println("El valor generado no está entre 2 y 4");
		
	}
}

