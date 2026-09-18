# Métodos Default y Static en Interfaces

A partir de Java 8, las interfaces pueden incluir métodos predeterminados y métodos estáticos, además de métodos abstractos.

Los métodos predeterminados proporcionan una implementación directamente en la interfaz mediante la palabra clave default. Las clases que implementan la interfaz heredan este comportamiento automáticamente, pero pueden sobrescribirlo si es necesario:

```java
public interface Drawable {
    void draw();

    default void display() {
        System.out.println("Displaying on screen...");
        draw();
    }
}
```

Los métodos estáticos de las interfaces pertenecen a la propia interfaz y se llaman usando el nombre de la interfaz. No se pueden sobrescribir y las clases que implementan la interfaz no los heredan:

```java
public interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }
}

// Uso
int result = MathOperations.add(5, 3);
```

Si una clase implementa dos interfaces con la misma firma de método predeterminado, la clase debe sobrescribir ese método para resolver el conflicto.
