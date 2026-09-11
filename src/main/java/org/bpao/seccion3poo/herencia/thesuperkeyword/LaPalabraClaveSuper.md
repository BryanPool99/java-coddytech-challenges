# La palabra clave super

La palabra clave super hace referencia a la clase principal desde dentro de una subclase.

Usa super() para llamar al constructor de la clase principal. Esta debe ser la primera instrucción en el constructor de la subclase:

```java
public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }
}

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);  // Debe ser la primera línea
        this.doors = doors;
    }
}
```

Usa super.methodName() para llamar a los métodos de la clase principal, lo cual resulta útil cuando la subclase sobrescribe un método:

```java
public class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

public class Cat extends Animal {
    public void makeSound() {
        super.makeSound();  // Llama a la versión de Animal
        System.out.println("Meow!");
    }
}
```

super hace referencia a la parte de la clase principal de un objeto, mientras que this hace referencia al objeto actual.

