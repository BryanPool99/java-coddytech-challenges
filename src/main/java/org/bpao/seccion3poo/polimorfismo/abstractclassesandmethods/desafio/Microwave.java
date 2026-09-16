package org.bpao.seccion3poo.polimorfismo.abstractclassesandmethods.desafio;

// Clase concreta que extiende Appliance
public class Microwave extends Appliance {
    // TODO: Declarar un campo privado para power (int) que represente el porcentaje del nivel de potencia
    private int power;

    // TODO: Crear un constructor que reciba brand, wattage, y power
    // Usar super() para inicializar los campos de la clase padre
    public Microwave(String brand, int wattage, int power) {
        super(brand, wattage);
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    // TODO: Implementar el método operate() para imprimir:
    // "[brand] microwave is heating at [power]% power"
    @Override
    public void operate() {
        System.out.println(this.getBrand() + " microwave is heating at " + this.getPower() + "% power");
    }
}
