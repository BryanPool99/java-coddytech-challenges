package org.bpao.seccion3poo.proyectogestiondebiblioteca.bookanduserclasses;

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

        // Crear un objeto Book con isbn, title y author
        Book book = new Book(isbn, title, author);

        // Crear un objeto User con userId y userName
        User user = new User(userId, userName);

        // Imprimir los detalles del libro usando getDetails()
        System.out.println(book.getDetails());

        // Print whether the book is available (format: "Available: true" or "Available: false")
        System.out.println("Available: " + book.isAvailable());

        // Hacer que el usuario tome prestado el libro
        user.borrowBook(book);

        // Imprimir la disponibilidad del libro de nuevo
        System.out.println("Available: " + book.isAvailable());

        // Imprimir quién lo tomó prestado
        System.out.println("Borrowed by: " + book.getBorrowedBy());

        // Imprimir cuántos libros tiene el usuario
        System.out.println(user.getName() + " has " + user.getBorrowedCount() + " book(s)");

        // Hacer que el usuario devuelva el libro
        user.returnBook(book);

        // Imprimir la disponibilidad una vez más
        System.out.println("Available: " + book.isAvailable());
    }
}
