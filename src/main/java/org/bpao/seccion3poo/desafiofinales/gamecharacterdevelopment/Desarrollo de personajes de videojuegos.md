# Desarrollo de personajes de videojuegos

La programación orientada a objetos (POO) permite modelar sistemas complejos mediante clases, herencia, interfaces y patrones de diseño.

### Jerarquía de clases
Crea una clase base con atributos comunes y extiéndela con clases especializadas:

```java
public abstract class Character {
    private String name;
    private int health;
    private int maxHealth;
    private int level;

    public Character(String name, int maxHealth, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.level = level;
    }

    protected void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, maxHealth));
    }

    public abstract String getCharacterClass();
}
```

### Interfaces
Define contratos para comportamientos específicos que las clases pueden implementar:

```java
public interface Attackable {
    String attack(Character target);
    DamageType getDamageType();
}

public interface Healable {
    String heal(int amount);
}
```

### Enumeraciones con campos
Las enumeraciones pueden tener campos, constructores y métodos:

```java
public enum DamageType {
    PHYSICAL("brute force"),
    MAGICAL("arcane energy"),
    RANGED("precision strike");
    
    private String description;
    
    private DamageType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
```

### Implementación de varias interfaces
Una clase puede implementar varias interfaces:

```java
public class Mage extends Character implements Attackable, Healable {
    private int intelligence;
    private int mana;
    
    @Override
    public String attack(Character target) {
        // Implementación
    }
    
    @Override
    public String heal(int amount) {
        // Implementación
    }
}
```

### Encapsulación
Usa campos privados con setters protegidos para controlar el acceso y validar los datos:

```java
protected void setHealth(int health) {
    this.health = Math.max(0, Math.min(health, maxHealth));
}
```

### Polimorfismo
Trata de manera uniforme los distintos tipos de personajes mediante su clase base común o sus interfaces, lo que permite utilizar colecciones y llamadas a métodos flexibles.

