package org.bpao.seccion3poo.genericos.wildcardsextendssuper.desafio;
// Clase base para todos los tipos de alimentos
public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // TODO: Sobrescribe toString() para devolver el nombre del alimento

    @Override
    public String toString() {
        return getName();
    }
}
// TODO: Crea la clase Meat que extiende Food


// TODO: Crea la clase Vegetable que extiende Food