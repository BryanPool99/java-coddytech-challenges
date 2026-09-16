package org.bpao.seccion3poo.polimorfismo.recapshapecalculator;

// Clase Circle - extiende Shape
public class Circle extends Shape {
    // TODO: Declara un campo private double llamado 'radius'
    private double radius;

    // TODO: Crea un constructor que tome un parámetro double radius
    // Usa super("Circle") para pasar el nombre al constructor padre
    // Inicializa el campo radius
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    // TODO: Sobrescribe getArea() para devolver Math.PI * radius * radius

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
