package org.bpao.seccion3poo.polimorfismo.recapshapecalculator;

// Clase Rectangle - extiende Shape
public class Rectangle extends Shape {
    // TODO: Declarar campos double privados para 'width' y 'height'
    private double width;
    private double height;

    // TODO: Crear un constructor que tome los parámetros width y height
    // Usar super("Rectangle") para pasar el nombre al constructor padre
    // Inicializar los campos width y height
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    // TODO: Sobrescribir getArea() para que devuelva width * height

    @Override
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
}
