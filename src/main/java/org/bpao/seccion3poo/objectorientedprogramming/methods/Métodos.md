# Métodos

Los method definen acciones que un objeto puede realizar. Tienen un tipo de return, un nombre y parámetros opcionales.

Method sin parámetros:
```java
public class Greeter {
    public String sayHello() {
        return "Hello!";
    }
}
```

Method con parámetros y tipo de return:
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

Method void (sin valor de return):
```java
public class Printer {
    public void printMessage(String msg) {
        System.out.println(msg);
    }
}
```

Llamar a los method:
```java
Calculator calc = new Calculator();
int result = calc.add(5, 3);
System.out.println(result);  // Salida: 8
```

El tipo de return indica a Java qué tipo de datos envía de vuelta el method.
Usa void cuando un method realiza una acción, pero no devuelve datos.