package org.bpao.seccion3poo.herencia.theobjectclass.desafio;
// TODO: Crea la clase Smartphone que extiende Gadget
// Esta clase debe tener:
// - Un campo privado: brand (String)
// - Un constructor que reciba name, year y brand
//   (usa super(name, year) para llamar al constructor padre)
// - Un método getter: getBrand()
// - Sobrescribe toString() para devolver: "Smartphone: [brand] [name] ([year])"

public class Smartphone extends Gadget {
    // TODO: Declara un campo privado para brand
    private String brand;

    // TODO: Crea el constructor usando super() para los campos del padre
    public Smartphone(String name, int year, String brand) {
        super(name, year);
        this.brand = brand;
    }
    // TODO: Crea el método getBrand()

    public String getBrand() {
        return this.brand;
    }

    // TODO: Sobrescribe el método toString()
    @Override
    public String toString() {
        return "Smartphone: " + this.getBrand() + " " + this.getName() + " (" + this.getYear() + ")";
    }
}
