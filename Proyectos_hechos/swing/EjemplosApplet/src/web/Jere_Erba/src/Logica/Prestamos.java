package Logica;

import java.util.ArrayList;

import Grafica.Fecha;

public class Prestamos {
	
	private ArrayList<Articulo_Prestamo> lista;
	Libro pPr = new Libro();
	
	public Prestamos() {
		lista = new ArrayList<Articulo_Prestamo>();
	}
	
	
		public void doPrestamo(int ciSocio, Fecha fechaPrestamo, Fecha fechaDevolucion,int codigoLibro)
		{
			Articulo_Libro libro = pPr.obtener(codigoLibro);
		}
		
		
		
		public void insertar(Articulo_Prestamo a)
		{
			lista.add(a);
		}
		
		
		
		public Articulo_Prestamo devolver(int i) 
		{
			return lista.get(i);
		}
		
		public Articulo_Prestamo obtener(int posicion) {
			return lista.get(posicion);
		}
		
}

