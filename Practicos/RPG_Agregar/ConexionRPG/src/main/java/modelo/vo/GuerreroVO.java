package modelo.vo;

public class GuerreroVO {
    private int id;
    private String nombre;
    private int fuerza;
    private int nivel;

    public GuerreroVO() {

    }

    public GuerreroVO(int id, String nombre, int fuerza, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.nivel = nivel;
    }

    public GuerreroVO(String nombre, int fuerza, int nivel) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.nivel = nivel;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

