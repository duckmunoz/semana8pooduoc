package model;

public class PlantaProceso extends Entidad {

    private String capacidadProceso;

    public PlantaProceso(String nombre, String comuna, String capacidadProceso) {
        super(nombre,comuna);
        this.capacidadProceso = capacidadProceso;

    }

    public String getCapacidadProceso() {
        return capacidadProceso;
    }

    @Override
    public String getTipo() {
        return "Planta de Procesos";
    }

    @Override
    public String toString(){
        return super.toString()+" Capacidad de proceso: "+capacidadProceso;
    }

}
