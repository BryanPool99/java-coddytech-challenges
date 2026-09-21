# compareTo() y Comparable

La interfaz Comparable permite que los objetos definan su orden natural para la clasificación automática.

Implementa el método compareTo(), que devuelve:

- Valor negativo: este objeto va antes que el otro
- Cero: ambos objetos son iguales
- Valor positivo: este objeto va después que el otro

```java
public class Person implements Comparable<Person> {
    private int age;
    
    @Override
    public int compareTo(Person other) {
        return this.age - other.age;  // Ordenar por edad ascendente
    }
}
```

Ordena objetos usando Collections.sort():

```java
List<Person> people = new ArrayList<>();
people.add(new Person("Alice", 30));
people.add(new Person("Bob", 25));
Collections.sort(people);  // Ordenado por edad
```

Para comparar cadenas, delega en su método compareTo():

```java
return this.name.compareTo(other.name);
```

Para comparar valores double de forma segura, usa Double.compare():

```java
return Double.compare(this.rating, other.rating);  // Ascendente
return Double.compare(other.rating, this.rating);  // Descendente
```