package Logica;

public class Articulo_Socios {
	
	public int ci;
	public String nombre;
	public int telefono;
	public String calle;
	public int numero;
	
	public Articulo_Socios() {
		
	}
	
	public Articulo_Socios(int ci, String nombre, int telefono, String calle, int numero) {
		this.ci = ci;
		this.nombre = nombre;
		this.telefono = telefono;
		this.calle = calle;
		this.numero = numero;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
