package es.upm.entidades.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HorasFormacionTest {

    private HorasFormacion horasFormacion = new HorasFormacion(140, 40, 0);

    @Test
    void testHorasFormacionEstrategiaEmpleadoMeGusta() {
        horasFormacion.setEstrategia(new EstrategiaEmpleadoMeGusta());
        assertEquals(120, horasFormacion.calculaHorasDisponibles());
    }

    @Test
    void testHorasFormacionEstrategiaEmpleadoMeEsIndiferente() {
        horasFormacion.setEstrategia(new EstrategiaEmpleadoMeEsIndiferente());
        assertEquals(80, horasFormacion.calculaHorasDisponibles());
    }

    @Test
    void testHorasFormacionEstrategiaEmpleadoNoMeGusta() {
        horasFormacion.setEstrategia(new EstrategiaEmpleadoNoMeGusta());
        assertEquals(60, horasFormacion.calculaHorasDisponibles());
    }
}
