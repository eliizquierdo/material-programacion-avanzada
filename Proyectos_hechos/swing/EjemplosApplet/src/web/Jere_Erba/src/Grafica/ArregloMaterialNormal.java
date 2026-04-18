package Grafica;

import java.util.ArrayList;

import Logica.Articulo_Libro;

public class ArregloMaterialNormal {
	
	private ArrayList<Logica.Articulo_Libro> arreglo;
	
	public ArregloMaterialNormal(){
		arreglo = new ArrayList<Articulo_Libro>();	
	}
	
	
	public void adicionar(Logica.Articulo_Libro a) {
		arreglo.add(a);
	}
	
	public Articulo_Libro obtener(int posicion) {
		return arreglo.get(posicion);
	}
	
	public int tamaño() {
		return arreglo.size();
	}
		
		
}
	




