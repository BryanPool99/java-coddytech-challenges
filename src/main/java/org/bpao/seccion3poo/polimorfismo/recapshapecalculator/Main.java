package org.bpao.seccion3poo.polimorfismo.recapshapecalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        double radius = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        // TODO: Crear un objeto Circle usando el radius
        Circle myCircle = new Circle(radius);
        // TODO: Crear un objeto Rectangle usando width y height
        Rectangle myRectangle = new Rectangle(width, height);
        // TODO: Crear un arreglo de referencias Shape y almacenar ambas formas en él
        Shape[] shapes = {myCircle, myRectangle};
        // TODO: Recorrer el arreglo e imprimir la descripción de cada forma usando describe()
        for (Shape shape : shapes) {
            System.out.println(shape.describe());
        }
        // TODO: Calcular el área total de todas las formas
        double areaTotal = 0;
        // Usar un bucle o acumulador para sumar las áreas llamando a getArea() en cada forma
        for (Shape shape : shapes) {
            areaTotal += shape.getArea();
        }
        // TODO: Imprimir el área total con el formato: "Total area: [sum]"
        // Usar String.format("%.2f", totalArea) para el formato
        System.out.println(String.format("Total area: %.2f", areaTotal));
    }
}
