package org.bpao.seccion3poo.objectorientedprogramming.thethiskeyword.desafio;

public class Person {
    private String name;
    private int age;
    private String city;

    // TODO: Crear un constructor con parámetros: name, age, city
    // Usar la palabra clave 'this' para asignar cada parámetro al campo
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // TODO: Crear el método getName() que devuelva this.name
    public String getName() {
        return this.name;
    }

    // TODO: Crear el método getAge() que devuelva this.age
    public int getAge() {
        return this.age;
    }

    // TODO: Crear el método getCity() que devuelva this.city
    public String getCity() {
        return this.city;
    }

    // TODO: Crear el método getDescription() que devuelva:
    // "<name>, age <age>, from <city>"
    // Usar la palabra clave 'this' para acceder a cada campo
    public String getDescription() {
        return this.name + ", age " + this.age + ", from " + this.city;
    }
}
