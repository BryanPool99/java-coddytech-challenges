# Clases selladas (Java 17+)
Una sealed class restringe qué classes pueden extenderla mediante las palabras clave sealed y permits:
```java
sealed class Shape permits Circle, Rectangle, Triangle {
    abstract double area();
}
```

Solo las classes enumeradas en permits pueden extender la sealed class. Cualquier otra class que intente extenderla provocará un error de compilación.

Cada subclass permitida debe usar uno de tres modificadores:

- final - impide extensiones posteriores
- sealed - continúa la cadena de restricciones con sus propias subclasses permitidas
- non-sealed - abre la jerarquía para permitir extensiones sin restricciones

```java
sealed class Vehicle permits Car, Truck { }

final class Car extends Vehicle { }           // No se puede extender
non-sealed class Truck extends Vehicle { }    // Cualquiera puede extender Truck
```
Las sealed classes son útiles para modelar un conjunto fijo de tipos en un dominio, como métodos de pago, tipos de respuesta o formas geométricas. Funcionan bien con la coincidencia de patrones en expresiones switch, ya que el compilador conoce todos los subtipos posibles.
