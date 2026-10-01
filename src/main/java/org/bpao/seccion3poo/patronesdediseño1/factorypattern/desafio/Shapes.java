package org.bpao.seccion3poo.patronesdediseño1.factorypattern.desafio;

// TODO: Crea tres clases que implementen la interfaz Shape:
public class Shapes {
    // Clase Circle
    // - draw() should print "Drawing a Circle"
    static class Circle implements Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    // Clase Rectangle
    // - draw() should print "Drawing a Rectangle"
    static class Rectangle implements Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    // Clase Triangle
    // - draw() should print "Drawing a Triangle"
    static class Triangle implements Shape {

        @Override
        public void draw() {
            System.out.println("Drawing a Triangle");
        }
    }
}
