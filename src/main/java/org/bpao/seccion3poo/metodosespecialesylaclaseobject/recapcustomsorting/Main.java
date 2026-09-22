package org.bpao.seccion3poo.metodosespecialesylaclaseobject.recapcustomsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer tres libros de la entrada
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        // TODO: Analizar cada línea para extraer el título, el autor y el año
        // Sugerencia: Usar split(",") para separar los valores
        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");

        // TODO: Crear objetos Book a partir de los datos analizados
        Book book1 = new Book(parts1[0], parts1[1], Integer.parseInt(parts1[2]));
        Book book2 = new Book(parts2[0], parts2[1], Integer.parseInt(parts2[2]));
        Book book3 = new Book(parts3[0], parts3[1], Integer.parseInt(parts3[2]));
        // TODO: Crear un ArrayList y añadir los tres libros
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        // TODO: Ordenar usando el orden natural (por año) e imprimir cada libro
        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book.toString());
        }
        // TODO: Imprimir una línea vacía
        System.out.println();
        // TODO: Ordenar por título usando TitleComparator e imprimir cada libro
        Collections.sort(books, new TitleComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }
        // TODO: Imprimir una línea vacía
        System.out.println();
        // TODO: Ordenar por autor usando AuthorComparator e imprimir cada libro
        Collections.sort(books, new AuthorComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
