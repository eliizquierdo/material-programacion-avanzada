package paquete_sol;

import java.util.ArrayList;


public class ListaProducto {
	
	private ArrayList<Producto> lista;

	public ListaProducto() {
		lista=new ArrayList<>();
	}
	
	public void agregar(Producto p) {
		lista.add(p);
	}
	
	public void borrar(Producto p) {
		lista.remove(p);
	}
	
	public boolean estaProducto(Producto p) {
		return lista.contains(p);
	}
	
	//dado un codigo elimina el Producto de la lista
	public void borrar(int codigo){ 
	   lista.remove(this.obtenerXCodigo(codigo)); 
	} 
	   
	//retorna el Producto que está en la posición i de la lista
	public Producto devolver(int i){
	   return (lista.get(i));
		   
	}
	   
	//devuelve true si el Producto con codigo cod esta en la lista
	public boolean estaProducto(int cod){
	   
		boolean  esta=lista.contains(obtenerXCodigo(cod));
		   return(esta);
	}
	   
	//Busca un Producto por codigo, si no la encuentra retorna null 
	public Producto obtenerXCodigo(int cod){ 
		int i=0;
		boolean esta=false;
		Producto temp=new Producto();
		temp=null;
        do{ 
			if (lista.get(i).getCodigo()==(cod)) {
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
