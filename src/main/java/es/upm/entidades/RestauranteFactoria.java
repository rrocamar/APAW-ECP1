package es.upm.entidades;

import java.util.HashMap;
import java.util.Map;

import es.upm.entidades.observer.Observable;

public class RestauranteFactoria extends Observable {

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
        super.notifyObservers(restaurante.getId());
    }

    public Restaurante get(String id) {
        return this.restaurantes.get(id);
    }

    public void remove(String id) {
        this.restaurantes.remove(id);
    }

    public boolean exists(String id) {
        return this.restaurantes.get(id) != null;
    }
}
