# Campos (Atributos)

Los campos (atributos) son variables que almacenan datos dentro de una clase. Normalmente son private y se accede a ellos mediante métodos getter y setter.

Declaración de campos privados:
```java
public class Person {
    private String name;
    private int age;
}
```

Cómo añadir getters y setters:
```java
public class Person {
    private String name;
    private int age;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```
Uso de la clase:
```java
Person person = new Person();
person.setName("Alice");
person.setAge(25);
System.out.println(person.getName());  // Alice
```

Hacer que los campos sean private se denomina encapsulación.
Esto protege los datos controlando el acceso mediante métodos, 
lo que permite añadir validación en los setters.