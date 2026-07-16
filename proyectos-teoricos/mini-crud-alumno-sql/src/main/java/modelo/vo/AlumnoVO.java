package modelo.vo;

public class AlumnoVO extends PersonaVO {
    private String telefono;

    // Constructor vacío
    public AlumnoVO() {
        super();
    }

    // Constructor completo (para cuando ya existe el código)
    public AlumnoVO(int codigo, String nombre, String telefono) {
        super(codigo, nombre);
        this.telefono = telefono;
    }

    // Constructor sin código (para INSERT - código autoincremental)
    public AlumnoVO(String nombre, String telefono) {
        super();
        this.setNombre(nombre);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "AlumnoVO{" +
                "codigo=" + getCodigo() +
                ", nombre='" + getNombre() + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
