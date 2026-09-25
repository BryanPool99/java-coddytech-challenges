package org.bpao.seccion3poo.genericos.generic_classes.desafio;

// Clase genérica que puede envolver cualquier tipo de regalo
public class GiftBox<T> {
    // TODO: Declara el campo privado 'item' de tipo T
    private T item;
    // TODO: Declara el campo privado 'wrapped' (boolean) inicializado a false
    private boolean wrapped;

    // TODO: Crea el constructor que acepta el item
    public GiftBox(T item) {
        this.item = item;
        this.wrapped = false;
    }
    // TODO: Implementa el método getItem() que devuelve el item

    public T getItem() {
        return item;
    }

    // TODO: Implementa el método wrap() que establece wrapped a true

    public void wrap() {
        this.wrapped = true;
    }

    // TODO: Implementa el método isWrapped() que devuelve el estado de wrapped

    public boolean isWrapped() {
        return wrapped;
    }

    // TODO: Implementa el método getStatus() que devuelve:
    // "[item] (wrapped)" o "[item] (unwrapped)" dependiendo del estado de wrapped
    public String getStatus(){
        return String.format("%s (%s)",this.getItem(),isWrapped() ? "wrapped" : "unwrapped");
    }
}
