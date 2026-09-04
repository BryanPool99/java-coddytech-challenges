# Sobrecarga de constructores

La sobrecarga de constructores permite múltiples constructores con diferentes listas de parámetros en la misma clase.

Ejemplo de múltiples constructores:
```java
public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }
}
```

El encadenamiento de constructores con this() llama a un constructor desde otro para evitar la duplicación de código:
```java
public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this(title, author, 0);  // Llama al constructor de 3 parámetros
    }

    public Book() {
        this("Unknown", "Unknown");  // Llama al constructor de 2 parámetros
    }
}
```

Uso:
```java
Book b1 = new Book("1984", "Orwell", 328);
Book b2 = new Book("Dune", "Herbert");
Book b3 = new Book();
```

Importante: this() debe ser la primera sentencia en el constructor.