# Parámetros de tipo delimitados
Usa parámetros de tipo acotados para restringir qué tipos pueden usarse con genéricos mediante la palabra clave extends:

```java
class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();  // ¡Se pueden llamar métodos de Number!
    }
}

NumberBox<Integer> intBox = new NumberBox<>(42);
NumberBox<Double> doubleBox = new NumberBox<>(3.14);
// NumberBox<String> strBox = new NumberBox<>("Hi");  // ¡Error de compilación!
```

El límite T extends Number significa que T debe ser Number o cualquiera de sus subclases. Esto permite llamar a los métodos definidos en el tipo límite.

Especifica múltiples límites mediante &. Si un límite es una clase, debe aparecer primero:

```java
class DataProcessor<T extends Number & Comparable<T>> {
    public boolean isGreater(T a, T b) {
        return a.compareTo(b) > 0;
    }
}
```

Los parámetros de tipo acotados funcionan con métodos genéricos:

```java
public static <T extends Comparable<T>> T findMax(T a, T b) {
    return a.compareTo(b) > 0 ? a : b;
}
```