package org.bpao.seccion3poo.proyectogestiondebiblioteca.admininterface;

// TODO: Crea una clase llamada AdminService que implementa LibraryAdmin
//   - Mantén una referencia a un Library (pasada a través del constructor)
//   - Implementa addBook: crea un nuevo Book y añádelo a la library, devuelve true
//   - Implementa removeBook: delega a library.removeBook(isbn)
//   - Implementa registerUser: crea un nuevo User y regístralo, devuelve true
public class AdminService implements LibraryAdmin {
    private Library library;

    public AdminService(Library library) {
        this.library = library;
    }

    @Override
    public boolean addBook(String isbn, String title, String author) {
        Book newBook = new Book(isbn, title, author);
        library.addBook(newBook);
        return true;
    }

    @Override
    public boolean removeBook(String isbn) {
        return library.removeBook(isbn);
    }

    @Override
    public boolean registerUser(String id, String name) {
        User newUser = new User(id, name);
        library.registerUser(newUser);
        return true;
    }
}
