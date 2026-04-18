package Logica;

public class Articulo_Prestamo {
	
	public int codigoISBN; 
	public int fecha_entrega;
	public int fecha_devolucion;
	public int ci_docente;
	public int ci_alumno;
	
	public Articulo_Prestamo() {
		
	}
	
	public Articulo_Prestamo(int codigoISBN, int fecha_entrega, int fecha_devolucion, int ci_docente, int ci_alumno) {
		this.codigoISBN = codigoISBN;
		this.fecha_entrega = fecha_entrega;
		this.fecha_devolucion = fecha_devolucion;
		this.ci_docente = ci_docente;
		this.ci_alumno = ci_alumno;
	}

	public int getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(int fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public int getFecha_devolucion() {
		return fecha_devolucion;
	}

	public void setFecha_devolucion(int fecha_devolucion) {
		this.fecha_devolucion = fecha_devolucion;
	}

	public int getCi_docente() {
		return ci_docente;
	}

	public void setCi_docente(int ci_docente) {
		this.ci_docente = ci_docente;
	}

	public int getCi_alumno() {
		return ci_alumno;
	}

	public void setCi_alumno(int ci_alumno) {
		this.ci_alumno = ci_alumno;
	}

	public int getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(int codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	
	
	
	
	
	
	
	public boolean darPrestamo() {
		boolean prestado = true;
		int cantidadPrestados = 0;
	
	
	int cantEjemplares = 0;
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



public boolean devuelveLibros() {
	boolean devuelto = true;
	int CantidadPrestados = 0;
	if(CantidadPrestados == 0)
	{
		devuelto = false;
	}
	else
	{
		CantidadPrestados--;
	}
	return devuelto;
}



}
