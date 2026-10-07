package org.bpao.seccion3poo.proyectogestiondebiblioteca.bookanduserclasses;

import java.util.ArrayList;

public class User {
    // Campos privados
    private String id;
    private String name;

    // TODO: Añade un campo privado ArrayList<Book> llamado borrowedBooks
    private ArrayList<Book> borrowedBooks;

    // Constructor que acepta id y name
    public User(String id, String name) {
        this.id = id;
        this.name = name;
        // TODO: Inicializa borrowedBooks como un nuevo ArrayList<Book>()
        this.borrowedBooks = new ArrayList<>();
    }

    // Métodos getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TODO: Añade un método borrowBook(Book book)
    // Añade el libro a borrowedBooks y establece el borrowedBy del libro al ID de este usuario
    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
        book.setBorrowedBy(this.id);
    }

    // TODO: Añade un método returnBook(Book book)
    // Elimina el libro de borrowedBooks y establece borrowedBy a null
    public void returnBook(Book book) {
        this.borrowedBooks.remove(book);
        book.setBorrowedBy(null);
    }

    // TODO: Añade un método getBorrowedCount()
    // Devuelve el número de libros prestados actualmente
    public int getBorrowedCount() {
        return this.borrowedBooks.size();
    }

    // Sobrescribe el método toString()
    // Devuelve: "User[id]: name"
    @Override
    public String toString() {
        return "User[" + id + "]: " + name;
    }
}
