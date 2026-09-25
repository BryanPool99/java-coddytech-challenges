# Clases genéricas
Una clase genérica declara uno o más parámetros de tipo entre corchetes angulares después del nombre de la clase, que se pueden usar en toda la clase:

```java
class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
```

La T es un parámetro de tipo: un marcador de posición que se reemplaza por un tipo concreto al crear una instancia. Las convenciones habituales usan letras mayúsculas individuales: T para tipo, E para elemento, K para clave, V para valor.

Al instanciar una clase genérica, especifica el tipo concreto entre corchetes angulares:

```java
Box<String> stringBox = new Box<>();
stringBox.set("Hello");
String value = stringBox.get();  // No se necesita casting

Box<Integer> intBox = new Box<>();
intBox.set(42);
Integer num = intBox.get();
```

El <> (operador diamante) permite que Java infiera el tipo a partir de la declaración.

Usa varios parámetros de tipo para las clases que trabajan con más de un tipo:

```java
class Pair<K, V> {
    private K key;
    private V value;
    
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
}

Pair<String, Integer> pair = new Pair<>("age", 25);
```