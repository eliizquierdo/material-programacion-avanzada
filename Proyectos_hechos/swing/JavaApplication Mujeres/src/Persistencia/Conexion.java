package Persistencia;
import java.sql.*;

// Clase para gestionar la conexi�n con la base de datos MySQL
public final class Conexion implements AutoCloseable {

    // Datos de conexi�n a la base de datos
    private static final String BD = "Repaso";
    private static final String LOGIN = "admin123";
    private static final String PASSWORD = "4448f69b";
    private static final String URL = "jdbc:mysql://localhost/" + BD + "?useTimezone=true&serverTimezone=UTC";

    // Objeto de conexi�n
    private Connection connection;

    // Constructor de la clase
    public Conexion() {
        conectar();
    }

    // Método para obtener la conexión actual
    public Connection getConnection() {
        return connection;
    }

    // M�todo para establecer conexi�n con la base de datos
    public void conectar() {
        try {
            // Carga el driver de conexi�n para MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establece la conexi�n con la base de datos
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            // Verifica si la conexi�n fue exitosa
            if (connection != null) {
                //System.out.println("Conexi�n a base de datos " + BD + " OK\n");
            }
        } catch (SQLException e) {
            // Manejo de errores para problemas de SQL
            //System.out.println("SQLException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            // Manejo de errores si no se encuentra el driver de MySQL
            System.out.println("ClassNotFoundException: " + e.getMessage());
        } catch (Exception e) {
            // Manejo de cualquier otro error
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // M�todo para desconectar de la base de datos
    public void desconectar() {
        try {
            // Cierra la conexi�n con la base de datos
            if (connection != null && !connection.isClosed()) {
                connection.close();
                //System.out.println("Desconectado de base de datos " + BD + " OK\n");
            }
        } catch (SQLException e) {
            // Manejo de errores al intentar cerrar la conexi�n
            System.out.println("Error al desconectar: " + e.getMessage());
        }
    }

    // M�todo para cerrar la conexi�n cuando se utiliza try-with-resources
    @Override
    public void close() throws SQLException {
        desconectar();
    }
}
