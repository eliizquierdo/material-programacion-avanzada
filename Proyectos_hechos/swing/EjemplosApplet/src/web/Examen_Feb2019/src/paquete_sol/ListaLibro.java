package paquete_sol;

import java.util.ArrayList;


public class ListaLibro {
	
	private ArrayList<Infantil> lista;

	public ListaLibro() {
		lista=new ArrayList<>();
	}
	
	public void agregar(Infantil b) {
		lista.add(b);
	}
	
	public void borrar(Infantil b) {
		lista.remove(b);
	}
	
	public boolean estaLibro(Infantil b) {
		return lista.contains(b);
	}
	
	//dado un codigo elimina el infantil de la lista
	public void borrar(String codigo){ 
	   lista.remove(this.obtenerXCodigo(codigo)); 
	} 
	   
	//retorna el infantil que está en la posición i de la lista
	public Infantil devolver(int i){
	   return (lista.get(i));
		   
	}
	   
	//devuelve true si el lnfantil con codigo cod esta en la lista
	public boolean estaInfantil(String cod){
	   
		boolean  esta=lista.contains(obtenerXCodigo(cod));
		   return(esta);
	}
	   
	//Busca un infantil por codigo, si no la encuentra retorna null 
	public Infantil obtenerXCodigo(String cod){ 
		int i=0;
		boolean esta=false;
		Infantil temp=new Infantil();
		temp=null;
        do{ 
			if (lista.get(i).getCodigo().equals(cod)) {
					esta=true;
				    temp= lista.get(i); 
				   
			}else
				i++;
	     }while((i<lista.size()) && (esta==false));
	     return temp; 
	} 
	
	public int cantidad() {
		return lista.size();
	}
	
	@Override
	public String toString() {
	return " "+ lista;
	}
	
	
}
