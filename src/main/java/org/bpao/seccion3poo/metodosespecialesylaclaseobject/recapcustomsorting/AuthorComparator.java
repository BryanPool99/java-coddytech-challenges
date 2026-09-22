package org.bpao.seccion3poo.metodosespecialesylaclaseobject.recapcustomsorting;

import java.util.Comparator;

// TODO: Hacer que esta clase implemente Comparator<Book>
public class AuthorComparator implements Comparator<Book> {
    // TODO: Implementar el método compare() para ordenar libros alfabéticamente por autor (A a Z)
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
