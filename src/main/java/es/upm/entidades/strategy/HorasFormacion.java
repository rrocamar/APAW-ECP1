package es.upm.entidades.strategy;

import es.upm.entidades.Empleado;

public class HorasFormacion {

    private int horasBonificables;

    private int horasAcumuladas;

    private int horasUtilizadas;

    private EstrategiaCalculoHoras estrategia;

    public HorasFormacion(Empleado empleado, EstrategiaCalculoHoras estrategia) {
        //Inicializa las horas de formacion disponibles para el empleado que se pasa por parametro

    }

    HorasFormacion(int horasAcumuladas, int horasBonificables, int horasUtilizadas) {
        this.horasAcumuladas = horasAcumuladas;
        this.horasBonificables = horasBonificables;
        this.horasUtilizadas = horasUtilizadas;
    }

    public int getHorasBonificables() {
        return horasBonificables;
    }

    public int getHorasAcumuladas() {
        return horasAcumuladas;
    }

    public int getHorasUtilizadas() {
        return horasUtilizadas;
    }

    public void setEstrategia(EstrategiaCalculoHoras estrategia) {
        this.estrategia = estrategia;
    }

    public int calculaHorasDisponibles() {
        return estrategia.calculaHorasDisponibles(this.getHorasAcumuladas(), this.getHorasBonificables(), this.getHorasUtilizadas());
    }
}
