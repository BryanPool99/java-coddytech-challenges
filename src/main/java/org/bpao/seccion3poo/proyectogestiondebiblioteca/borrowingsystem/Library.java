package org.bpao.seccion3poo.proyectogestiondebiblioteca.borrowingsystem;

import java.util.ArrayList;

public class Library {
    // TODO: Declara dos ArrayLists privados — uno para objetos Book, uno para objetos User
    private ArrayList<Book> books;
    private ArrayList<User> users;

    // TODO: Constructor — inicializa ambos ArrayLists
    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // TODO: addBook(Book book) — añade un libro a la colección de la biblioteca
    public void addBook(Book book) {
        this.books.add(book);
    }

    // TODO: registerUser(User user) — añade un usuario a los usuarios registrados
    public void registerUser(User user) {
        this.users.add(user);
    }

    // TODO: findBookByIsbn(String isbn) — devuelve el Book con el ISBN coincidente, o null si no se encuentra
    public Book findBookByUsbn(String isbn) {
        /*
        if (isbn==null) return null;
        Book findBook = null;
        for (Book book : this.books) {
            if (book.getIsbn().equals(isbn)) {
                findBook = book;
            }
        }
        return findBook;
         */
        if (isbn==null) return null;

        return this.books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }

    // TODO: findUserById(String id) — devuelve el User con el ID coincidente, o null si no se encuentra
    public User findUserById(String id) {
        if (id==null) return null;
        return this.users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // TODO: borrowBook(String userId, String isbn)
    //       - Encuentra el usuario y el libro
    //       - If either not found, print "Invalid user or book"
    //       - If book not available, print "Book not available"
    //       - Otherwise, have user borrow the book and print "[userName] borrowed [bookTitle]"
    public void borrowBook(String userId, String isbn) {
        Book bookByUsbn = findBookByUsbn(isbn);
        User userById = findUserById(userId);
        if (bookByUsbn==null || userById==null) {
            System.out.println("Invalid user or book");
            return;
        }
        if (!findBookByUsbn(isbn).isAvailable()) {
            System.out.println("Book not available");
            return;
        }
        userById.borrowBook(bookByUsbn);
        System.out.println(userById.getName() + " borrowed " + bookByUsbn.getTitle());
    }

    // TODO: returnBook(String userId, String isbn)
    //       - Encuentra el usuario y el libro
    //       - If either not found, print "Invalid user or book"
    //       - Otherwise, have user return the book and print "[userName] returned [bookTitle]"
    public void returnBook(String userId, String isbn) {
        Book bookByUsbn = findBookByUsbn(isbn);
        User userById = findUserById(userId);
        if (bookByUsbn==null || userById==null) {
            System.out.println("Invalid user or book");
            return;
        }
        userById.returnBook(bookByUsbn);
        System.out.println(userById.getName() + " returned " + bookByUsbn.getTitle());
    }
}
