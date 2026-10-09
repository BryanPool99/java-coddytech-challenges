package org.bpao.seccion3poo.proyectogestiondebiblioteca.exceptionhandlingintegration;

// TODO: Crea una clase de excepción personalizada base llamada LibraryException
// - Debe extender Exception
// - Incluye un constructor que acepte un mensaje y lo pase a la clase padre
public class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
}
