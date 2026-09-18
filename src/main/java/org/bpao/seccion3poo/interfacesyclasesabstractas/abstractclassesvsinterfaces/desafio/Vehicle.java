package org.bpao.seccion3poo.interfacesyclasesabstractas.abstractclassesvsinterfaces.desafio;

// Clase abstracta - úsala cuando las clases comparten estado Y comportamiento
public abstract class Vehicle {
    // TODO: Declara campos protected: brand (String) y year (int)
    protected String brand;
    protected int year;

    // TODO: Crea un constructor para inicializar brand y year
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // TODO: Crea métodos getter para brand y year
    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    // TODO: Crea el método abstracto startEngine() que devuelve String
    abstract String startEngine();

    // TODO: Crea el método concreto getInfo() que devuelve: [brand] ([year])
    String getInfo() {
        return String.format("%s (%d)", this.getBrand(), this.getYear());
    }
}
