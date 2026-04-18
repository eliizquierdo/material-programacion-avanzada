package Logica;

import java.util.ArrayList;

public class Normal {
	
private ArrayList<Articulo_Normal> lista;
	
	public Normal(){
		lista = new ArrayList<Articulo_Normal>();	
	}
	
	public void insertar(Articulo_Normal a) {
		lista.add(a);
	}
	
	public void eliminar(Articulo_Normal a) {
		lista.remove(a);
	}
	
	public boolean pertenece(Articulo_Normal a) {
		return lista.contains(a);
	}
	
	public Articulo_Normal devolver(int i) {
		return lista.get(i);
	}
	
	public int cantidad() {
		return lista.size();
	}

	public void adicionar(Articulo_Normal a) {
		lista.add(a);
	}
	
	public Articulo_Normal obtener(int posicion) {
		return lista.get(posicion);
	}
	
	public int tamaño() {
		return lista.size();
	}
	
	public Articulo_Normal buscar(int a) {
		Articulo_Normal a1 =null;
		   int i=0;
		   boolean encontrado=false;
		   do {
			   if (lista.get(i).getCodigo() == a){
					  a1 = lista.get(i); 
					  encontrado=true;
			   } else
				   	  i++;
		   }while (i<lista.size() && !encontrado);
		  return a1; 
	}

	

}
