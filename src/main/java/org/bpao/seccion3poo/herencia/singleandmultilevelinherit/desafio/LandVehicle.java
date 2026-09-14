package org.bpao.seccion3poo.herencia.singleandmultilevelinherit.desafio;

// Clase de nivel intermedio que extiende Vehicle
public class LandVehicle extends Vehicle {
    // TODO: Add private field for wheels (int)
    private int wheels;

    // TODO: Create constructor that takes brand and wheels
    // Recuerda usar super(brand) para la parte del padre
    public LandVehicle(String brand, int wheels) {
        super(brand);
        this.wheels = wheels;
    }
    // TODO: Create getWheels() method that returns the wheel count

    public int getWheels() {
        return this.wheels;
    }

    // TODO: Create honk() method that prints: [brand] honks!
    public void honk() {
        System.out.println(this.getBrand() + " honks!");
    }
}
