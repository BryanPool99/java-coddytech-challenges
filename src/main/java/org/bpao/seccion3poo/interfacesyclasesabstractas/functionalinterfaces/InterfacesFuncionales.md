# Interfaces Funcionales

Una interfaz funcional es una interfaz con exactamente un método abstracto. Se puede implementar mediante expresiones lambda para escribir código conciso.

Usa la anotación @FunctionalInterface para marcar una interfaz como funcional (opcional, pero recomendado):

```java
@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);
}
```

Las interfaces funcionales se pueden implementar de forma tradicional o mediante expresiones lambda:

```java
// Implementación tradicional
Calculator adder = new Calculator() {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
};

// Expresión lambda
Calculator adder = (a, b) -> a + b;

System.out.println(adder.calculate(5, 3));  // 8
```

Las interfaces funcionales pueden tener métodos predeterminados y estáticos sin infringir la regla de un único método abstracto.

El paquete java.util.function de Java proporciona interfaces funcionales integradas como Predicate, Function y Consumer.
