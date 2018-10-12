package es.upm.entidades.observer;

import es.upm.entidades.Restaurante;
import es.upm.entidades.RestauranteFactoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PropietarioFranquiciaTest {

    private RestauranteFactoria factoria = RestauranteFactoria.getInstance();

    private PropietarioFranquicia propietario = new PropietarioFranquicia();

    @BeforeEach
    void init() {
        factoria.addObserver(propietario);
    }

    @Test
    void testNotificacion() {
        Restaurante restaurante1 = new Restaurante("1", "McDonalds");
        Restaurante restaurante2 = new Restaurante("2", "Burger King");
        assertFalse(propietario.existeCuentaBancaria(restaurante1.getId()));
        factoria.put(restaurante1);
        assertTrue(propietario.existeCuentaBancaria(restaurante1.getId()));
        assertFalse(propietario.existeCuentaBancaria(restaurante2.getId()));
        factoria.put(restaurante2);
        assertTrue(propietario.existeCuentaBancaria(restaurante2.getId()));
    }
}
