package Persistencia;

import java.sql.*;
import java.util.ArrayList;

import Logica.*;

// Clase que realiza consultas a la base de datos
public class Consultas {
    
	
	// M�todo para obtener informaci�n sobre una mujer dado su ID
    public void obtenerMujer(int id, Lista_Mujeres lista) {
        // Se utiliza try-with-resources para garantizar que las conexiones se cierren correctamente
        try (Conexion conexion = new Conexion()) {
            // Establece conexi�n con la base de datos
            conexion.conectar();
        
            // Define las consultas SQL para obtener informaci�n sobre la mujer, su ocupaci�n y su foto
            String queryMujer 		= "SELECT * FROM Mujer WHERE id = ?";
            String queryOcupacion	= "SELECT nombre FROM Ocupacion WHERE id_mujer = ?";
            
            // Crea un objeto Mujer para almacenar los datos obtenidos de la base de datos
            Mujer mujer = new Mujer();
            
            try (PreparedStatement statementMujer = conexion.getConnection().prepareStatement(queryMujer);
                 PreparedStatement statementOcupacion = conexion.getConnection().prepareStatement(queryOcupacion)) {
                
                // Establece los par�metros de las consultas preparadas
                statementMujer.setInt(1, id);
                statementOcupacion.setInt(1, id);
                
                // Ejecuta las consultas y procesa los resultados
                try (ResultSet rsMujer = statementMujer.executeQuery();
                     ResultSet rsOcupacion = statementOcupacion.executeQuery()) {
                    
                    // Procesa el resultado de la consulta de informaci�n sobre la mujer
                    while (rsMujer.next()) {
                        mujer.setNombre(rsMujer.getString				("nombre"));
                        mujer.setSegundo_nombre(rsMujer.getString		("nombre_2"));
                        mujer.setApellido(rsMujer.getString				("apellido"));
                        mujer.setSegundo_apellido(rsMujer.getString		("apellido_2"));
                        mujer.setNacionalidad(rsMujer.getString			("nacionalidad"));
                        mujer.setFecha_nacimiento(rsMujer.getString		("fecha_nac"));
                        mujer.setFecha_fallecimiento(rsMujer.getString	("fecha_fall"));
                        mujer.setImagen(rsMujer.getString				("foto"));
                        mujer.setLogro(rsMujer.getString  				("logro"));
                    }
                    ArrayList<String> ocupacion = new ArrayList<String>();
                    // Procesa el resultado de la consulta de la ocupaci n de la mujer
                    while (rsOcupacion.next()) {
                    	ocupacion.add(rsOcupacion.getString("nombre"));
                        
                    	mujer.setOcupacion(ocupacion);
                    }
                }
            }
            
            // Agrega la mujer a la lista
            lista.add(mujer);
            
        } catch (SQLException e) {
            // Maneja errores de SQL
            System.out.println("Error al obtener los datos: " + e.getMessage());
        }
    }
    
    // M�todo para obtener el tama�o de la Base de Datos (n�mero de mujeres)
    public void BdSize(Lista_Id lista) {
        // Se utiliza try-with-resources para garantizar que las conexiones se cierren correctamente
        try (Conexion conexion = new Conexion()) {
            // Establece conexi�n con la base de datos
            conexion.conectar();
        
            // Define la consulta SQL para obtener el ID de todas las mujeres
            String query = "SELECT id FROM Mujer";
            
            try (Statement statement = conexion.getConnection().createStatement();
                 ResultSet rs = statement.executeQuery(query)) {
                
                // Procesa el resultado de la consulta para obtener los IDs de las mujeres y los agrega a la lista
                while (rs.next()) {
                    int id = rs.getInt("id");
                    lista.add(id);
                }
            }
        } catch (SQLException e) {
            // Maneja errores de SQL
            System.out.println("Error al obtener los datos: " + e.getMessage());
        }
    }
}
