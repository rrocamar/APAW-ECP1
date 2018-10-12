package es.upm.entidades.observer;

import java.util.HashSet;
import java.util.Set;

public class Observable {

    private final Set<Observer> observers = new HashSet<>();

    public void addObserver(Observer observador) {
        this.observers.add(observador);
    }

    public void notifyObservers(String data) {
        for (Observer observer : observers)
            observer.update(data);
    }
}
