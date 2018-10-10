package es.upm.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class EmpleadoFactoriaTest {

    private EmpleadoFactoria factoria = EmpleadoFactoria.getInstance();

    @Test
    void testPutEmpleado() {
        Empleado empleado1 = new Empleado();
        empleado1.setId("1");
        factoria.put(empleado1);
        assertSame(empleado1, factoria.get(empleado1.getId()));
    }
}
