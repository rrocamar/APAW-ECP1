package es.upm.entidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestauranteTest {

    @Test
    void testFull() {
        Restaurante restaurante = Restaurante.builder("1", "Burger King").tipo(Cocina.HAMBURGUESERIA).
                direccion("Calle Alcala, 13").build();
        assertEquals("1", restaurante.getId());
        assertEquals("Burger King", restaurante.getNombre());
        assertEquals("Calle Alcala, 13", restaurante.getDireccion());
        assertEquals(Cocina.HAMBURGUESERIA, restaurante.getTipo());
    }
}
