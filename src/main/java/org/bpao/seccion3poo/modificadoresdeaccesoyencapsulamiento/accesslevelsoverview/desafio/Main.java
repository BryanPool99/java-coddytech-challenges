package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.accesslevelsoverview.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        String school = scanner.nextLine();

        // TODO: Crear un objeto Student con los valores de entrada
        Student newStudent = new Student(studentId, name, grade, school);

        // TODO: Imprimir el campo school directamente (accesible porque es public)
        System.out.println(newStudent.school);

        // TODO: Imprimir el resultado de getInfo() para mostrar toda la información del estudiante
        System.out.println(newStudent.getInfo());
    }
}
