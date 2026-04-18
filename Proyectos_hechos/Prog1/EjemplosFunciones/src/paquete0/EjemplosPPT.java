package paquete0;

public class EjemplosPPT {
	
	public static void saludar(String nombre) {
		System.out.println("Hola, "+ nombre);
	}
	
	public static String saludar2(String nombre) {
		return "Hola, "+ nombre;
	}
	
	public static String saludar3() {
		return "Hola a todos,\n"
				+ "¿cómo están? ";
	}
	
	public static void saludar4() {
		System.out.println("Hola a todos,\n"
				+ "¿cómo están? ");
	}
	
	public static void main(String[] args) {
		saludar4();
	}

}
