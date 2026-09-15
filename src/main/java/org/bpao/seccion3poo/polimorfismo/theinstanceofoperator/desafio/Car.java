package org.bpao.seccion3poo.polimorfismo.theinstanceofoperator.desafio;

// Clase Car que extiende Vehicle
public class Car extends Vehicle {
    // TODO: Declara el campo numDoors (int)
    private int numDoors;

    // TODO: Crea un constructor que tome model y numDoors
    // Recuerda usar super() para la inicialización del padre
    public Car(String model, int numDoors) {
        super(model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    // TODO: Crea un método checkDoors() que imprima: [model] has [numDoors] doors
    public void checkDoors() {
        System.out.println(this.getModel() + " has " + this.getNumDoors() + " doors");
    }
}
