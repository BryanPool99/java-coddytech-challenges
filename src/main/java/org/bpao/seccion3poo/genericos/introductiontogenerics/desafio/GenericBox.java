package org.bpao.seccion3poo.genericos.introductiontogenerics.desafio;

// GenericBox.java - El enfoque moderno y seguro en tipos usando genéricos
// TODO: Declara la clase con un parámetro de tipo T
public class GenericBox<T> {
    // TODO: Declara un campo privado 'content' de tipo T
    private T content;
    // TODO: Crea un constructor que acepte un valor T y lo almacene
    public GenericBox(T content){
        this.content = content;
    }
    // TODO: Crea un método getContent() que devuelva el tipo T

    public T getContent() {
        return content;
    }
}
