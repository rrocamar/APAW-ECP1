package es.upm.entidades.strategy;

public class EstrategiaEmpleadoMeGusta extends EstrategiaCalculoHoras {

    @Override
    public int calculaHorasDisponibles(int horasAcumuladas, int horasBonificables, int horasUtilizadas) {
        int horasDisponibles = horasAcumuladas - horasUtilizadas - horasBonificables / 2;
        if (horasDisponibles > 20)
            return horasDisponibles;
        else
            return 20;
    }
}
