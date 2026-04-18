package paquete_sol;

public class PruebaListaInfaltil {

	
	
	public static void main(String[] args) {
		//b
		Infantil l1, l2, l3, l4;
		ListaLibro listado;
		
		
		l1 = new Infantil  ("1","La bella durmiente",500,200);
		l2 = new Infantil ("2","El Principito",5000,100);
		l3 = new Infantil ("3","El Hornero",5000,100);
		l4 = new Infantil ("4","El Huracan",5000,100);
		System.out.println(l1.toString());	
		System.out.println(l2.toString());	

	
		listado = new ListaLibro();	//a
		listado.agregar(l1);
		listado.agregar(l2);
		listado.agregar(l3);
		listado.agregar(l4);
		System.out.println(listado);	//c
		System.out.println("Borro el libro 2");
		listado.borrar(l2);	//d
		System.out.println(listado);
		boolean si = listado.estaLibro(l2);
		Infantil resul=new Infantil();
		if(si)	{
			System.out.println("El libro esta, sus datos son: ");
			resul=listado.obtenerXCodigo(l2.getCodigo());
			System.out.println(resul.toString());
		}else { 
			System.out.println("El libro no esta");
			}	
		System.out.println("Dado el codigo 4 sus obtengo sus datos: ");
		resul=listado.obtenerXCodigo(l4.getCodigo());
		System.out.println(resul.toString());
		
	}
	

	
	
	
	
}






