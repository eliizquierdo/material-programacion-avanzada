package paquete;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
      System.out.println("Ingrese un número: ");
      int num=entrada.nextInt();
      int resul=cuadrado(num);
      System.out.println("El cuadrado es: "+resul);
      //prueba parte b
      resul=triple(num);
      System.out.println("El triple es: "+resul);
    //prueba parte c
      resul=triple(num);
      System.out.println("El triple es: "+resul);
      //prueba de división
      System.out.println("Ingrese un número: ");
      double nro1=entrada.nextDouble();      
      System.out.println("Ingrese un número: ");
      double nro2=entrada.nextDouble(); 
      double resultado=divide(nro1,nro2);
      System.out.println("La división da: "+resultado);
      double prom=promedio(3,4,6);
      System.out.println("Elpromedio es: "+prom);
  }
  
  public static int cuadrado(int nro1 ){
   
    return nro1*nro1;
  }

  //Parte b
  //triple: int→int
  public static int triple(int num2) {
	  return num2*3;
	  
  }

  //Parte c
  // mitad: int→int
  
  

  //Parte d
  // cubo: int→int
  
  
  
  //Parte e
  //elDobleMas4: int → int
  
  
  
  //Parte f
  //resto2: int→ int
  
  
  //parte g
  //divide:double→ (double, double)
  public static double divide(double num1, double num2) {
	  double resul=0;
	  
	  if (num2!=0)
		  resul=num1/num2;
	  
	return resul;  
	    
  }
  
  //parte h
  //promedio:double→(int, int, int)
  public static double promedio(int num1, int num2, int num3) {
	  double suma=0;
	  double div=0;
	  
	  suma=(num1+ num2+ num3);
	  div=suma/3;
	  
	  return div;
	  
  }
  
  
}

