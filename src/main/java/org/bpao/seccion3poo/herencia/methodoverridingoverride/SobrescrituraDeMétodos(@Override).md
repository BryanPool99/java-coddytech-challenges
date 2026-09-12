# Sobrescritura de métodos (@Override)

La sobrescritura de métodos permite que una subclase proporcione su propia implementación de un método ya definido en su clase padre. El método sobrescrito debe tener el mismo nombre, tipo de retorno y parámetros que el método padre.

```java
public class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

La anotación @Override es opcional, pero se recomienda encarecidamente. Indica al compilador que pretendes sobrescribir un método padre, lo que ayuda a detectar errores como nombres de métodos mal escritos o parámetros incorrectos:

```java
@Override
public void makeSound() { }  // Correcto - el compilador verifica esto

public void makesound() { }  // ¡Typo! Crea un nuevo método en lugar de sobrescribir
```

Al llamar a un método sobrescrito, Java ejecuta la versión que pertenece al tipo real del objeto:

```java
Dog dog = new Dog();
dog.makeSound();  // Salida: Woof!

Cat cat = new Cat();
cat.makeSound();  // Salida: Meow!
```

Puedes usar super.methodName() dentro de un método sobrescrito para incluir el comportamiento de la clase padre junto con tu nuevo código.