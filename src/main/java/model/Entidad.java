package model;

public abstract class Entidad {

    private String nombre;

    private String comuna;

    public Entidad() {
    }

    public abstract String getTipo();

    public Entidad(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }


    @Override
    public String toString() {
        return "Entidad{" +
                "nombre='" + nombre + '\'' +
                ", comuna='" + comuna + '\'' +
                '}';
    }
}
