# Archivos externos

En Java, cada clase pública debe estar en su propio archivo .java con un nombre de archivo coincidente.

Ejemplo de clase en MyClass.java:
```java
public class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, I'm " + this.name;
    }
}
```

Uso de la clase en Main.java:
```java
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass("Alice");
        System.out.println(obj.greet());
    }
}
```

Las clases en el mismo paquete pueden acceder entre sí directamente.
Para clases en diferentes paquetes, utilice sentencias import.