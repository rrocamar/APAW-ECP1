package es.upm.entidades;

import java.util.HashMap;
import java.util.Map;

public class RestauranteFactoria {

    private static RestauranteFactoria instance = new RestauranteFactoria();

    private Map<String, Restaurante> restaurantes;

    private RestauranteFactoria() {
        this.restaurantes = new HashMap<>();
    }

    public static RestauranteFactoria getInstance() {
        return instance;
    }

    public void put(Restaurante restaurante) {
        this.restaurantes.put(restaurante.getId(), restaurante);
    }

    public Restaurante get(String id) {
        return this.restaurantes.get(id);
    }
}
