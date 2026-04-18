package paquete_sol;

public class Limpieza extends Producto{
	private int vencimiento;

	public Limpieza(int codigo, String nombre, double costo, int vencimiento) {
		super(codigo, nombre, costo);
		this.vencimiento = vencimiento;
	}

	public int getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}

	@Override
	public String toString() {
		return super.toString()+ " vencimiento=" + vencimiento;
	}
	
	@Override
	public double precio() {
		
		double pre=super.getCosto();
		if (vencimiento>2021)
			pre=pre*0.80;  //o pre-pre*0.20;
		else
			pre=pre*0.90;
		return pre;
	}

}
