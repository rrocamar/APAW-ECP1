package es.upm.entidades.strategy;

public abstract class EstrategiaCalculoHoras {

    public abstract int calculaHorasDisponibles(int horasAcumuladas, int horasBonificables, int horasUtilizadas);
}
