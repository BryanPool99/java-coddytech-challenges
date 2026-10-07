package org.bpao.seccion3poo.proyectogestiondebiblioteca.projectoverviewandumldesign;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer información del libro
        String isbn = scanner.nextLine();
        String title = scanner.nextLine();
        String author = scanner.nextLine();

        // Leer información del usuario
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();

        // TODO: Crea un objeto Book con isbn, title y author
        Book book = new Book(isbn, title, author);
        // TODO: Crea un objeto User con userId y userName
        User user = new User(userId, userName);
        // TODO: Imprime los detalles del libro usando getDetails()
        System.out.println(book.getDetails());
        // TODO: Print whether the book is available (format: "Available: true" or "Available: false")
        System.out.println("Available: " + book.isAvailable());
        // TODO: Imprime el usuario usando toString()
        System.out.println(user.toString());
    }
}
