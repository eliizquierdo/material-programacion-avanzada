package modelo.dao;

import modelo.conexion.Conexion;
import modelo.vo.GuerreroVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuerreroDAO {

    public List<GuerreroVO> listarGuerreros() {

        List<GuerreroVO> lista = new ArrayList<>();
        Conexion cn = new Conexion(); // Se inicializa para asegurar el acceso a 'conectar' y 'desconectar'
        Connection con = null;
        PreparedStatement ps = null;
        java.sql.ResultSet rs = null; // Usar java.sql.ResultSet por claridad

        try {
            // FASE 1: Establecer conexión con la BBDD
            if (cn.conectar()) {
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "SELECT id, nombre, fuerza, nivel FROM guerrero";

                // FASE 3: Crear PreparedStatement (No hay parámetros que asignar)
                ps = con.prepareStatement(sql);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Procesar el ResultSet
                while (rs.next()) {
                    GuerreroVO guerrero = new GuerreroVO(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getInt("fuerza"),
                            rs.getInt("nivel"));
                    lista.add(guerrero);
                }
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Error al listar guerreros: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                // Cerrar ResultSet, PreparedStatement y Connection en orden inverso
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                cn.desconectar(); // Desconecta la conexión
            } catch (java.sql.SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean agregarGuerrero(GuerreroVO guerrero) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "INSERT INTO guerrero(nombre, fuerza, nivel) VALUES (?, ?, ?)";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setString(1, guerrero.getNombre());
                ps.setInt(2, guerrero.getFuerza());
                ps.setInt(3, guerrero.getNivel());

                // FASE 4: Ejecutar la sentencia SQL
                int filasAfectadas = ps.executeUpdate();
                exito = filasAfectadas > 0;

                System.out.println("Guerrero agregado: " + guerrero.toString());
            }
            // NO HAY FASE 5: INSERT no retorna ResultSet
        } catch (SQLException e) {
            System.err.println("Error al agregar guerrero: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                // Cerrar PreparedStatement y Connection
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }
}