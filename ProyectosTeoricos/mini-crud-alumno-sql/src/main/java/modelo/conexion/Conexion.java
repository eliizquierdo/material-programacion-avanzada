package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    /* Parametros de conexion */
    String bd = "institutoWeb";
    String login = "root";
    String password = "";
    String url = "jdbc:mysql://localhost/" + bd + "?useTimezone=true&serverTimezone=UTC";

    private Connection con = null;

    public boolean conectar() {
        try {
            if (con == null || con.isClosed()) {
                con = DriverManager.getConnection(url, login, password);
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean desconectar() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                con = null;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean estaConectado() {
        try {
            return (con != null && !con.isClosed());
        } catch (SQLException e) {
            return false;
        }
    }

    public Connection getConnection() {
        return con;
    }
}
