# El operador instanceof

El operador instanceof comprueba si un objeto es una instancia de una clase específica antes de realizar la conversión:

```java
Animal animal = new Dog();

if (animal instanceof Dog) {
Dog dog = (Dog) animal;
    dog.bark();  // Es seguro llamar a métodos específicos de Dog
}
```

El operador devuelve true para la clase del objeto y para todas las clases principales de la jerarquía:

```java
Dog dog = new Dog();
System.out.println(dog instanceof Dog);     // true
System.out.println(dog instanceof Animal);  // true
System.out.println(dog instanceof Object);  // true
```

Desde Java 16, la coincidencia de patrones combina la comprobación y la conversión en un solo paso:

```java
if (animal instanceof Dog dog) {
    dog.bark();  // 'dog' ya está casteado y listo para usar
}
```

El operador instanceof devuelve false cuando se comprueba contra null, lo que elimina la necesidad de comprobaciones null independientes.