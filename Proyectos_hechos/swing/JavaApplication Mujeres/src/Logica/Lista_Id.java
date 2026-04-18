package Logica;

import java.util.ArrayList;

// La clase Lista_Id representa una lista de identificadores (IDs) enteros.
public class Lista_Id {
    // ArrayList para almacenar los IDs enteros.
    private ArrayList<Integer> lista;
    
    // Constructor que inicializa la lista de IDs.
    public Lista_Id() {
        lista = new ArrayList<Integer>();
    }
    
    // Método para agregar un ID a la lista.
    public void add(int id) {
        lista.add(id);
    }
    
    // Método para obtener un ID por su índice en la lista.
    public int get(int id) {
        return lista.get(id);
    }
    
    // Método para obtener el tamaño de la lista de IDs.
    public int size() {
        return lista.size();
    }
}
