package org.bpao.seccion3poo.proyectogestiondebiblioteca.projectoverviewandumldesign;

public class Book {
    // TODO: Declara campos privados
    // - isbn (String)
    // - title (String)
    // - author (String)
    // - isAvailable (boolean, debería ser true por defecto)
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // TODO: Crea un constructor que acepte isbn, title y author
    // Recuerda establecer isAvailable en true por defecto
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    // TODO: Crea métodos getter para todos los campos
    // - getIsbn()
    // - getTitle()
    // - getAuthor()
    // - isAvailable() o getIsAvailable()

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    // TODO: Crea un setter para isAvailable
    // - setAvailable(boolean available)

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // TODO: Crea el método getDetails()
    // Debe devolver: "[isbn] title by author"
    public String getDetails() {
        return String.format("[%s] %s by %s", getIsbn(), getTitle(), getAuthor());
    }
}
