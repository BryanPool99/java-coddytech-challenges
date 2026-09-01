package org.bpao.seccion3poo.objectorientedprogramming.classesvsobjects.desafio;

public class Car {
    // TODO: Crear el campo String 'brand'
    String brand;
    // TODO: Crear el campo int 'year'
    int year;

    // TODO: Crear un constructor que reciba brand y year y los asigne
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // TODO: Crear un método getInfo() que devuelva: "<brand> (<year>)"
    public String getInfo() {
        return this.brand + " (" + this.year + ")";
    }
}
