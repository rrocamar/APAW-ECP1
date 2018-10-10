package es.upm.entidades;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestauranteFactoriaTest {

    private RestauranteFactoria factoria = RestauranteFactoria.getInstance();
    private Restaurante restaurante1, restaurante2;

    @BeforeEach
    void init() {
        restaurante1 = new Restaurante("1", "McDonalds");
        restaurante2 = new Restaurante("2", "Burger King");
        factoria.put(restaurante1);
        factoria.put(restaurante2);
    }

    @Test
    void testPutRestaurante() {
        assertSame(restaurante1, factoria.get(restaurante1.getId()));
        assertSame(restaurante2, factoria.get(restaurante2.getId()));
        assertNotSame(restaurante1, factoria.get(restaurante2.getId()));
        assertNotSame(restaurante2, factoria.get(restaurante1.getId()));
    }

    @Test
    void testRemoveRestaurante() {
        assertTrue(factoria.exists("1"));
        factoria.remove("1");
        assertFalse(factoria.exists("1"));
        assertTrue(factoria.exists("2"));
        factoria.remove("2");
        assertFalse(factoria.exists("2"));
    }

}
