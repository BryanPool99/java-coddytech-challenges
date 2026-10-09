package org.bpao.seccion3poo.proyectogestiondebiblioteca.exceptionhandlingintegration;

public class AdminService implements LibraryAdmin {
    private Library library;

    public AdminService(Library library) {
        this.library = library;
    }

    @Override
    public boolean addBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        library.addBook(book);
        return true;
    }

    @Override
    public boolean removeBook(String isbn) {
        return library.removeBook(isbn);
    }

    @Override
    public boolean registerUser(String id, String name) {
        User user = new User(id, name);
        library.registerUser(user);
        return true;
    }
}
