package org.bpao.seccion3poo.proyectogestiondebiblioteca.testingandintegration;

public class BookNotAvailableException extends LibraryException {
    public BookNotAvailableException(String isbn) {
        super("Book not available: " + isbn);
    }
}
