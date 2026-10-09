package org.bpao.seccion3poo.proyectogestiondebiblioteca.admininterface;

// TODO: Crea una interfaz llamada LibraryAdmin con tres declaraciones de métodos:
//   boolean addBook(String isbn, String title, String author)
//   boolean removeBook(String isbn)
//   boolean registerUser(String id, String name)
public interface LibraryAdmin {
    boolean addBook(String isbn, String title, String author);

    boolean removeBook(String isbn);

    boolean registerUser(String id, String name);
}
