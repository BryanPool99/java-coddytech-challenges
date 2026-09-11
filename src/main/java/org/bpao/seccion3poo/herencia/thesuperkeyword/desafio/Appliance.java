package org.bpao.seccion3poo.herencia.thesuperkeyword.desafio;

// Clase padre que representa cualquier electrodoméstico
public class Appliance {
    // TODO: Declara campos privados para brand (String) y wattage (int)
    private String brand;
    private int wattage;

    // TODO: Crea un constructor que acepte brand y wattage y los inicialice
    public Appliance(String brand, int wattage) {
        this.brand = brand;
        this.wattage = wattage;
    }
    // TODO: Crea el método getBrand() que devuelva brand

    public String getBrand() {
        return this.brand;
    }

    // TODO: Crea el método getWattage() que devuelva wattage

    public int getWattage() {
        return this.wattage;
    }

    // TODO: Crea el método getInfo() que devuelva: "[brand] - [wattage]W"
    public String getInfo() {
        return this.getBrand() + " - " + this.getWattage() + "W";
    }
}
