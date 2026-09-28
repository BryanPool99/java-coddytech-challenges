# Comodines (?, extends, super)

Java proporciona tres tipos de comodines para trabajar con tipos genéricos cuando el parámetro de tipo exacto se desconoce o es irrelevante.


### Comodín sin límite (?)

Representa un tipo desconocido y acepta cualquier tipo parametrizado:

```java
public static void printList(List<?> list) {
    for (Object item : list) {
        System.out.println(item);
    }
}

printList(new ArrayList<String>());   // Funciona
printList(new ArrayList<Integer>());  // Funciona
```

### Comodín con límite superior (? extends Type)
Acepta el tipo especificado o cualquiera de sus subclases. Úsalo cuando necesites leer de una estructura genérica:
```java
public static double sumNumbers(List<? extends Number> numbers) {
    double sum = 0;
    for (Number n : numbers) {
        sum += n.doubleValue();
    }
    return sum;
}

sumNumbers(Arrays.asList(1, 2, 3));        // Lista de Integer
sumNumbers(Arrays.asList(1.5, 2.5));       // Lista de Double
```

### Comodín con límite inferior (? super Type)
Acepta el tipo especificado o cualquiera de sus superclases. Úsalo cuando necesites escribir en una estructura genérica:
```java
public static void addIntegers(List<? super Integer> list) {
    list.add(1);
    list.add(2);
}

List<Number> numbers = new ArrayList<>();
addIntegers(numbers);  // Funciona - Number es un supertipo de Integer
```

### Principio PECS
El productor usa extends, el consumidor usa super: Usa extends cuando solo leas (productor); usa super cuando solo escribas (consumidor).
