package ej5;

import java.util.Random;

//a) Declarar un array que permita guardar 10 enteros.
//Cargar el array con valores random  entre 1 y 5.
//b) Contar la cantidad de veces que salió el 2. Mostrar 
//todos los números que quedaron cargados en el array
//y la cantidad de veces que salió el 2

public class Principal5 {

	public static void main(String[] args) {
		Random azar=new Random();
		int array[]=new int[10];
		int contador=0;
		
		for (int i = 0; i < 10; i++) {
			array[i]=azar.nextInt(5)+1;
			if (array[i]==2)
				contador++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println("El 2 salió: "+contador);
	}
}
