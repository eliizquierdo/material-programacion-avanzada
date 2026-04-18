package logica;

import java.util.ArrayList; 

public class ListaPersonas { 

   private   ArrayList<Persona> lista;

  //crea la lista de personas
   public ListaPersonas(){ 
	   lista = new ArrayList<>(); 
   } 

    //Agrega una Persona a la lista 
   public void agregar(Persona p){ 
	   lista.add(p); 
   } 

     
   //dada una cedula elimina a la Persona de la lista
   public void eliminar(int ced){ 
	   lista.remove(this.obtenerXCedula(ced)); 
   } 
   
   //retorna la Persona que está en la posición i de la lista
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
	   Persona p=null;
	   int i=0;
	   boolean encontre=false;
	   do {
		   if (lista.get(i).getCedula() == cedula){
				  p= lista.get(i); 
				  encontre=true;
		   } else
			   	  i++;
	   }while (i<lista.size() && !encontre);
	  return p; 
   } 
   
  
   @Override
   public String toString(){
		return ("Lista de Personas: "+lista);
	}
	
   //retorna la cantidad de Personas en  la lista
   public int cantidad(){
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
