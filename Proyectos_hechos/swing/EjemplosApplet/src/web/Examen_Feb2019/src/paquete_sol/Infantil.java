package paquete_sol;

public class Infantil extends Libro{
	private int cantHojas;
	
	public Infantil() {
		
	}
	
	public Infantil(String codigo, String nombre, double precio, int cantHojas) {
		super(codigo, nombre,precio);
		this.cantHojas = cantHojas;
	}

	

	public int getCantHojas() {
		return cantHojas;
	}



	public void setCantHojas(int cantHojas) {
		this.cantHojas = cantHojas;
	}



	@Override
	public String toString() {
		return super.toString()+ ", cantHojas= "+ this.cantHojas;
	}
	
	public boolean libroLargo() {
		   boolean esLargo=false;
			   
		   if(this.getCantHojas()>=500)
				  esLargo=true;
		   return esLargo;
		}
		   
	
	

}
