package modelo.conexion;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Factoría estática de conexiones a la base de datos.
 * Las credenciales se leen desde src/main/resources/db.properties.
 */
public class Conexion {

    private static final String ARCHIVO = "db.properties";

    // Las propiedades se cargan UNA SOLA VEZ cuando arranca la aplicación
    private static final Properties config = cargarPropiedades();

    private static Properties cargarPropiedades() {
        Properties props = new Properties();
        try (InputStream input = Conexion.class
                .getClassLoader()
                .getResourceAsStream(ARCHIVO)) {

            if (input == null) {
                System.err.println("ERROR: No se encontró " + ARCHIVO);
                return props;
            }
            props.load(input);

        } catch (Exception e) {
            System.err.println("ERROR al leer " + ARCHIVO);
            e.printStackTrace();
        }
        return props;
    }

    /**
     * Devuelve una nueva conexión a la base de datos.
     * Recuerda cerrarla con try-with-resources en el DAO.
     */
    public static Connection obtener() throws SQLException {
        String url      = config.getProperty("db.url");
        String usuario  = config.getProperty("db.username");
        String password = config.getProperty("db.password");
        return DriverManager.getConnection(url, usuario, password);
    }
}
