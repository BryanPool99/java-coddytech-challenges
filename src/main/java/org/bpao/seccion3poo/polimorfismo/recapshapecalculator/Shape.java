package org.bpao.seccion3poo.polimorfismo.recapshapecalculator;

// Clase abstracta Shape: la base para todas las formas
public abstract class Shape {
    // TODO: Declarar un campo String privado llamado 'name'
    private String name;

    // TODO: Crear un constructor que reciba un parámetro String e inicialice el campo name
    public Shape(String name) {
        this.name = name;
    }
    // TODO: Crear un método getter getName() que devuelva el name

    public String getName() {
        return this.name;
    }

    // TODO: Declarar un método abstracto getArea() que devuelva un double
    public abstract double getArea();

    // TODO: Crear un método describe() que devuelva: "[name]: [area]"
    // Usar String.format("%.2f", getArea()) para formatear el área a 2 decimales
    public String describe() {
        return String.format("%s: %.2f", this.getName(), this.getArea());
    }
}
