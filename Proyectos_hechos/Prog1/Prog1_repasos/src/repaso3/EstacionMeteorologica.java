package repaso3;

import java.util.Random;

public class EstacionMeteorologica {
		
	    static double[] temperaturas;
	   
	    public static void main(String[] args) {
	        generarTemperaturasAleatorias();
	        System.out.println("La temperatura más alta es: " + mayorTemperatura());
	        //Mostrar la temperatura más baja 
	        
	        
	        //Insertar la temperatura 34 en la pos 4
	        
	        
	        
	        
	    }

	    // Genera un conjunto de temperaturas aleatorias entre 0 y 50 grados Celsius.
	    public static void generarTemperaturasAleatorias() {
	    	Random azar=new Random();
	        temperaturas = new double[365];
	        
	        for (int i = 0; i < temperaturas.length; i++) {
	            temperaturas[i] = azar.nextInt(51);
	            
	            
	        }
	    }
	        
	        // Mostrar las temperaturas del año
		    public static void mostrarTemperaturas() {
		    	
		        
		        for (int i = 0; i < temperaturas.length; i++) {
		           System.out.print(temperaturas[i]+"\t");
		            
		        }
	    }
	    
	    // agregar una nueva temperatura al conjunto en la pos i
	    public static void agregarTemp(double temp, int i) {
	    	temperaturas[i]=temp;
	    	
	    }
	    
	    //consultar la cantidad de días que se registró una temperatura determinada
	    public static int cantDias(double temp) {
	    	int contador=0;
	    	
	    	for (int i = 0; i < temperaturas.length; i++) {
	            if (temp ==temperaturas[i])
	            	contador++;
	            
	        }
	    	return contador;
	    	 
	    }
	    
	    public static double mayorTemperatura() {
	        	        
	        double aux=0;
	        
	        for (int i = 1; i < temperaturas.length; i++) {
	        	aux=temperaturas[0];
	        	if (temperaturas[i]>aux);
	        		aux=temperaturas[i];
	        }
	        return aux;
	    }
	        
	    
	    
	    // Encuentra la menor temperatura que se registró 
	    public static double menorTemperatura() {
	        
	        double aux = temperaturas[0];
	        for (int i = 1; i < temperaturas.length; i++) {
	        	aux=temperaturas[0];
	        	if (temperaturas[i]<aux);
	        		aux=temperaturas[i];
	        }
	        return aux;
	    }
	    
	}