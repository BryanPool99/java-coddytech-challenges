package org.bpao.seccion3poo.proyectogestiondebiblioteca.exceptionhandlingintegration;

import java.util.ArrayList;

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

    // TODO: Actualiza borrowBook para que devuelva String y lance LibraryException
    // - Throw LibraryException("User not found: " + userId) if user is null
    // - Throw LibraryException("Book not found: " + isbn) if book is null
    // - Throw BookNotAvailableException(isbn) if book is not available
    // - On success, have user borrow the book and return "[userName] borrowed [bookTitle]"
    public String borrowBook(String userId, String isbn) throws LibraryException, BookNotAvailableException {
        User user = findUserById(userId);
        Book book = findBookByIsbn(isbn);

        if (user==null) {
            throw new LibraryException("User not found: " + userId);
        }
        if (book==null) {
            throw new LibraryException("Book not found: " + isbn);
        }

        if (!book.isAvailable()) {
            throw new BookNotAvailableException(isbn);
        }

        user.borrowBook(book);
        return String.format("%s borrowed %s", user.getName(), book.getTitle());
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

    public ArrayList<Book> searchByTitle(String keyword) {
        ArrayList<Book> results = new ArrayList<Book>();
        String lowerKeyword = keyword.toLowerCase();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(lowerKeyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public ArrayList<Book> searchByAuthor(String keyword) {
        ArrayList<Book> results = new ArrayList<Book>();
        String lowerKeyword = keyword.toLowerCase();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(lowerKeyword)) {
                results.add(book);
            }
        }
        return results;
    }

    public ArrayList<Book> getAvailableBooks() {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : books) {
            if (book.isAvailable()) {
                results.add(book);
            }
        }
        return results;
    }

    public boolean removeBook(String isbn) {
        Book book = findBookByIsbn(isbn);
        if (book==null) {
            return false;
        }
        if (!book.isAvailable()) {
            return false;
        }
        books.remove(book);
        return true;
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}
