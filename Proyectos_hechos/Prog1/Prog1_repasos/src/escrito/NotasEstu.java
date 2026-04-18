package escrito;

import java.util.Random;

/*clase para cargar las notas en un array 
 * cada nota se carga en el índice del array
 *notas, ejemplo si hay 20 estudiantes con nota 5
 * en el array notas[5] = 20;*/

public class NotasEstu {

	private int[] notas;

	/*Crear el constructor que inicializa el array 
	 * con tamaño de 13 */
	
	public NotasEstu() {
		notas=new int[13];
	}


	/* recibe cantidad de estudiantes y 
	 * carga las notas de forma aleatoria entre 1 y 12*/
	public void cargarNotas(int cantEstu) {
		Random rn=new Random();
		int i=rn.nextInt(13);
		do{
			notas[i]=rn.nextInt(cantEstu);
			System.out.println("notas["+i+"]:"+notas[i]);
			cantEstu=cantEstu-notas[i];
			i++;
			
		}while(i<13);
	}
	
	public void mostrarNotas() {
		
		for (int i=0; i<13; i++) {
			System.out.println(notas[i]+" ");
			
		}
	}

/*retorna la nota más frecuente 
 * (recuerde que la Nota  corresponde al índice del array 
 * ejemplo: la nota 12 está en la posición 12 del array notas)*/
	public int NotaMasFrec() {
		int notafrecuente;

		return 0;
	}

/*cuántos estudiantes tienen la nota que recibe
 *  el método como parámetro */
	public int cantEstudiantes(int n) {

		return 0;
	}
}
