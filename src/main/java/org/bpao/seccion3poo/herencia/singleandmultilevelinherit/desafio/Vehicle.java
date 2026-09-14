package org.bpao.seccion3poo.herencia.singleandmultilevelinherit.desafio;

// Clase base en la parte superior de la jerarquía
public class Vehicle {
    // TODO: Añadir un campo privado para brand (String)
    private String brand;

    // TODO: Crear un constructor que acepte brand
    public Vehicle(String brand) {
        this.brand = brand;
    }
    // TODO: Crear el método getBrand() que devuelva brand

    public String getBrand() {
        return this.brand;
    }

    // TODO: Crear el método move() que imprima: [brand] is moving
    public void move() {
        System.out.println(this.getBrand() + " is moving");
    }
}
