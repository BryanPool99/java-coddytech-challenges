# La clase Object
En Java, cada clase hereda automáticamente de la clase Object, convirtiéndola en la raíz de toda la jerarquía de clases:

```java
public class Person {
    // Esto extiende implícitamente a Object
}

// Es equivalente a:
public class Person extends Object {
}
```
Cada objeto en Java tiene acceso a varios métodos integrados heredados de Object:

| Método                  | Propósito                                              |
|-------------------------|--------------------------------------------------------|
| `toString()`            | Devuelve una representación en cadena del objeto       |
| `equals(Object obj)`    | Compara dos objetos para determinar su igualdad        |
| `hashCode()`            | Devuelve un valor de código hash para el objeto        |
| `getClass()`            | Devuelve la clase en tiempo de ejecución del objeto    |

Por defecto, toString() devuelve el nombre de la clase seguido de la dirección de memoria del objeto:
```java
Person p = new Person();
System.out.println(p.toString());  // Salida: Person@1a2b3c4d
```

Puedes sobrescribir estos métodos en tus propias clases para proporcionar un comportamiento significativo. Puedes almacenar cualquier objeto en una variable de tipo Object, ya que todas las clases heredan de ella.
