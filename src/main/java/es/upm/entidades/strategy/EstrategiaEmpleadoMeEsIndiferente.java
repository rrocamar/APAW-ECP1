package es.upm.entidades.strategy;

public class EstrategiaEmpleadoMeEsIndiferente extends EstrategiaCalculoHoras {

    @Override
    public int calculaHorasDisponibles(int horasAcumuladas, int horasBonificables, int horasUtilizadas) {
        if (horasAcumuladas > getMaximoHorasAcumulables())
            horasAcumuladas = getMaximoHorasAcumulables();
        int horasDisponibles = horasAcumuladas - horasUtilizadas - horasBonificables / 2;

        return horasDisponibles;
    }
}
