# Herencia básica (extends)

Usa la palabra clave extends para crear una relación de herencia entre clases:

```java
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public String getName() {
        return name;
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);  // Llama al constructor padre
    }

    public void bark() {
        System.out.println(getName() + " says woof!");
    }
}
```

La subclase (hija) hereda todos los métodos de la superclase (padre) y puede añadir los suyos propios:
```java
Dog myDog = new Dog("Buddy");
myDog.eat();   // Método heredado
myDog.bark();  // Método propio
```

Usa super() en el constructor de la subclase para llamar al constructor de la clase padre.

La herencia representa una relación «es-un» entre clases.