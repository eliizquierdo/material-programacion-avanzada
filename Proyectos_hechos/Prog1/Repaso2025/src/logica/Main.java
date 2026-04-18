package logica;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int resultado = lanzarDado();
        String prenda = obtenerPrenda(resultado);
        mostrarPrenda(prenda);
    }

   public static int lanzarDado() {
	   Random azar=new Random();
	   int dado=azar.nextInt(6);
	   System.out.println(dado);
	   return dado;
	   
   }
   
   public static String obtenerPrenda(int num) {
	   
	   String[] prendas= {"saltar la cuerda",
			   "correr",
			   "jugar al serio",
			   "decir la tabla del 54",
			   "silbar",
			   "dejar el cel un día entero"};
	   
	   
   		return prendas[num];
   }
	   
   public static void mostrarPrenda(String p) {
	   System.out.println("La prenda que tienes que hacer es: "+p);
}

}
