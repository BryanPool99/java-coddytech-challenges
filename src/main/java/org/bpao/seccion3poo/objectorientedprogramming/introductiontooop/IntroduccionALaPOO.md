# Introducción a la OOP

La Programación Orientada a Objetos (OOP) estructura el código utilizando objetos que contienen datos y comportamiento.

Una class es un modelo para crear objetos:
```java
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String makeSound() {
        return this.name + " makes a sound!";
    }
}
```

Un objeto es una instancia creada a partir de una class:
```java
Animal dog = new Animal("Buddy");
System.out.println(dog.makeSound());
```

Los objetos tienen datos (campos) y acciones (métodos).
Los cuatro pilares de la OOP son la encapsulación, la herencia, el polimorfismo y la abstracción.