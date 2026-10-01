package org.bpao.seccion3poo.patronesdediseño1.factorypattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee dos tipos de formas
        String type1 = scanner.nextLine();
        String type2 = scanner.nextLine();

        // TODO: Usa ShapeFactory para crear la primera forma
        // Si la forma no es null, llama a draw()
        // If the shape is null, print "Unknown shape: [type]"
        Shape shape1 = ShapeFactory.createShape(type1);
        if (shape1!=null) {
            shape1.draw();
        } else {
            System.out.println("Unknown shape: " + type1);
        }
        // TODO: Haz lo mismo para la segunda forma
        Shape shape2 = ShapeFactory.createShape(type2);
        if (shape2!=null) {
            shape2.draw();
        } else {
            System.out.println("Unknown shape: " + type2);
        }
    }
}
