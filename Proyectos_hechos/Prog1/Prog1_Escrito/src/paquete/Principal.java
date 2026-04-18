package paquete;
import java.util.Random;

public class Principal {
	
	public static void main(String[] args) {
		int suma=0;
		for(int i=0; i<10;i++)
			suma=suma+funcion1();
		System.out.println("La suma total de los nros generados es: "+ suma);
		
	}
	
	public static int funcion1() {
		
		Random azar=new Random();
		int num1=azar.nextInt(90)+10;
		int num2=azar.nextInt(90)+10;
		System.out.println("num1 es: "+num1 + " y num2 es: "+num2);
		if (num1>num2)
			return num1;
		else
			return num2;
		
		
		
	}

}
