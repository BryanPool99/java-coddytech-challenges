# Visión general de los niveles de acceso

Los modificadores de acceso controlan desde dónde se puede acceder a los campos y métodos. Java tiene cuatro niveles de control de acceso:

| Modificador | Misma Clase | Mismo Paquete | Subclase | En todas partes |
| :--- | :---: | :---: | :---: | :---: |
| `private` | Sí | No | No | No |
| default (sin palabra clave) | Sí | Sí | No | No |
| `protected` | Sí | Sí | Sí | No |
| `public` | Sí | Sí | Sí | Sí |

```java
public class BankAccount {
    private double balance;      // Only this class
    String accountType;          // Default: same package only
    protected String owner;      // Same package + subclasses
    public String bankName;      // Accessible everywhere
}
```

private es el más restrictivo: úselo para datos internos a los que nunca se debe acceder directamente.
public es el más abierto: úselo para métodos que otras clases necesiten llamar.

Cuando no especifica ningún modificador,
Java utiliza el acceso default (también llamado package-private), que permite el acceso solo dentro del mismo paquete:

```java
class Helper {           // Default access class
    void assist() { }    // Default access method
}
```

Elija el nivel de acceso más restrictivo que aún permita que su código funcione.
Esto protege sus datos y hace que su código sea más fácil de mantener.