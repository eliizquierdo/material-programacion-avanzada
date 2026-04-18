package paquete1;

public class Principal {

	public static void main(String[] args) {
		 String usuario = "PepeGrillo";
	     String contrasenia = "MiPass";

	     boolean esUsuario =verificar(usuario, contrasenia);
	     if (esUsuario)
	       	System.out.println("Hola "+usuario);
	     else
	       	System.out.println("Usuario o contraseña incorrectos");
	        

	}
	
	public static String metodoString(int n){
	    if(n == 0)
	            return "a"; 
	   return "x"; 
	}


	public static boolean metodoBoolean(boolean n, String mensaje){
	    if(n)
	    
	        System.out.println(mensaje);
	    
	    return n; 
	}



	  public static String saludar(String nombre){
	        
	        String saludo = "Hola. Bienvenido " + nombre;

	        return saludo; 
	    }


	 public static String error(String nombre){
	        String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

	        return error; 
	 }

	public static boolean verificar(String usuario, String contrasenia) {
	        String usuarioValido = "PepeGrillo";
	        String contraseniaValida = "MiPass";
	       
	      //  if(usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia)) 
	        if (usuarioValido==usuario && contraseniaValida==contrasenia)
	                  return true; 
	       
	        
	        return false;
	}

		
}
