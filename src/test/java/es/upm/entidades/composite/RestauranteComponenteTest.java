package es.upm.entidades.composite;

import es.upm.entidades.Empleado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestauranteComponenteTest {

    private RestauranteComponente restaurante, barra, comedor, cocina, administracion,
            empleado1, empleado2, empleado3, empleado4, empleado5, empleado6, empleado7;

    @BeforeEach
    void before() {
        restaurante = new EmpleadoCompuesto("Franquicia numero 13");
        barra = new EmpleadoCompuesto("Barra");
        restaurante.add(barra);
        comedor = new EmpleadoCompuesto("Comedor");
        restaurante.add(comedor);
        cocina = new EmpleadoCompuesto("Cocina");
        restaurante.add(cocina);
        administracion = new EmpleadoCompuesto("Administracion");
        restaurante.add(administracion);
        Empleado empleado = new Empleado();
        empleado.setId("1");
        empleado.setNombre("Pepe Camarero Barra");
        empleado1 = new EmpleadoHoja(empleado);
        barra.add(empleado1);
        empleado = new Empleado();
        empleado.setId("2");
        empleado.setNombre("Pedro Camarero Barra");
        empleado2 = new EmpleadoHoja(empleado);
        barra.add(empleado2);
        empleado = new Empleado();
        empleado.setId("3");
        empleado.setNombre("Laura Camarera Comedor");
        empleado3 = new EmpleadoHoja(empleado);
        comedor.add(empleado3);
        empleado = new Empleado();
        empleado.setId("4");
        empleado.setNombre("Alberto Camarero Comedor");
        empleado4 = new EmpleadoHoja(empleado);
        comedor.add(empleado4);
        empleado = new Empleado();
        empleado.setId("5");
        empleado.setNombre("Rosa Cocinera");
        empleado5 = new EmpleadoHoja(empleado);
        cocina.add(empleado5);
        empleado = new Empleado();
        empleado.setId("6");
        empleado.setNombre("Felix Pinche cocina");
        empleado6 = new EmpleadoHoja(empleado);
        cocina.add(empleado6);
        empleado = new Empleado();
        empleado.setId("7");
        empleado.setNombre("Maria Admon & RR.HH");
        empleado7 = new EmpleadoHoja(empleado);
        administracion.add(empleado7);
    }

    @Test
    void testViewHoja() {
        assertEquals("1", empleado1.view());
        assertEquals("2", empleado2.view());
        assertEquals("3", empleado3.view());
        assertEquals("4", empleado4.view());
        assertEquals("5", empleado5.view());
        assertEquals("6", empleado6.view());
        assertEquals("7", empleado7.view());
    }

    @Test
    void testViewComponente() {
        assertEquals("Franquicia numero 13", restaurante.view());
        assertEquals("Barra", barra.view());
        assertEquals("Comedor", comedor.view());
        assertEquals("Cocina", cocina.view());
        assertEquals("Administracion", administracion.view());
    }
}
