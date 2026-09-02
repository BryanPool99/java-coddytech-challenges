# La palabra clave this
La palabra clave this se refiere a la instancia actual de una clase y distingue entre campos y parámetros con el mismo nombre.

Sin this, el parámetro oculta al campo:
```java
public Person(String name) {
    name = name;  // ¡Asigna el parámetro a sí mismo!
}
```

Uso de this para asignar valores correctamente:
```java
public Person(String name) {
    this.name = name;  // Asigna el parámetro al campo
}
```

Uso de this en métodos getter:
```java
public String getName() {
    return this.name;
}
```
Uso de this con múltiples campos:
```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getDescription() {
        return this.name + " is " + this.age + " years old";
    }
}
```
