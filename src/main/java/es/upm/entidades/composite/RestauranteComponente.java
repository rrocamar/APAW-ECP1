package es.upm.entidades.composite;

public abstract class RestauranteComponente {

    public abstract void remove(RestauranteComponente componente);

    public abstract void add(RestauranteComponente componente);

    public abstract boolean isComponente();

    public abstract String view();

    public abstract double getCoste();
}
