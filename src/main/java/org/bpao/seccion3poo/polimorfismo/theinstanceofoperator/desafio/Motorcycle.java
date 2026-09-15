package org.bpao.seccion3poo.polimorfismo.theinstanceofoperator.desafio;

// Clase Motorcycle que extiende Vehicle
public class Motorcycle extends Vehicle {
    // TODO: Declara el campo hasSidecar (boolean)
    private boolean hasSidecar;

    // TODO: Crea un constructor que tome model y hasSidecar
    // Recuerda usar super() para la inicialización del padre
    public Motorcycle(String model, boolean hasSidecar) {
        super(model);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    // TODO: Crea un método checkSidecar() que imprima:
    // "[model] has a sidecar" si hasSidecar es true
    // "[model] has no sidecar" if hasSidecar is false
    public void checkSidecar() {
        if (this.isHasSidecar()) {
            System.out.println(this.getModel() + " has a sidecar");
        } else {
            System.out.println(this.getModel() + " has no sidecar");
        }
    }
}
