package org.bpao.seccion3poo.metodosespecialesylaclaseobject.equalsandhashcode.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee los datos del primer estudiante
        String id1 = scanner.nextLine();
        String name1 = scanner.nextLine();
        double gpa1 = scanner.nextDouble();
        scanner.nextLine(); // consumir el salto de línea

        // Lee los datos del segundo estudiante
        String id2 = scanner.nextLine();
        String name2 = scanner.nextLine();
        double gpa2 = scanner.nextDouble();

        // TODO: Crea dos objetos Student usando los datos de entrada
        Student student1 = new Student(id1, name1, gpa1);
        Student student2 = new Student(id2, name2, gpa2);
        // TODO: Print "Same reference: " followed by whether student1 equals itself
        System.out.println("Same reference: " + student1.equals(student1));
        // TODO: Print "Content equality: " followed by whether student1 equals student2
        System.out.println("Content equality: " + (student1.equals(student2)));
        // TODO: Print "Hash codes match: " followed by whether both students have the same hash code
        System.out.println("Hash codes match: " + ((student1.hashCode())==student2.hashCode()));
    }
}
