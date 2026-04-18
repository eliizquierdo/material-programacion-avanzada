package paquete;
import java.util.Scanner;

class Curbelo{
    public static void main (String[] args) {
        
        // Cafetería
        String opcion, taza = "";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Le gustaría una taza de té {T} o café {C}?");
        opcion = scanner.nextLine();
        if(opcion.equals("T")){
            taza = "Té";
        } else if (opcion.equals("C")){
            taza = "Café";
        } else {
            System.out.println("Opción no valida. Reintente.");
            scanner.close();
            return;
        }
        
        System.out.println("¿Le gustaría leche?");
        opcion = scanner.nextLine();
        if (opcion.equals("si")){
            taza = taza+ " con leche.";
        }
        
        System.out.println("¿Le gustaría azúcar?");
        opcion = scanner.nextLine();
        if (opcion.equals("si")){
            taza = taza+ " Azúcar";
        }
        taza = taza+ " y agua caliente";
        System.out.println("Aquí tiene su pedido: " +taza);
        System.out.println("=============================");
        
}}