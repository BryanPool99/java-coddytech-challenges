package org.bpao.seccion3poo.proyectogestiondebiblioteca.testingandintegration;

import java.util.ArrayList;

public class User {
    // Campos privados
    private String id;
    private String name;
    private ArrayList<Book> borrowedBooks;

    // Constructor que acepta id y name
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    // Métodos getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // método borrowBook
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.setBorrowedBy(this.id);
    }

    // método returnBook
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.setBorrowedBy(null);
    }

    // método getBorrowedCount
    public int getBorrowedCount() {
        return borrowedBooks.size();
    }

    // Sobrescribe el método toString()
    // Devuelve: "User[id]: name"
    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
