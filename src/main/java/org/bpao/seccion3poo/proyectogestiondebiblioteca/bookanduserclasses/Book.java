package org.bpao.seccion3poo.proyectogestiondebiblioteca.bookanduserclasses;

public class Book {
    // Campos privados
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    // TODO: Añade un campo private String llamado borrowedBy
    private String borrowedBy;

    // Constructor que acepta isbn, title y author
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        // TODO: Inicializa borrowedBy a null
        this.borrowedBy = null;
    }

    // Métodos getter para todos los campos
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

    // TODO: Añade un getter para borrowedBy
    public String getBorrowedBy() {
        return borrowedBy;
    }

    // Setter para isAvailable
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // TODO: Añade un setter para borrowedBy que también actualice isAvailable
    // Cuando borrowedBy se establece a un valor no nulo, isAvailable pasa a ser false
    // Cuando borrowedBy se establece a null, isAvailable pasa a ser true
    public void setBorrowedBy(String userId) {
        this.borrowedBy = userId;
        if (userId != null) {
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }

    // Método getDetails()
    // Devuelve: "[isbn] title by author"
    public String getDetails() {
        return "[" + isbn + "] " + title + " by " + author;
    }
}
