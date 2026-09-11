package org.bpao.seccion3poo.herencia.thesuperkeyword.desafio;

// Clase hija que extiende Appliance
public class WashingMachine extends Appliance {
    // TODO: Declarar un campo privado para capacity (int)
    private int capacity;

    // TODO: Crear un constructor que reciba brand, wattage y capacity
    // Usar super(brand, wattage) para llamar al constructor padre
    // Luego inicializar el campo capacity
    public WashingMachine(String brand, int wattage, int capacity) {
        super(brand, wattage);
        this.capacity = capacity;
    }
    // TODO: Crear el método getCapacity() que devuelva la capacidad

    public int getCapacity() {
        return this.capacity;
    }

    // TODO: Sobrescribir el método getInfo()
    // Llamar a super.getInfo() para obtener la información del padre
    // Retornar: "[parent info], Capacity: [capacity]kg"
    public String getInfo() {
        super.getInfo();
        return super.getInfo() + ", Capacity: " + this.getCapacity() + "kg";
    }
}
