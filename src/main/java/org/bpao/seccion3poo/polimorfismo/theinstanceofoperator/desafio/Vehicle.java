package org.bpao.seccion3poo.polimorfismo.theinstanceofoperator.desafio;

// Clase base para todos los vehículos
public class Vehicle {
    // TODO: Declara el campo model (String)
    private String model;

    // TODO: Crea un constructor que inicialice el model
    public Vehicle(String model) {
        this.model = model;
    }
    // TODO: Crea un método getter getModel()

    public String getModel() {
        return this.model;
    }

    // TODO: Create an inspect() method that prints: Inspecting vehicle: [model]
    public void inspect() {
        System.out.println("Inspecting vehicle: " + this.getModel());
    }
}
