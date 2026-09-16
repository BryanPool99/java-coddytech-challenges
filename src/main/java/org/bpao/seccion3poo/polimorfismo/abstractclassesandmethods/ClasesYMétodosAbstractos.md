# Clases y métodos abstractos

Una clase abstracta se declara con la palabra clave abstract y no puede ser instanciada directamente. Sirve como un plano para las subclases:

```java
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method - no implementation
    public abstract double getArea();

    // Regular method - has implementation
    public String getColor() {
        return color;
    }
}
```

Los métodos abstractos no tienen cuerpo y deben ser implementados por subclases que no sean abstractas:

```java
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
```

Las clases abstractas pueden utilizarse como tipos de referencia para el polimorfismo:

```java
Shape shape = new Circle("red", 5.0);
System.out.println(shape.getArea());  // Calls Circle's implementation
```
Las clases abstractas son ideales cuando las subclases comparten código común pero deben implementar ciertos comportamientos de manera diferente.