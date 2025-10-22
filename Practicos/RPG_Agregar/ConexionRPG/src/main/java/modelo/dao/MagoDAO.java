package modelo.dao;

import modelo.conexion.Conexion;
import modelo.vo.MagoVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MagoDAO {

    public List<MagoVO> listarMagos() {
        List<MagoVO> lista = new ArrayList<>();
        Conexion cn = new Conexion(); // Se inicializa para asegurar el acceso a 'conectar' y 'desconectar'
        Connection con = null;
        PreparedStatement ps = null;
        java.sql.ResultSet rs = null; // Usar java.sql.ResultSet por claridad

        try {
            // FASE 1: Establecer conexión con la BBDD
            if (cn.conectar()) {
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "SELECT id, nombre, poder, nivel FROM mago";

                // FASE 3: Crear PreparedStatement (No hay parámetros que asignar)
                ps = con.prepareStatement(sql);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Procesar el ResultSet
                while (rs.next()) {
                    MagoVO mago = new MagoVO(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getInt("poder"),
                            rs.getInt("nivel"));
                    lista.add(mago);
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

    public boolean agregarMago(MagoVO mago) {
        // completar <------------------------------------------------------

    }
}
