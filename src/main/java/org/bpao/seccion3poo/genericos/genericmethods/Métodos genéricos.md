# Métodos genéricos
Un método genérico declara su propio parámetro de tipo, independiente de cualquier elemento genérico a nivel de clase. El parámetro de tipo aparece antes del tipo de retorno en la firma del método.

Sintaxis básica de un método genérico:
```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
```

El <T> se coloca entre los modificadores y el tipo de retorno. El compilador infiere el tipo real a partir de los argumentos que pasas.

Los métodos genéricos pueden devolver el tipo genérico:
```java
public static <T> T getFirst(T[] array) {
    if (array.length > 0) {
        return array[0];
    }
    return null;
}
```

Se pueden usar varios parámetros de tipo:
```java
public static <K, V> void printPair(K key, V value) {
    System.out.println(key + ": " + value);
}

printPair("Age", 25);        // String y Integer
printPair(1, "First");       // Integer y String
```

Los métodos genéricos son útiles en las clases de utilidades para realizar operaciones flexibles y reutilizables sin crear una clase genérica.
