package org.bpao.seccion3poo.metodosespecialesylaclaseobject.recapcustomsorting;

import java.util.Objects;

// TODO: Hacer que esta clase implemente Comparable<Book>
public class Book implements Comparable<Book> {
    // TODO: Declarar campos privados: title (String), author (String), year (int)
    private String title;
    private String author;
    private int year;

    // TODO: Crear un constructor que inicialice todos los campos
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    // TODO: Crear getters para todos los campos

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    // TODO: Implementar el método compareTo() para el orden natural por año (ascendente)
    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.year, otherBook.year);
    }
    // TODO: Sobrescribir toString() para que devuelva: [title] by [author] ([year])

    @Override
    public String toString() {
        return String.format("%s by %s (%d)", this.getTitle(), this.getAuthor(), this.getYear());
    }

    // TODO: Sobrescribir equals() - dos libros son iguales si tienen el mismo título Y autor

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    // TODO: Sobrescribir hashCode() usando Objects.hash() con title y author

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
