# Herencia simple y multinivel
Java soporta diferentes estructuras de herencia. Los dos patrones principales son la herencia simple y la herencia multinivel.

La herencia simple ocurre cuando una clase extiende exactamente una clase padre directamente:

```java
public class Animal { }
public class Dog extends Animal { }
public class Cat extends Animal { }
```

Tanto Dog como Cat heredan de Animal, pero no el uno del otro.

La herencia multinivel crea una cadena donde una clase extiende a otra clase, la cual a su vez extiende a otra clase:

```java
public class Animal {
    public void eat() {
        System.out.println("Eating");
    }
}

public class Mammal extends Animal {
    public void breathe() {
        System.out.println("Breathing");
    }
}

public class Dog extends Mammal {
    public void bark() {
        System.out.println("Barking");
    }
}
```

En la herencia multinivel, una clase hija tiene acceso a todos los métodos de toda la cadena de herencia:

```java
Dog dog = new Dog();
dog.eat();      // De Animal
dog.breathe();  // De Mammal
dog.bark();     // De Dog
```

Cada jerarquía de clases tiene a Object en la cima. El encadenamiento de constructores fluye a través de todos los niveles al crear un nuevo objeto.
