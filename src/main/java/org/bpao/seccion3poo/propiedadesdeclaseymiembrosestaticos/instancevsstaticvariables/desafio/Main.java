package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.instancevsstaticvariables.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas para tres libros
        String title1 = scanner.nextLine();
        double price1 = Double.parseDouble(scanner.nextLine());
        String title2 = scanner.nextLine();
        double price2 = Double.parseDouble(scanner.nextLine());
        String title3 = scanner.nextLine();
        double price3 = Double.parseDouble(scanner.nextLine());

        // TODO: Crear tres objetos Book usando las entradas anteriores
        Book book1 = new Book(title1, price1);
        Book book2 = new Book(title2, price2);
        Book book3 = new Book(title3, price3);
        // TODO: Imprimir el título y el precio de cada libro en el formato: [title]: $[price]
        // Usar String.format("%.2f", price) para formatear el precio a 2 decimales
        System.out.println(String.format("%s: $%.2f", book1.getTitle(), book1.getPrice()));
        System.out.println(String.format("%s: $%.2f", book2.getTitle(), book2.getPrice()));
        System.out.println(String.format("%s: $%.2f", book3.getTitle(), book3.getPrice()));
        // TODO: Imprimir el número total de libros usando el método estático
        // Formato: Total books: [count]
        // Recuerda acceder al método estático a través del nombre de la clase: Book.getTotalBooks()
        System.out.println("Total books: " + Book.getTotalBooks());
    }
}
