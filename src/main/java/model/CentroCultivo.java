package model;

public class CentroCultivo extends Entidad {

    private String toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, String toneladasProduccion) {
        super(nombre,comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    public String getToneladasProduccion() {
        return toneladasProduccion;
    }


    @Override
    public String getTipo() {
        return "Centro de cultivo";
    }

    @Override
    public String toString(){
        return super.toString() +" Capacidad de produccion: "+toneladasProduccion;
    }
}
