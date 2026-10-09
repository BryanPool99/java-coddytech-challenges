package org.bpao.seccion3poo.proyectogestiondebiblioteca.exceptionhandlingintegration;

// TODO: Create a custom exception called BookNotAvailableException
// - Debe extender LibraryException
// - Incluir un constructor que acepte un isbn (String)
// - Pass the message "Book not available: " + isbn to the parent constructor
public class BookNotAvailableException extends LibraryException {
    private String isbn;

    public BookNotAvailableException(String isbn) {
        super("Book not available: " + isbn);
        this.isbn = isbn;
    }
}
