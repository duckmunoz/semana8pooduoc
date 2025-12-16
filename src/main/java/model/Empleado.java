package model;

public class Empleado extends Entidad{

    private String antiguedad;

    @Override
    public String getTipo() {
        return "Empleado";
    }

    public Empleado(String nombre, String comuna, String antiguedad) {
        super(nombre,comuna);
        this.antiguedad = antiguedad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
