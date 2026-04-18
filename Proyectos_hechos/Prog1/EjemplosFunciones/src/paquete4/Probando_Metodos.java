package paquete4;

public class Probando_Metodos {

	public static void main(String[] args) {
		double pesos=2500;
		double dolar = pesosAdolar(pesos); 
		System.out.println(pesos +" convertido a dolar es: "+ dolar);
		
	}

	public static double pesosAdolar(double p) {
		double resul = p/45;
		return resul;
	}
	
	
	
	
	
}
