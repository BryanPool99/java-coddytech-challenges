# Método clone()

El método clone() crea una copia de un objeto. Para usarlo, tu clase debe implementar la interfaz Cloneable y sobrescribir el método clone() de la clase Object:

```java
public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
```

Creación de copias independientes:

```java
Person original = new Person("Alice", 25);
Person copy = original.clone();
// copy es un objeto separado con los mismos valores
```

De forma predeterminada, clone() realiza una copia superficial, copiando los valores primitivos y las referencias. Si tu objeto contiene otros objetos como campos, tanto el original como el clon harán referencia a los mismos objetos anidados. Para obtener copias realmente independientes con objetos anidados, implementa una copia profunda clonando también esos objetos anidados dentro de tu método clone().
