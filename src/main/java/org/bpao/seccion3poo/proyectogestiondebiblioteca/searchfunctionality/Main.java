package org.bpao.seccion3poo.proyectogestiondebiblioteca.searchfunctionality;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer información del libro 1
        String isbn1 = scanner.nextLine();
        String title1 = scanner.nextLine();
        String author1 = scanner.nextLine();

        // Leer información del libro 2
        String isbn2 = scanner.nextLine();
        String title2 = scanner.nextLine();
        String author2 = scanner.nextLine();

        // Leer información del libro 3
        String isbn3 = scanner.nextLine();
        String title3 = scanner.nextLine();
        String author3 = scanner.nextLine();

        // Leer información del usuario
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();

        // Leer operación de préstamo
        String borrowOp = scanner.nextLine();

        // Leer palabras clave de búsqueda
        String titleKeyword = scanner.nextLine();
        String authorKeyword = scanner.nextLine();

        // Crear objetos Book
        Book book1 = new Book(isbn1, title1, author1);
        Book book2 = new Book(isbn2, title2, author2);
        Book book3 = new Book(isbn3, title3, author3);

        // Crear objeto User
        User user = new User(userId, userName);

        // Crear Library y agregar libros y usuario
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.registerUser(user);

        // Procesar operación de préstamo
        String[] parts = borrowOp.split(":");
        String opUserId = parts[0];
        String opIsbn = parts[1];
        library.borrowBook(opUserId, opIsbn);

        // TODO: Búsqueda por título
        // Print "Title search '[titleKeyword]':"
        // Usar library.searchByTitle(titleKeyword)
        // Print each book's getDetails(), or "No books found" if empty
        System.out.println(String.format("Title search '%s':", titleKeyword));
        ArrayList<Book> booksByTitle = library.searchByTitle(titleKeyword);
        if (booksByTitle.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : booksByTitle) {
                System.out.println(book.getDetails());
            }
        }
        // TODO: Author search
        // Print "Author search '[authorKeyword]':"
        // Usa library.searchByAuthor(authorKeyword)
        // Print each book's getDetails(), or "No books found" if empty
        System.out.println(String.format("Author search '%s':", authorKeyword));
        ArrayList<Book> booksByAuthor = library.searchByAuthor(authorKeyword);
        if (booksByAuthor.isEmpty()) {
            System.out.println("No books found");
        } else {
            for (Book book : booksByAuthor) {
                System.out.println(book.getDetails());
            }
        }
        // TODO: Available books
        // Print "Available books:"
        // Use library.getAvailableBooks()
        // Imprime getDetails() de cada libro
        System.out.println("Available books:");
        ArrayList<Book> booksAvailable = library.getAvailableBooks();
        for (Book book : booksAvailable) {
            System.out.println(book.getDetails());
        }

    }
}
