# Clases Abstractas vs Interfaces

Usa una clase abstracta cuando las clases compartan una base común con estado o comportamiento compartidos. Las clases abstractas pueden tener variables de instancia, constructores y una combinación de métodos abstractos y concretos:

```java
public abstract class Animal {
    protected String name;  // estado compartido

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {  // comportamiento compartido
        System.out.println(name + " is sleeping");
    }

    public abstract void makeSound();  // debe ser implementado
}
```

Usa una interfaz cuando quieras definir una capacidad que puedan compartir clases no relacionadas. Las interfaces se centran en lo que un objeto puede hacer, no en lo que es:

```java
public interface Flyable {
    void fly();
}

// Clases no relacionadas pueden compartir esta capacidad
class Bird extends Animal implements Flyable { ... }
class Airplane implements Flyable { ... }
class Drone implements Flyable { ... }
```
| Característica | Clase abstracta | Interfaz |
|---|---|---|
| Variables de instancia | Sí | Solo constantes |
| Constructores | Sí | No |
| Herencia múltiple | No (un solo `extends`) | Sí (varios `implements`) |
| Modificadores de acceso | Cualquiera | Solo `public` (para métodos abstractos) |

Directriz: Si estás creando una clase abstracta con solo métodos abstractos y sin estado, probablemente una interfaz sea la mejor opción.
