# Implementación de Múltiples Interfaces

Una clase puede implementar múltiples interfaces enumerándolas después de la palabra clave implements, separadas por comas:

```java
public class Rectangle implements Drawable, Resizable {
    // Debe implementar todos los métodos de ambas interfaces
}
```

La clase debe implementar todos los métodos de cada interfaz que declara.

También puedes combinar la herencia de clases con la implementación de múltiples interfaces:

```java
public class Square extends Shape implements Drawable, Resizable {
    // Implementa métodos de ambas interfaces
    // Puede usar miembros heredados de Shape
}
```

Esto permite que una clase cumpla múltiples funciones y tenga distintas capacidades.
