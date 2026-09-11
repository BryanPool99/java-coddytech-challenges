package org.bpao.seccion3poo.herencia.basicinheritanceextends.desafio;
// TODO: Crea la clase Motorcycle que extienda de Vehicle
// Esto demuestra la relación "is-a" (es un) - una Motorcycle ES UN Vehicle

public class Motorcycle extends Vehicle {
    // TODO: Usa la palabra clave 'extends' para heredar de Vehicle

    // TODO: Crea un constructor que reciba la brand
    // y la pase a la clase padre usando super(brand)
    public Motorcycle(String brand) {
        super(brand);
    }

    // TODO: Crea un método wheelie() que imprima: [brand] is doing a wheelie!
    // Sugerencia: Usa getBrand() para acceder al nombre de la brand
    public void wheelie() {
        System.out.println(getBrand() + " is doing a wheelie!");
    }
}
