package modelo.dao;

import modelo.conexion.Conexion;
import modelo.vo.PersonaVO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public List<PersonaVO> listarPersonas() {
        List<PersonaVO> lista = new ArrayList<>();
        String sql = "SELECT * FROM persona";

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                lista.add(new PersonaVO(
                        rs.getInt("codigo"),
                        rs.getString("nombre")));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar personas: " + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }

    public boolean agregarPersona(PersonaVO persona) {
        String sql = "INSERT INTO persona(codigo, nombre) VALUES (?, ?)";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, persona.getCodigo());
            ps.setString(2, persona.getNombre());
            exito = ps.executeUpdate() > 0;
            System.out.println("Persona agregada: " + persona);
        } catch (SQLException e) {
            System.err.println("Error al agregar persona: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }

    public boolean actualizarPersona(PersonaVO persona) {
        String sql = "UPDATE persona SET nombre = ? WHERE codigo = ?";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, persona.getNombre());
            ps.setInt(2, persona.getCodigo());
            exito = ps.executeUpdate() > 0;

            if (exito) System.out.println("Persona actualizada: " + persona);
            else System.out.println("No se encontró persona con código " + persona.getCodigo());
        } catch (SQLException e) {
            System.err.println("Error al actualizar persona: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }

    public boolean eliminarPersona(int codigo) {
        String sql = "DELETE FROM persona WHERE codigo = ?";
        boolean exito = false;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            exito = ps.executeUpdate() > 0;

            if (exito) System.out.println("Persona " + codigo + " eliminada");
            else System.out.println("No se encontró persona con código " + codigo);
        } catch (SQLException e) {
            System.err.println("Error al eliminar persona: " + e.getMessage());
            e.printStackTrace();
        }
        return exito;
    }

    public PersonaVO obtenerPersonaPorCodigo(int codigo) {
        String sql = "SELECT * FROM persona WHERE codigo = ?";
        PersonaVO persona = null;

        try (Connection con = Conexion.obtener();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    persona = new PersonaVO(
                            rs.getInt("codigo"),
                            rs.getString("nombre"));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener persona: " + e.getMessage());
            e.printStackTrace();
        }
        return persona;
    }
}
