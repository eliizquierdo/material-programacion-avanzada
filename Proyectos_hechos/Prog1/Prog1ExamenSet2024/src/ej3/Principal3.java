package ej3;

import java.util.Scanner;

//Escriba un programa que pida el año de nacimiento
//y calcule e imprima la edad que cumplió una persona en 2023.
//En función de la edad obtenida, el programa deberá realizar
//alguna de las siguientes salidas por pantalla:
//• Si la edad es menor a 18: “Deje el celular y pongase a estudiar”.
//• Sino, si  la persona es menor de 60: “Trabaje, no sea vago”.
//•de lo contrario: “Disfrute de su jubilación”.

public class Principal3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Ingrese su año de nacimiento: ");
		int anio=teclado.nextInt();
		int edad=2023-anio;
		if (edad<18)
			System.out.println("Deje el cel y pongase a estudiar");
		else if (edad<60)
			System.out.println("Trabaje, no sea vago");
		else
			System.out.println("Disfrute de su jubilación");
		
	}

}
