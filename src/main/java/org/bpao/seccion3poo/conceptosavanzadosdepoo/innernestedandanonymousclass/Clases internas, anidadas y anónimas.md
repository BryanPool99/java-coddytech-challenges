# Clases internas, anidadas y anónimas

Java permite definir clases dentro de otras clases. Estas clases internas ayudan a organizar el código agrupando la funcionalidad relacionada y pueden acceder directamente a los miembros de la clase externa.

### Clase Interna Anidada

Una clase interna anidada se define como un miembro de otra clase. Tiene acceso a todos los campos y métodos de la clase externa, incluidos los privados:

```java
class Outer {
    private String message = "Hello";

    class Inner {
        void display() {
            System.out.println(message);  // Can access private field
        }
    }
}

// Usage
Outer outer = new Outer();
Outer.Inner inner = outer.new Inner();
inner.display();  // Prints: Hello
```

### Clase Interna Local
Una clase interna local se define dentro de un método. Solo se puede utilizar dentro de ese método y puede acceder a variables locales que sean efectivamente finales:

```java
void process() {
    String prefix = "Result: ";
    
    class LocalHelper {
        void print(int value) {
            System.out.println(prefix + value);
        }
    }
    
    new LocalHelper().print(42);
}
```

### Clase Interna Anónima
Una clase interna anónima es una clase sin nombre, creada e instanciada en una sola expresión. Se utiliza comúnmente para implementar interfaces o extender clases sobre la marcha:
```java
Comparator<String> comp = new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        return a.length() - b.length();
    }
};
```
Las clases internas son particularmente útiles cuando una clase solo es relevante para otra clase, manteniendo su código organizado y encapsulado.
