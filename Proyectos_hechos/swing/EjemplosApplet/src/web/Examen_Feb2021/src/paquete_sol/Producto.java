package paquete_sol;

public class Producto {

	private int codigo;
	private String nombre;
	private double costo;
   
   public Producto() {
	   
   }
   
   
   public Producto(int codigo, String nombre, double costo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.costo = costo;
	}

	public int getCodigo() {
		return codigo;
	}
	
		
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public double getCosto() {
		return costo;
	}
	
	
	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	@Override
	public String toString() {
		return "codigo=" + codigo + ", nombre=" + nombre + ", costo=" + costo;
	}

	public double precio() {
			
			double pre=costo;
			if (costo>200)
				pre=pre*1.30;  //o pre-pre*0.20;
			else
				pre=pre*1.20;
			return pre;
		}
	
	  
	   
} 


