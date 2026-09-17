# Implementación de Interfaces

Una clase utiliza la palabra clave implements para implementar una interfaz y debe proporcionar implementaciones concretas para todos los métodos declarados en la interfaz:

```java
public interface Drawable {
    void draw();
}

public class Circle implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
```

La anotación @Override es opcional, pero se recomienda, ya que ayuda a detectar errores.

Las interfaces se pueden utilizar como tipos de referencia, lo que permite el polimorfismo, donde distintas clases que implementan la misma interfaz pueden tratarse de manera uniforme:

```java
Drawable shape1 = new Circle(5.0);
Drawable shape2 = new Rectangle(4.0, 3.0);

shape1.draw();  // Dibujando un círculo con radio 5.0
shape2.draw();  // Dibujando un rectángulo 4.0 x 3.0
```