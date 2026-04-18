package repaso1;
import java.util.Random;

public class EstacionMete {

    static int[] temperaturas=new int[365];
	
    public static void main(String[] args) {
        generarTemperaturasAleatorias();
        mostrarTemperaturas();
        agregarTemp(25, 5);
        System.out.println("La casilla 5 tiene la temperatura: "+temperaturas[5]);
        System.out.println("El 25 se repite "+cantDias(25)+" veces");
        //System.out.println("La temperatura más alta es: " + mayorTemperatura());
        //Mostrar la temperatura más baja 
        
        
        //Insertar la temperatura 34 en la pos 4
        
        
        
        
    }

    // Genera un conjunto de temperaturas aleatorias entre 0 y 50 grados Celsius.
    public static void generarTemperaturasAleatorias() {
    	int temp;
    	Random azar=new Random();
    	for(int i=0; i<temperaturas.length;i++) {
    		temperaturas[i]=azar.nextInt(51);
    		
    	}
            
    }
        
        
	//Mostrar las temperaturas del año
	public static void mostrarTemperaturas() {
		for(int i=0; i<temperaturas.length;i++) {
    		System.out.print(temperaturas[i]+" ");
 		
    	} 	
	
	
	}
    
    // agregar una nueva temperatura al conjunto en la pos i
    public static void agregarTemp(int temp, int i) {
    	temperaturas[i]=temp;
    	
    }
    
    //consultar la cantidad de días que se registró una temperatura determinada
    public static int cantDias(int temp) {
    	int contador=0;
    	for(int i=0; i<temperaturas.length;i++) {
	    	if(temperaturas[i]==temp)
	    		contador++;
 		} 
    	return contador;
    	 
    }
    
    public static double mayorTemperatura() {
        	        
        double aux=0;
        
      


return aux;
    }
        
    
    
    // Encuentra la menor temperatura que se registró 
    public static double menorTemperatura() {
        
     

    return 0;
    }
}
