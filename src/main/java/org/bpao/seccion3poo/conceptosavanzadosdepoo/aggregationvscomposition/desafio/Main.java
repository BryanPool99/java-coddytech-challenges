package org.bpao.seccion3poo.conceptosavanzadosdepoo.aggregationvscomposition.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String professorName = scanner.nextLine();
        String department = scanner.nextLine();
        String courseTitle = scanner.nextLine();
        int numberOfLectures = scanner.nextInt();

        // TODO: Crear un objeto Professor (existe de forma independiente - agregación)
        Professor professor = new Professor(professorName, department);
        // TODO: Crear un objeto Course, pasando el professor (agregación)
        // El course creará sus propias lectures internamente (composición)
        Course course = new Course(courseTitle, professor, numberOfLectures);
        // TODO: Imprimir el resultado de getInfo()
        System.out.println(course.getInfo());
        // TODO: Imprimir una línea vacía
        System.out.println();
        // TODO: Imprimir el resultado de listLectures()
        System.out.println(course.listLectures());
    }
}
