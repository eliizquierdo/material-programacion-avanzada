package logica;

public class Controlador {
	private static ListaPersonas colPersonas=new ListaPersonas();
    
    public static void agregarPersona(Persona a) {
       colPersonas.agregar(a);
    }
	
	public static Persona buscarXCedula(int cedula) {
		Persona a=new Persona();
		a=colPersonas.obtenerXCedula(cedula);
		return a;
	}
	
	public static  ListaPersonas devolverPersonas() {
        return (colPersonas);
    } 
	
	public static boolean estaPersona(int ced) {
		return(colPersonas.estaPersona(ced));
	}
}



