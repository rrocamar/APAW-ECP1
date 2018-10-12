package es.upm.entidades.composite;

import es.upm.entidades.Empleado;

public class EmpleadoHoja extends RestauranteComponente {

    private Empleado empleado;

    public EmpleadoHoja(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public void remove(RestauranteComponente componente) {
    }

    @Override
    public void add(RestauranteComponente componente) {
    }

    @Override
    public boolean isComponente() {
        return false;
    }

    @Override
    public String view() {
        return empleado.getId();
    }

    @Override
    public double getCoste() {
        return empleado.getSalarioBrutoAnual();
    }
}
