package paquete_sol;


public class PruebaProductos {

	public static void main(String[] args) {
		
		
		Producto p1=new Producto(1,"Cuaderno",20);
		Producto p2=new Producto(2,"Lapiz",10);
		Limpieza l1=new Limpieza(3,"Hipoclorito",200,2020);
		double pre=l1.precio();
		System.out.println("El precio del producto 3 es: "+pre);
		ListaProducto listado=new  ListaProducto();
		listado.agregar(p1);
		listado.agregar(p2);
		listado.agregar(l1);
		System.out.println("Los datos de los productos son: "+listado.toString());
		boolean esta=listado.estaProducto(2);
		if (esta)
			System.out.println("El producto 2 esta");
		else
			System.out.println("El producto no esta");
		
		
	/*	AgregarLibro2 vent=new AgregarLibro2();
		vent.setVisible(true);
		vent.pack();
		*/
	}


}





