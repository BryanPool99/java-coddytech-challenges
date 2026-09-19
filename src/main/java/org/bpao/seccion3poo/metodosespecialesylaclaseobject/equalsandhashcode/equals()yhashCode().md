# equals() y hashCode()

El operador == comprueba si dos referencias apuntan a la misma ubicación de memoria, no si los objetos tienen el mismo contenido.

Para comparar el contenido de los objetos, sobrescribe el método equals() siguiendo este patrón:

```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;  // Misma referencia
    if (obj == null || getClass() != obj.getClass()) return false;  // Nulo o tipo diferente
    Person person = (Person) obj;  // Convertir al tipo correcto
    return age == person.age && name.equals(person.name);  // Comparar campos
}
```

Siempre que sobrescribas equals(), también debes sobrescribir hashCode(). Este es un contrato de Java: los objetos iguales deben tener el mismo código hash.

```java
@Override
public int hashCode() {
    return Objects.hash(name, age);
}
```

Usa Objects.hash() con los mismos campos utilizados en equals(). Esto garantiza que las colecciones basadas en hash, como HashMap y HashSet, funcionen correctamente.
