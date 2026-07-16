package modelo.dao;

import modelo.vo.PersonaVO;
import java.util.ArrayList;

public class PersonaDAO {
    private ArrayList<PersonaVO> lista;

    public PersonaDAO() {
        lista = new ArrayList<>();
    }

    public String agregar(PersonaVO p) {
        lista.add(p);
        return "Persona agregada correctamente.";
    }

    public ArrayList<PersonaVO> getLista() {
        return lista;
    }

    public boolean estaPersona(int cod) {
        for (PersonaVO p : lista) {
            if (p.getCodigo() == cod) {
                return true;
            }
        }
        return false;
    }

    public PersonaVO devolver(int pos) {
        if (pos >= 0 && pos < lista.size()) {
            return lista.get(pos);
        }
        return null;
    }

    public String eliminar(int codigo) {
        for (PersonaVO p : lista) {
            if (p.getCodigo() == codigo) {
                lista.remove(p);
                return "Persona eliminada.";
            }
        }
        return "Persona no encontrada.";
    }

    public int cantidad() {
        return lista.size();
    }

    public PersonaVO obtenerXCodigo(int cod) {
        for (PersonaVO p : lista) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }

    public String actualizar(PersonaVO p) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCodigo() == p.getCodigo()) {
                lista.set(i, p);
                return "Persona actualizada.";
            }
        }
        return "Persona no encontrada.";
    }
}
