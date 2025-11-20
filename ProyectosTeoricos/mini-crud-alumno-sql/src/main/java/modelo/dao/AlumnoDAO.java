package modelo.dao;

import modelo.conexion.Conexion;
import modelo.vo.AlumnoVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoDAO {

    // ============== LISTAR ALUMNOS ==============
    public List<AlumnoVO> listarAlumnos() {
        List<AlumnoVO> lista = new ArrayList<>();

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                // Realizamos un JOIN entre alumno y persona para obtener todos los datos
                String sql = "SELECT p.codigo, p.nombre, a.telefono " +
                        "FROM personas p " +
                        "INNER JOIN alumnos a ON p.codigo = a.codigo";

                // FASE 3: Crear PreparedStatement
                ps = con.prepareStatement(sql);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Leer el ResultSet
                while (rs.next()) {
                    AlumnoVO alumno = new AlumnoVO(
                            rs.getInt("codigo"),
                            rs.getString("nombre"),
                            rs.getString("telefono"));
                    lista.add(alumno);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al listar alumnos: " + e.getMessage());
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

    // ============== OBTENER ALUMNO POR CÓDIGO ==============
    public AlumnoVO obtenerAlumnoPorCodigo(int codigo) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        AlumnoVO alumno = null;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                // Realizamos un JOIN para obtener datos de persona y alumno
                String sql = "SELECT p.codigo, p.nombre, a.telefono " +
                        "FROM personas p " +
                        "INNER JOIN alumnos a ON p.codigo = a.codigo " +
                        "WHERE p.codigo = ?";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);

                // FASE 4: Ejecutar la sentencia SQL
                rs = ps.executeQuery();

                // FASE 5: Leer el ResultSet
                if (rs.next()) {
                    alumno = new AlumnoVO(
                            rs.getInt("codigo"),
                            rs.getString("nombre"),
                            rs.getString("telefono"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener alumno: " + e.getMessage());
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
        return alumno;
    }

    // ============== AGREGAR ALUMNO ==============
    public boolean agregarAlumno(AlumnoVO alumno) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                String sql1 = "INSERT INTO personas(codigo, nombre) VALUES (?, ?)";
                String sql2 = "INSERT INTO alumnos(codigo, telefono) VALUES (?, ?)";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps1 = con.prepareStatement(sql1);
                ps1.setInt(1, alumno.getCodigo());
                ps1.setString(2, alumno.getNombre());

                ps2 = con.prepareStatement(sql2);
                ps2.setInt(1, alumno.getCodigo());
                ps2.setString(2, alumno.getTelefono());

                // FASE 4: Ejecutar la sentencia SQL
                int filasPersonas = ps1.executeUpdate();
                int filasAlumnos = ps2.executeUpdate();
                if ((filasPersonas > 0) && (filasAlumnos > 0))
                    exito = true;

                System.out.println("Alumno agregado: " + alumno.toString());
            }
            // NO HAY FASE 5: INSERT no retorna ResultSet
        } catch (SQLException e) {
            System.err.println("Error al agregar alumno: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (ps1 != null)
                    ps1.close();
                if (ps2 != null)
                    ps2.close();
                cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }

    // ============== ACTUALIZAR ALUMNO ==============
    public boolean actualizarAlumno(AlumnoVO alumno) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir las sentencias SQL
                // Actualizamos tanto persona como alumno
                String sql1 = "UPDATE personas SET nombre = ? WHERE codigo = ?";
                String sql2 = "UPDATE alumnos SET telefono = ? WHERE codigo = ?";

                // FASE 3: Crear PreparedStatements y asignar parámetros
                // Actualizar persona
                ps1 = con.prepareStatement(sql1);
                ps1.setString(1, alumno.getNombre());
                ps1.setInt(2, alumno.getCodigo());

                // Actualizar alumno
                ps2 = con.prepareStatement(sql2);
                ps2.setString(1, alumno.getTelefono());
                ps2.setInt(2, alumno.getCodigo());

                // FASE 4: Ejecutar las sentencias SQL
                int filasPersona = ps1.executeUpdate();
                int filasAlumno = ps2.executeUpdate();

                // Confirmar transacción si al menos se actualizó persona
                if ((filasPersona > 0) && (filasAlumno) > 0) {
                    exito = true;
                    System.out.println("Alumno actualizado: " + alumno.toString());
                } else {
                    System.out.println("No se encontró alumno con código " + alumno.getCodigo());
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar alumno: " + e.getMessage());
            e.printStackTrace();
            System.err.println("Error al hacer rollback: " + e.getMessage());

        } finally {
            try {
                if (ps1 != null)
                    ps1.close();
                if (ps2 != null)
                    ps2.close();
                if (con != null)
                    cn.desconectar();
            } catch (SQLException e) {
                System.err.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return exito;
    }

    // ============== ELIMINAR ALUMNO ==============
    public boolean eliminarAlumno(int codigo) {

        Conexion cn = new Conexion();
        Connection con = null;
        PreparedStatement ps = null;
        boolean exito = false;

        try {
            if (cn.conectar()) {
                // FASE 1: Establecer conexión con la BBDD
                con = cn.getConnection();

                // FASE 2: Definir la sentencia SQL
                // Solo eliminamos de persona, el CASCADE eliminará de alumno automáticamente
                String sql = "DELETE FROM personas WHERE codigo = ?";

                // FASE 3: Crear PreparedStatement y asignar parámetros
                ps = con.prepareStatement(sql);
                ps.setInt(1, codigo);

                // FASE 4: Ejecutar la sentencia SQL
                int filasAfectadas = ps.executeUpdate();
                exito = filasAfectadas > 0;

                if (exito) {
                    System.out.println("Alumno con código " + codigo + " eliminado exitosamente");
                } else {
                    System.out.println("No se encontró alumno con código " + codigo);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar alumno: " + e.getMessage());
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

}