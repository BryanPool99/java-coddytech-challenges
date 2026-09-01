package org.bpao.seccion3poo.objectorientedprogramming.introductiontooop.desafio;

public class Animal {
    // TODO: Crea un campo String llamado 'name'
    String name;

    // TODO: Crea un constructor que tome un parámetro String name y lo asigne
    public Animal(String name) {
        this.name = name;
    }

    // TODO: Crea un método llamado makeSound() que devuelva un String: "<name> makes a sound!"
    public String makeSound() {
        return this.name + " makes a sound!";
    }
}
