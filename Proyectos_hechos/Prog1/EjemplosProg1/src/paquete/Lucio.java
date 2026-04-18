package paquete;

import java.util.Scanner;

public class Lucio {


		public static void main(String[] args) {
		   String po="";
		   String lechen="";
		   String tafe="";
		   
			
			Scanner scanner  = new Scanner(System.in);
			System.out.println("eliga que opcion quiere  cafe o te, ingrese su opcion sin mayusculas, tildes o espacios, porfavor");
			 String tefe = scanner.nextLine();
	         	System.out.println("quiere su te o cafe con leche?, responda unicamente si o no");
			 String leche = scanner.nextLine();
			  if (leche=="si")
			  leche=" con leche";
			  else
			   leche=" sin leche";
			 	System.out.println("azucar?, responda unicamente si o no");
			 String az = scanner.nextLine();
			 if (az=="si")
			  az=" y con azucar";
			  else
			   az=" y sin azucar";
			 System.out.println("aqui su pedido"+tefe+leche+az+" con agua caliente");
			 
		    
		   }}
		    
		    