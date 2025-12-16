package repository;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class EntidadRepositorio {

    private static EntidadRepositorio instancia;

    private List<Entidad> entidades;

    private EntidadRepositorio() {
        entidades = new ArrayList<>();
        inicializarDaatos();
    }

    public static EntidadRepositorio getInstancia() {
        if (instancia == null) {
            instancia = new EntidadRepositorio();
        }
        return instancia;
    }

    private void inicializarDaatos() {
        entidades.add(new PlantaProceso(
                "Planta 1",
                "Santiago",
                "5000"
        ));
        entidades.add(new CentroCultivo(
                "Centro 1",
                "Valparaiso",
                "1000"
        ));
        entidades.add(new Proveedor(
                "Corriente",
                "San antonio",
                "100000"
        ));
        entidades.add(new Empleado(
                "Juan Antonio",
                "Huechuraba",
                "2 años"
        ));
    }

    public List<Entidad> obtenerEntidades() {
        return new ArrayList<>(entidades);
    }

    public void agregarEntidad(Entidad entidad) {
        entidades.add(entidad);
    }

    public void eliminarEntidad(Entidad entidad) {
        entidades.remove(entidad);
    }
}
