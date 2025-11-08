package modelo.dao;

import modelo.conexion.Conexion;
import modelo.vo.PersonaVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public List<PersonaVO> listarPersonas() {
        List<PersonaVO> lista = new ArrayList<>();

        // FASE 1: Establecer conexión con la BBDD
        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            if (cn.conectar()) {
                con = cn.getConnection();
                // FASE 2: Definir la sentencia SQL
                String sql = "SELECT * FROM persona";

                // FASE 3: Crear PreparedStatement
                ps = con.prepareStatement(sql);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Leer el ResultSet
                while (rs.next()) {
                    PersonaVO persona = new PersonaVO(
                            rs.getInt("codigo"),
                            rs.getString("nombre"));
                    lista.add(persona);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar personas: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Cerrar recursos en orden inverso
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return lista;
    }

    public boolean agregarPersona(PersonaVO persona) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "INSERT INTO persona(codigo, nombre) VALUES (?, ?)";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setInt(1, persona.getCodigo());
                ps.setString(2, persona.getNombre());

                // FASE 4: Ejecutar la sentencia SQL
                int filasAfectadas = ps.executeUpdate();
                exito = filasAfectadas > 0;

                System.out.println("Persona agregada: " + persona.toString());
            }
            // NO HAY FASE 5: INSERT no retorna ResultSet
        } catch (SQLException e) {
            System.err.println("Error al agregar persona: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }

    public boolean actualizarPersona(PersonaVO persona) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "UPDATE persona SET nombre = ? WHERE codigo = ?";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setString(1, persona.getNombre());
                ps.setInt(2, persona.getCodigo());

                // FASE 4: Ejecutar la sentencia SQL
                int filasAfectadas = ps.executeUpdate();
                exito = filasAfectadas > 0;

                if (exito) {
                    System.out.println("Persona actualizada: " + persona.toString());
                } else {
                    System.out.println("No se encontró persona con código " + persona.getCodigo());
                }
            }
            // NO HAY FASE 5: UPDATE no retorna ResultSet
        } catch (SQLException e) {
            System.err.println("Error al actualizar persona: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }

    public boolean eliminarPersona(int codigo) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "DELETE FROM persona WHERE codigo = ?";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);

                // FASE 4: Ejecutar la sentencia SQL
                int filasAfectadas = ps.executeUpdate();
                exito = filasAfectadas > 0;

                if (exito) {
                    System.out.println("Persona con código " + codigo + " eliminada exitosamente");
                } else {
                    System.out.println("No se encontró persona con código " + codigo);
                }
            }
            // NO HAY FASE 5: DELETE no retorna ResultSet
        } catch (SQLException e) {
            System.err.println("Error al eliminar persona: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }

    public PersonaVO obtenerPersonaPorCodigo(int codigo) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        PersonaVO persona = null;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql = "SELECT * FROM persona WHERE codigo = ?";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Leer el ResultSet
                if (rs.next()) {
                    persona = new PersonaVO(
                            rs.getInt("codigo"),
                            rs.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener persona: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null)
                    rs.close();
                if (ps != null)
                    ps.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return persona;
    }

}