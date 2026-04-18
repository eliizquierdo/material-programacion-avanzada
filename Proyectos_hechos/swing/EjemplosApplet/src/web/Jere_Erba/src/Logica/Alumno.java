package Logica;

import java.util.ArrayList;

public class Alumno {
	
private ArrayList<Articulo_Alumno> lista;
	
	public Alumno(){
		lista = new ArrayList<Articulo_Alumno>();	
	}
	
	public void insertar(Articulo_Alumno a) {
		lista.add(a);
	}
	
	public void eliminar(Articulo_Alumno a) {
		lista.remove(a);
	}
	
	public boolean pertenece(Articulo_Alumno a) {
		return lista.contains(a);
	}
	
	public Articulo_Alumno devolver(int i) {
		return lista.get(i);
	}
	
	public int cantidad() {
		return lista.size();
	}

	public void adicionar(Articulo_Alumno a) {
		lista.add(a);
	}
	
	public Articulo_Alumno obtener(int posicion) {
		return lista.get(posicion);
	}
	
	public int tamaño() {
		return lista.size();
	}
	
	public Articulo_Alumno buscar(int a) {
		Articulo_Alumno a1 =null;
		   int i=0;
		   boolean encontrado=false;
		   do {
			   if (lista.get(i).getCi_A() == a){
					  a1 = lista.get(i); 
					  encontrado=true;
			   } else
				   	  i++;
		   }while (i<lista.size() && !encontrado);
		  return a1; 
	}

	

}

