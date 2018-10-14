package es.upm.entidades.strategy;

public abstract class EstrategiaCalculoHoras {

    public static final int NUMERO_MAXIMO_HORAS_ACUMULABLES = 100;

    public int getMaximoHorasAcumulables() {
        return NUMERO_MAXIMO_HORAS_ACUMULABLES;
    }

    public abstract int calculaHorasDisponibles(int horasAcumuladas, int horasBonificables, int horasUtilizadas);
}
