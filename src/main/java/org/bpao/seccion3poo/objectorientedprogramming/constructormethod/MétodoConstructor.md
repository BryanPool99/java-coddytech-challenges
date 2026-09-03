# Método constructor

Un constructor es un method especial que se ejecuta automáticamente cuando creas un objeto con new. Tiene el mismo nombre que la class y ningún tipo de return.

Constructor básico:
```java
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
```

Constructor predeterminado (sin parámetros):
```java
public class Book {
    private String title;
    
    public Book() {
        this.title = "Unknown";
    }
}
```

Usar un constructor para crear un objeto:
```java
Book book = new Book("1984", "Orwell");
// El constructor se ejecuta de inmediato, los campos se establecen
```

Si no escribes un constructor, Java proporciona uno vacío predeterminado.
Una vez que escribes cualquier constructor, el predeterminado ya no se proporciona automáticamente.