package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.thefinalkeyword.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        int enrollmentYear = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        String newName = scanner.nextLine();

        // TODO: Crear un objeto Student con los valores iniciales
        Student myStudent = new Student(studentId, name, enrollmentYear);
        // TODO: Imprimir la información del estudiante antes del cambio de nombre
        System.out.println(myStudent.getInfo());
        // TODO: Actualizar el nombre del estudiante usando el setter
        myStudent.setName(newName);
        // TODO: Imprimir la información del estudiante después del cambio de nombre
        System.out.println(myStudent.getInfo());
    }
}
