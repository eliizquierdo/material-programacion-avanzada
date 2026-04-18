package paquete1;
import java.util.Scanner;

class Main_While {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int suma=0;
		int contador=1;
		int mayor50=0;
		System.out.println("Ingrese numero:");
		num = sc.nextInt();
		while(num!=100) {
			suma=suma+num;
			contador++;
			if(num>50) {
				mayor50++;
			}
			System.out.println("Ingrese numero:");
			num = sc.nextInt();
		}
		System.out.println("la suma de los numeros ingresados es:"+suma);
	    
		float promedio=suma/(contador-1);
	    System.out.println("el promedio de los numeros ingresados es: "+ promedio);
	    System.out.println("hay "+ mayor50+ " numeros mayores de 50");
	}

}


