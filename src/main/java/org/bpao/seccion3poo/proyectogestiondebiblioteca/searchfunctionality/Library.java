package org.bpao.seccion3poo.proyectogestiondebiblioteca.searchfunctionality;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        this.books = new ArrayList<Book>();
        this.users = new ArrayList<User>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public User findUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void borrowBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if (user==null || book==null) {
            System.out.println("Invalid user or book");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book not available");
            return;
        }

        user.borrowBook(book);
        System.out.println(user.getName() + " borrowed " + book.getTitle());
    }

    public void returnBook(String userId, String isbn) {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if (user==null || book==null) {
            System.out.println("Invalid user or book");
            return;
        }

        user.returnBook(book);
        System.out.println(user.getName() + " returned " + book.getTitle());
    }

    // TODO: Añadir el método searchByTitle(String keyword)
    // Devuelve ArrayList<Book> de libros cuyo título contiene keyword (sin distinción de mayúsculas/minúsculas)
    public ArrayList<Book> searchByTitle(String keyword) {
        if (keyword==null) return new ArrayList<>();
        return this.books.stream()
                // Pasamos ambos textos a minúsculas para que no importe si hay mayúsculas/minúsculas
                .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                // Recolectamos el resultado directamente en una instancia de ArrayList
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // TODO: Añadir el método searchByAuthor(String keyword)
    // Devuelve ArrayList<Book> de libros cuyo autor contiene keyword (sin distinción de mayúsculas/minúsculas)
    public ArrayList<Book> searchByAuthor(String keyword) {
        if (keyword==null) return new ArrayList<>();
        return this.books.stream()
                .filter(book -> book.getAuthor().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList::new));
    }
    // TODO: Add getAvailableBooks() method
    // Devuelve ArrayList<Book> de libros que están actualmente disponibles
    public ArrayList<Book> getAvailableBooks() {
        return this.books.stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
