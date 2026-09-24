# Records (Java 16+)
Java 16 introdujo los registros para eliminar el código repetitivo de las clases simples que transportan datos. Un registro es una clase especial diseñada para contener datos inmutables.

Declara un registro con la palabra clave record seguida de la lista de componentes:
```java
record Person(String name, int age) { }
```

Esto proporciona automáticamente:
- Campos privados y finales
- Un constructor
- Métodos de acceso (sin el prefijo get)
- toString(), equals() y hashCode()

Uso de un registro:
```java
Person p = new Person("Alice", 30);
System.out.println(p.name());    // Alice
        System.out.println(p.age());     // 30
        System.out.println(p);           // Person[name=Alice, age=30]
```

Los registros son implícitamente final y no pueden extenderse. Todos los campos son final, lo que hace que los registros sean inmutables por naturaleza.

Añade validación mediante un constructor compacto:
```java
record Person(String name, int age) {
    public Person {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
    }
}
```

Puedes añadir métodos personalizados a los registros:
```java
record Person(String name, int age) {
    public String getInfo() {
        return name + " is " + age + " years old";
    }
}
```