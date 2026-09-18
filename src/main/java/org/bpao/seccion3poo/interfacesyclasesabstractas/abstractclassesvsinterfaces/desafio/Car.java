package org.bpao.seccion3poo.interfacesyclasesabstractas.abstractclassesvsinterfaces.desafio;

// Car extiende Vehicle (relación IS-A) e implementa Convertible (capacidad CAN-DO)
public class Car extends Vehicle implements Convertible {
    // TODO: Declara el campo numDoors (int)
    private int numDoors;

    // TODO: Crea el constructor que recibe brand, year y numDoors
    // Usa super() para inicializar los campos heredados
    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    // TODO: Implement startEngine() to return: [brand] car engine started
    @Override
    String startEngine() {
        return String.format("%s car engine started", this.getBrand());
    }

    // TODO: Implement openRoof() to return: [brand] roof opening
    @Override
    public String openRoof() {
        return String.format("%s roof opening", this.getBrand());
    }

    // TODO: Implement closeRoof() to return: [brand] roof closing

    @Override
    public String closeRoof() {
        return String.format("%s roof closing", this.getBrand());
    }
}
