# Encadenamiento de constructores
El encadenamiento de constructores es el proceso de llamar a un constructor desde otro para evitar la duplicación de código.

## Encadenamiento dentro de la misma clase
Usa this() para llamar a otro constructor de la misma clase:

```java
public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this(1, 1);  // Llama al constructor de dos parámetros
    }

    public Rectangle(int size) {
        this(size, size);  // Crea un cuadrado
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
```

## Encadenamiento en la herencia
Usa super() para llamar al constructor de la clase principal. Debe ser la primera línea del constructor:

```java
public class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor");
    }
}

public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);  // Debe ser la primera línea
        this.breed = breed;
        System.out.println("Dog constructor");
    }
}
```

Si no llamas explícitamente a super(), Java inserta automáticamente super() (la versión sin argumentos). Los constructores de las clases principales siempre se llaman antes que los constructores de las clases hijas, lo que garantiza un orden de inicialización adecuado.