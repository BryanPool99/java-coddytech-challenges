package org.bpao.seccion3poo.patronesdediseño1.observerpattern.desafio;

import java.util.ArrayList;
import java.util.List;

// StockTicker es el Subject en el Observer Pattern
public class StockTicker {
    // TODO: Añade un campo privado para el nombre de la acción (String)
    // TODO: Añade un campo privado para el precio actual (double, inicialmente 0)
    // TODO: Añade una lista privada para almacenar observers
    private String action;
    private double price = 0;
    private List<Observer> observers = new ArrayList<>();

    // TODO: Crea un constructor que tome el nombre de la acción como parámetro
    public StockTicker(String action) {
        this.action = action;
    }

    // TODO: Implementa el método subscribe(Observer observer)
    // - Añade el observer a la lista
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // TODO: Implementa el método unsubscribe(Observer observer)
    // - Elimina el observer de la lista
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // TODO: Implementa el método setPrice(double price)
    // - Actualiza el precio
    // - Notifica a todos los observers llamando a su método update
    public void setPrice(double price) {
        this.price = price;
        for (Observer observer : observers) {
            observer.update(this.action, this.price);
        }
    }
}
