package Logica;

import java.util.ArrayList;

public class Profesores {
	
private ArrayList<Articulo_Profesores> lista;
	
	public Profesores(){
		lista = new ArrayList<Articulo_Profesores>();	
	}
	
	public void insertar(Articulo_Profesores a) {
		lista.add(a);
	}
	
	public void eliminar(Articulo_Profesores a) {
		lista.remove(a);
	}
	
	public boolean pertenece(Articulo_Profesores a) {
		return lista.contains(a);
	}
	
	public Articulo_Profesores devolver(int i) {
		return lista.get(i);
	}
	
	public int cantidad() {
		return lista.size();
	}

	public void adicionar(Articulo_Profesores a) {
		lista.add(a);
	}
	
	public Articulo_Profesores obtener(int posicion) {
		return lista.get(posicion);
	}
	
	public int tamaño() {
		return lista.size();
	}
	
	public Articulo_Profesores buscar(int a) {
		Articulo_Profesores a1 =null;
		   int i=0;
		   boolean encontrado=false;
		   do {
			   if (lista.get(i).getCI_P() == a){
					  a1 = lista.get(i); 
					  encontrado=true;
			   } else
				   	  i++;
		   }while (i<lista.size() && !encontrado);
		  return a1; 
	}

	

}