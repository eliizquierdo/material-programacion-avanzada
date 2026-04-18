package practico;
import java.util.Random;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejer3 {

	public static void main(String[] args) {
		Random azar=new Random();
		int valor;
		valor=azar.nextInt(19)+1;  //genera un nro al azar entre 1 y 20
		boolean result1= esPar(valor);
		boolean result2= unDigito(valor);
		System.out.println("El valor generado es "+valor +" es par:"+result1 +" y tiene un digito "+result2);
	
		}  
		

	private static boolean unDigito(int valor) {
		if (valor / 10 >0)
			return false;
		else
			return true;
	}

	private static boolean esPar(int valor) {
		if(valor%2==0)
			return true;
		else
			return false;
	}
		  
		
	}


