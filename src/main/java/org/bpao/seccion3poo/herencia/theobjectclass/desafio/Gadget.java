package org.bpao.seccion3poo.herencia.theobjectclass.desafio;
// TODO: Crear la clase Gadget
// Esta clase debe tener:
// - Campos privados: name (String) y year (int)
// - Un constructor que inicialice ambos campos
// - Métodos getter: getName() y getYear()
// - NO sobrescribas ningún método de Object; queremos el comportamiento por defecto

public class Gadget {
    // TODO: Declarar campos privados
    private String name;
    private int year;

    // TODO: Crear el constructor
    public Gadget(String name, int year) {
        this.name = name;
        this.year = year;
    }
    // TODO: Crear los métodos getter

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
}
