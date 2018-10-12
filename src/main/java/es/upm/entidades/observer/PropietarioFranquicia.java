package es.upm.entidades.observer;

import java.util.HashSet;
import java.util.Set;

public class PropietarioFranquicia implements Observer {

    private Set<String> cuentas;

    public PropietarioFranquicia() {
        this.cuentas = new HashSet<>();
    }

    @Override
    public void update(String idRestaurante) {
        this.crearCuentaBancaria(idRestaurante);
    }

    public void crearCuentaBancaria(String idRestaurante) {
        this.cuentas.add(idRestaurante);
    }

    public boolean existeCuentaBancaria(String idRestaurante) {
        return cuentas.contains(idRestaurante);
    }
}
