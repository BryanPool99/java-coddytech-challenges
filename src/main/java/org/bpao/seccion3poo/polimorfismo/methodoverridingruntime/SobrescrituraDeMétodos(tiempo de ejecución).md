# Sobrescritura de métodos (tiempo de ejecución)

La sobrescritura de métodos demuestra el polimorfismo en tiempo de ejecución, donde Java decide qué método ejecutar cuando el programa se está ejecutando, basándose en el tipo real del objeto en lugar del tipo declarado de la variable.

Cuando una referencia de padre apunta a un objeto hijo, Java llama al método sobrescrito basándose en el tipo de objeto real en tiempo de ejecución:

```java
public class Animal {
    public void speak() {
        System.out.println("Some sound");
    }
}

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}

Animal myPet = new Dog();
myPet.speak();  // Salida: Bark!

myPet = new Cat();
myPet.speak();  // Salida: Meow!
```

Esto se llama despacho dinámico de métodos. La JVM observa lo que el objeto es realmente, no lo que dice la variable que es.

El polimorfismo en tiempo de ejecución permite procesar diferentes objetos de manera uniforme:

```java
Animal[] pets = {new Dog(), new Cat(), new Dog()};
for (Animal pet : pets) {
    pet.speak();  // Cada uno llama a su propia versión
}
```