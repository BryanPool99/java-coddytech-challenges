package org.bpao.seccion3poo.interfacesyclasesabstractas.abstractclassesvsinterfaces.desafio;

// Motorcycle extiende Vehicle pero NO implementa Convertible
// (¡las motocicletas no tienen techos para convertir!)
public class Motorcycle extends Vehicle {
    // TODO: Declara el campo hasSidecar (boolean)
    private boolean hasSidecar;

    // TODO: Crea el constructor que toma brand, year y hasSidecar
    // Usa super() para inicializar los campos heredados
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }
    // TODO: Implement startEngine() to return: [brand] motorcycle engine roaring

    @Override
    String startEngine() {
        return String.format("%s motorcycle engine roaring", this.getBrand());
    }
}
