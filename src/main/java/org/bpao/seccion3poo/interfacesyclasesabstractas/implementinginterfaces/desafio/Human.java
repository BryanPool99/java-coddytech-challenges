package org.bpao.seccion3poo.interfacesyclasesabstractas.implementinginterfaces.desafio;

// TODO: Crea una clase Human que implemente la interfaz Speaker
public class Human implements Speaker {
    // TODO: Añade un campo privado para name (String)
    private String name;

    // TODO: Crea un constructor que tome un parámetro name
    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // TODO: Implementa el método speak()
    // It should return: "[name] says: Hello everyone!"

    @Override
    public String speak() {
        return String.format("%s says: Hello everyone!", this.getName());
    }
}
