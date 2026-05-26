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
        String sql = "SELECT p.codigo, p.nombre, a.telefono " +
                "FROM personas p " +
                "INNER JOIN alumnos a ON p.codigo = a.codigo";

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new AlumnoVO(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("telefono")));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar alumnos: " + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    // ============== OBTENER ALUMNO POR CÓDIGO ==============
    public AlumnoVO obtenerAlumnoPorCodigo(int codigo) {
        String sql = "SELECT p.codigo, p.nombre, a.telefono " +
                "FROM personas p " +
                "INNER JOIN alumnos a ON p.codigo = a.codigo " +
                "WHERE p.codigo = ?";
        AlumnoVO alumno = null;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
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
        }
        return alumno;
    }

    // ============== AGREGAR ALUMNO ==============
    public boolean agregarAlumno(AlumnoVO alumno) {
        String sql1 = "INSERT INTO personas(codigo, nombre) VALUES (?, ?)";
        String sql2 = "INSERT INTO alumnos(codigo, telefono) VALUES (?, ?)";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps1 = con.prepareStatement(sql1);
             PreparedStatement ps2 = con.prepareStatement(sql2)) {

            ps1.setInt(1, alumno.getCodigo());
            ps1.setString(2, alumno.getNombre());

            ps2.setInt(1, alumno.getCodigo());
            ps2.setString(2, alumno.getTelefono());

            int filasPersonas = ps1.executeUpdate();
            int filasAlumnos  = ps2.executeUpdate();
            exito = filasPersonas > 0 && filasAlumnos > 0;

            System.out.println("Alumno agregado: " + alumno);
        } catch (SQLException e) {
            System.err.println("Error al agregar alumno: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }

    // ============== ACTUALIZAR ALUMNO ==============
    public boolean actualizarAlumno(AlumnoVO alumno) {
        String sql1 = "UPDATE personas SET nombre = ? WHERE codigo = ?";
        String sql2 = "UPDATE alumnos SET telefono = ? WHERE codigo = ?";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps1 = con.prepareStatement(sql1);
             PreparedStatement ps2 = con.prepareStatement(sql2)) {

            ps1.setString(1, alumno.getNombre());
            ps1.setInt(2, alumno.getCodigo());

            ps2.setString(1, alumno.getTelefono());
            ps2.setInt(2, alumno.getCodigo());

            int filasPersona = ps1.executeUpdate();
            int filasAlumno  = ps2.executeUpdate();
            exito = filasPersona > 0 && filasAlumno > 0;

            if (exito) System.out.println("Alumno actualizado: " + alumno);
            else System.out.println("No se encontró alumno con código " + alumno.getCodigo());
        } catch (SQLException e) {
            System.err.println("Error al actualizar alumno: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }

    // ============== ELIMINAR ALUMNO ==============
    public boolean eliminarAlumno(int codigo) {
        String sql = "DELETE FROM personas WHERE codigo = ?";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            exito = ps.executeUpdate() > 0;

            if (exito) System.out.println("Alumno " + codigo + " eliminado");
            else System.out.println("No se encontró alumno con código " + codigo);
        } catch (SQLException e) {
            System.err.println("Error al eliminar alumno: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }
}
