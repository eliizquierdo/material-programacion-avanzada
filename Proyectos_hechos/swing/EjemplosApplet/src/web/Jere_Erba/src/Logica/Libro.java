package Logica;

import java.util.ArrayList;

public class Libro {
	
	private ArrayList<Articulo_Libro> lista;
	
	public Libro(){
		lista = new ArrayList<Articulo_Libro>();	
	}
	
	public void insertar(Articulo_Libro a) {
		lista.add(a);
	}
	
	public void eliminar(Articulo_Libro a) {
		lista.remove(a);
	}
	
	public boolean pertenece(Articulo_Libro a) {
		return lista.contains(a);
	}
	
	public Articulo_Libro devolver(int i) {
		return lista.get(i);
	}
	
	public int cantidad() {
		return lista.size();
	}

	public void adicionar(Articulo_Libro b) {
		lista.add(b);
	}
	
	public Articulo_Libro obtener(int posicion) {
		return lista.get(posicion);
	}
	
	public int tamaño() {
		return lista.size();
	}
	
	public Articulo_Libro buscar(int iSBN) {
		Articulo_Libro a1 =null;
		   int i=0;
		   boolean encontrado=false;
		   do {
			   if (lista.get(i).getCodigoISBN() == iSBN){
					  a1 = lista.get(i); 
					  encontrado=true;
			   } else
				   	  i++;
		   }while (i<lista.size() && !encontrado);
		  return a1; 
	}
	

		
		
}





