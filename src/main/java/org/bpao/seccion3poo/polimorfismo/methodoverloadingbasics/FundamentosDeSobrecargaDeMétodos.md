# Fundamentos de sobrecarga de métodos

La sobrecarga de métodos permite definir múltiples métodos con el mismo nombre pero diferentes parámetros. Esto también se conoce como polimorfismo en tiempo de compilación porque Java determina qué método llamar durante la compilación.

El compilador distingue los métodos sobrecargados basándose en el número, tipo o el orden de los parámetros:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```

Al llamar a add(5, 3), Java utiliza el primer método. Llamar a add(5, 3, 2) activa el segundo, y add(5.0, 3.0) invoca al tercero.

Importante: Cambiar solo el tipo de retorno no es una sobrecarga válida. La lista de parámetros debe ser diferente:
```java
// NO es una sobrecarga válida
public int getValue() { return 1; }
public double getValue() { return 1.0; }  // Error!
```
