package escrito;
import java.util.*;

public 	class Main {
		public static void main(String[] a){
			NotasEstu nt=new NotasEstu();
			Scanner sc=new Scanner(System.in);
			System.out.println("Ingrese cant estudiantes: "); 
			int cant=sc.nextInt();
			nt.cargarNotas(cant);
			nt.mostrarNotas();
		// respetando el código que se muestra en pantalla, completa
		// lo necesario para el funcionamiento requerido

			//System.out.println("La nota con más estudiantes es : " "+ nt.NotaMasFrec() );




		/*int nota = sc.nextInt()
		System.out.println("Cantidad de estudiantes con  "+ nt.cantEstudiantes( int nota) );
		*/}
	}

