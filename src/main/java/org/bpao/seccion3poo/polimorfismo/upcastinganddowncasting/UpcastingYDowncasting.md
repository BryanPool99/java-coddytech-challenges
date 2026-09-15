# Upcasting y Downcasting
En Java, el upcasting sube en la jerarquía de herencia y ocurre automáticamente. Un objeto hijo puede asignarse a una variable de tipo padre:

```java
Dog dog = new Dog();
Animal animal = dog;  // Upcasting - automático
```

Cuando haces upcasting, solo puedes acceder a los métodos definidos en la clase padre, aunque internamente el objeto siga siendo del tipo hijo.

El downcasting convierte una referencia al padre de nuevo en un tipo hijo. Requiere una conversión explícita:
```java
Animal animal = new Dog();  // Upcasting
Dog dog = (Dog) animal;     // Downcasting - se requiere un cast explícito
dog.bark();                 // Ahora podemos acceder a los métodos de Dog
```

El downcasting es arriesgado. Si el objeto no es realmente del tipo al que intentas convertirlo, Java lanza una ClassCastException durante la ejecución:
```java
Animal animal = new Cat();
Dog dog = (Dog) animal;  // ¡Compila, pero falla en tiempo de ejecución!
```

El compilador no puede detectar este error porque solo ve los tipos declarados. El tipo real del objeto solo se conoce cuando se ejecuta el programa.

