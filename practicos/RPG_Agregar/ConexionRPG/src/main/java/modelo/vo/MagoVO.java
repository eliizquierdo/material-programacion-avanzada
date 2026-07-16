package modelo.vo;

public class MagoVO {
    private int id;
    private String nombre;
    private int poder;
    private int nivel;

    public MagoVO() {

    }

    public MagoVO(int id, String nombre, int fuerza, int nivel) {
        this.id = id;
        this.nombre = nombre;
        this.poder = fuerza;
        this.nivel = nivel;
    }

    public MagoVO(String nombre, int fuerza, int nivel) {
        this.nombre = nombre;
        this.poder = fuerza;
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
    public int getPoder() {
        return poder;
    }
    public void setPoder(int fuerza) {
        this.poder = fuerza;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
