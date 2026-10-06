# Patrón Iterator
El Patrón Iterator es un patrón de diseño de comportamiento que proporciona una forma de acceder secuencialmente a los elementos de una colección sin exponer su estructura subyacente.

El patrón separa la lógica de recorrido de la propia colección mediante dos componentes principales:
- Interfaz Iterator: define métodos para recorrer los elementos
- Iterable/Container: crea iteradores para su colección

### Estructura básica
```java
interface Iterator<T> {
    boolean hasNext();
    T next();
}

interface Container<T> {
    Iterator<T> createIterator();
}
```

### Ejemplo de implementación
```java
class BookShelf implements Container<String> {
    private String[] books;
    private int count = 0;
    
    public BookShelf(int size) {
        books = new String[size];
    }
    
    public void addBook(String book) {
        books[count++] = book;
    }
    
    public Iterator<String> createIterator() {
        return new BookIterator();
    }
    
    private class BookIterator implements Iterator<String> {
        private int index = 0;
        
        public boolean hasNext() {
            return index < count;
        }
        
        public String next() {
            return books[index++];
        }
    }
}
```

### Uso
```java
BookShelf shelf = new BookShelf(3);
shelf.addBook("Design Patterns");
shelf.addBook("Clean Code");

Iterator<String> iterator = shelf.createIterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```

El iterador mantiene su propio estado de recorrido, lo que permite que varios iteradores recorran la misma colección de forma independiente. Las interfaces integradas Iterable e Iterator de Java siguen este patrón, lo que permite los bucles for mejorados.
