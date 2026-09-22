# Interfaz Comparator
La interfaz Comparator te permite crear una lógica de comparación externa para ordenar objetos sin modificar la clase original. Esto resulta útil cuando necesitas varias opciones de ordenación.

Un Comparator compara dos objetos del mismo tipo mediante la implementación del método compare():

```java
import java.util.Comparator;

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
```

Pasa el comparador a los métodos de ordenación:

```java
Collections.sort(people, new NameComparator());
```

Puedes usar expresiones lambda para escribir un código más conciso, ya que Comparator es una interfaz funcional:

```java
Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
```

Para comparar valores numéricos, usa métodos de clases envolventes como Double.compare() para realizar una comparación segura:

```java
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
```
Diferencia clave: Comparable define un único orden natural dentro de la propia clase, mientras que Comparator es una clase independiente que puede definir un número ilimitado de ordenaciones personalizadas externamente.
