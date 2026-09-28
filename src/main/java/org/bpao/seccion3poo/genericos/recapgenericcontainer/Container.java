package org.bpao.seccion3poo.genericos.recapgenericcontainer;

import java.util.ArrayList;

public class Container<T> {
    // TODO: Crear un ArrayList<T> para almacenar elementos internamente
    private ArrayList<T> elements;

    public Container() {
        elements = new ArrayList<>();
    }

    // TODO: Implementar el método add(T item) para añadir un elemento
    public void add(T item) {
        elements.add(item);
    }

    // TODO: Implementar el método get(int index) para recuperar un elemento en una posición específica
    public T get(int index) {
        return elements.get(index);
    }

    // TODO: Implementar el método size() para devolver el recuento de elementos
    public int size() {
        return elements.size();
    }

    // TODO: Implementar el método isEmpty() para comprobar si el contenedor no tiene elementos
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    // TODO: Implementar el método getAll() que devuelve la lista interna

    public ArrayList<T> getAll() {
        return elements;
    }
}
