package Logica;

import java.util.ArrayList;

// La clase Mujer representa información sobre una mujer.
public class Mujer {
    // Definición de campos privados.
    private String nombre;
    private String segundo_nombre;
    private String apellido;
    private String segundo_apellido;
    private String nacionalidad;
    private String fecha_nacimiento;
    private String fecha_fallecimiento;
    private ArrayList<String> ocupacion;
    private String imagen;
    private String logro;

    // Constructor vac�o.
    public Mujer(){

    }

    // Constructor con par�metros para inicializar todos los campos.
    public Mujer(String nombre, String segundo_nombre, String apellido, String segundo_apellido,
            String nacionalidad, String fecha_nacimiento, String fecha_fallecimiento,
            ArrayList<String> ocupacion, String imagen, String logro){

        this.nombre = nombre;
        this.segundo_nombre = segundo_nombre;
        this.apellido = apellido;
        this.segundo_apellido = segundo_apellido;
        this.nacionalidad = nacionalidad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_fallecimiento = fecha_fallecimiento;
        this.ocupacion = ocupacion;
        this.imagen = imagen;
        this.logro = logro;
    }

    // M�todos getters y setters para acceder y modificar los campos privados.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_fallecimiento() {
        return fecha_fallecimiento;
    }

    public void setFecha_fallecimiento(String fecha_fallecimiento) {
        this.fecha_fallecimiento = fecha_fallecimiento;
    }

    public ArrayList<String> getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(ArrayList<String> ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getLogro() {
        return logro;
    }

    public void setLogro(String logro) {
        this.logro = logro;
    }
}
