# Método toString()

Cada clase en Java hereda de la clase Object. El método toString() devuelve una representación de cadena de un objeto.

De forma predeterminada, toString() devuelve el nombre de la clase seguido del código hash del objeto:

```java
Person p = new Person("Alice", 25);
System.out.println(p);  // Person@15db9742
```

Sobrescribe toString() para proporcionar una salida significativa:

```java
@Override
public String toString() {
    return "Person[name=" + name + ", age=" + age + "]";
}

Person p = new Person("Alice", 25);
System.out.println(p);  // Person[name=Alice, age=25]
```

El método toString() se llama automáticamente cuando imprimes un objeto o lo concatenas con una cadena.
