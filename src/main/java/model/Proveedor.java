package model;

public class Proveedor extends Entidad{

    private String cantidadToneladas;

    @Override
    public String getTipo() {
        return "Proveedor";
    }

    public Proveedor(String nombre, String comuna, String cantidadToneladas) {
        super(nombre,comuna);
        this.cantidadToneladas = cantidadToneladas;
    }

    public String getCantidadToneladas() {
        return cantidadToneladas;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
