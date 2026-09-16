package org.bpao.seccion3poo.polimorfismo.abstractclassesandmethods.desafio;

// Clase abstracta que sirve como plano para todos los electrodomésticos
public abstract class Appliance {
    // TODO: Declarar campos protegidos para brand (String) y wattage (int)
    protected String brand;
    protected int wattage;

    // TODO: Crear un constructor que inicialice ambos campos
    public Appliance(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    // TODO: Crear métodos getter para brand y wattage

    public String getBrand() {
        return this.brand;
    }

    public int getWattage() {
        return this.wattage;
    }

    // TODO: Crear un método getInfo() que devuelva: "[brand] - [wattage]W"
    public String getInfo() {
        return String.format("%s - %dW", this.getBrand(), this.getWattage());
    }

    // TODO: Declarar un método abstracto operate() que las subclases deben implementar
    public abstract void operate();
}
