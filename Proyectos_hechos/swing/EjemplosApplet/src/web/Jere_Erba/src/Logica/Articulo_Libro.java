package Logica;

public class Articulo_Libro {
	
	//atributos si es un libro
	public int codigoISBN;		
	private int cantEjemplares;
	public String titulo;
	public String autores;
	//public int CantidadPrestados;
	
	public Articulo_Libro() {
	}
	
	public Articulo_Libro(int codigoISBN, int cantEjemplares, String titulo ,String autores) { 
		this.codigoISBN = codigoISBN;
		this.cantEjemplares = cantEjemplares;
		this.titulo = titulo;
		this.autores = autores;
		//this.CantidadPrestados = CantidadPrestados;
	}
	
	
	/*public int getCantidadPrestados() {
		return CantidadPrestados;
	}

	public void setCantidadPrestados(int cantidadPrestados) {
		CantidadPrestados = cantidadPrestados;
	} */

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}
	
	

	public int getCodigoISBN() {
		return codigoISBN;
	}
	public void setCodigoISBN(int codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	
	
	public int getCantEjemplares() {
		return cantEjemplares;
	}
	
	
	public void setCantEjemplares(int cantEjemplares){
		this.cantEjemplares = cantEjemplares;
	}
	
	
	
	
	public String ToString() {
		return "Codigo ISBN: " + codigoISBN + "Cantidad de ejemplares: " + cantEjemplares;
	}
	
	
	public boolean darPrestamo() {
			boolean prestado = true;
			int cantidadPrestados = 0;
		
		
		if(cantidadPrestados < cantEjemplares)
		 {
			cantidadPrestados++;
		 }
		 else
		 {
			prestado = false;
		 }
	  return prestado;
	}
	
	
	
	/*public boolean devuelveLibros() {
		boolean devuelto = true;
		if(CantidadPrestados == 0)
		{
			devuelto = false;
		}
		else
		{
			CantidadPrestados--;
		}
		return devuelto;
	}*/

	

}



