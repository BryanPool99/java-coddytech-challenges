package org.bpao.seccion3poo.herencia.singleandmultilevelinherit.desafio;

// Clase de nivel inferior que extiende LandVehicle
public class Car extends LandVehicle {
    // TODO: Agregar un campo privado para model (String)
    private String model;

    // TODO: Crear un constructor que reciba brand, wheels y model
    // Recuerda usar super(brand, wheels) para la parte del padre
    public Car(String brand, int wheels, String model) {
        super(brand, wheels);
        this.model = model;
    }
    // TODO: Crear el método getModel() que devuelva el model

    public String getModel() {
        return this.model;
    }

    // TODO: Crear el método displayInfo() que imprima: [brand] [model] con [wheels] ruedas
    public void displayInfo() {
        System.out.println(this.getBrand() + " " + this.getModel() + " with " + this.getWheels() + " wheels");
    }
}
