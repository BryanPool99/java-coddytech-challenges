package org.bpao.seccion3poo.herencia.basicinheritanceextends.desafio;
// TODO: Crear la clase Vehicle
// Esta es la clase padre para todos los vehículos

public class Vehicle {
    // TODO: Declarar un campo privado para brand (String)
    private String brand;

    // TODO: Crear un constructor que acepte el nombre de la brand
    public Vehicle(String brand) {
        this.brand = brand;
    }
    // TODO: Crear un método getBrand() que devuelva la brand

    public String getBrand() {
        return this.brand;
    }

    // TODO: Crear un método start() que imprima: [brand] is starting
    public void start() {
        System.out.println(this.getBrand() + " is starting");
    }
}
