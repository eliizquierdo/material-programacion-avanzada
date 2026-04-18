package modelo.vo;

import java.util.ArrayList; 

public class ListaPersonas { 

   private   ArrayList<Persona> lista;

  //crea la lista de personas
   public ListaPersonas(){ 
	   lista = new ArrayList<>(); 
   } 

    //Agrega una Persona a la lista 
   public void agregar(Persona a){ 
	   lista.add(a); 
   } 

     
   //dada una cedula elimina a la Persona de la lista
   public void borrar(int ced){ 
	   lista.remove(this.obtenerXCedula(ced)); 
   } 
   
   //retorna la Persona que estÃ© en la posición i de la lista
   public Persona devolver(int i){
	   return (lista.get(i));
	   
   }
   
   //devuelte true si ya existe una Persona con la cedula ced
   public boolean estaPersona(int ced){
	   
	   boolean  esta=lista.contains(obtenerXCedula(ced));
	   return(esta);
   }
   
    //Busca una Persona por la cedula, si no la encuentra retorna null 
   public Persona obtenerXCedula(int cedula){ 
	   for (int i=0 ; i<lista.size() ; i++){
		   if (lista.get(i).getCedula() == cedula){
			  return lista.get(i); 
		   }
	   } 
	   return null; 
   } 
   
  
   @Override
   public String toString(){
		return ("Lista de Personas: "+lista);
	}
	
   //retorna el largo de la lista
   public int largo(){
	   int cant=0;
	   
	   if (this!=null)
		   cant=lista.size();
	   return cant;
		   
   }

   //retorna la lista	
   public  ArrayList<Persona> getLista() {
	   return lista;
   }

} 
