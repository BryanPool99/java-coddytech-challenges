package org.bpao.seccion3poo.polimorfismo.abstractclassesandmethods.desafio;

// Clase concreta que extiende Appliance
public class WashingMachine extends Appliance {
    // TODO: Declara un campo privado para capacity (int) que representa el tamaño de la carga en kg
    private int capacity;

    // TODO: Crea un constructor que reciba brand, wattage y capacity
    // Usa super() para inicializar los campos de la clase padre
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    // TODO: Implementa el método operate() para imprimir:
    // "[brand] washing machine is washing [capacity]kg of clothes"
    @Override
    public void operate() {
        System.out.println(this.getBrand() + " washing machine is washing " + this.getCapacity() + "kg of clothes");
    }
}
