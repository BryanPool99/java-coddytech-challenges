# Composición vs. Herencia

La composición crea una relación de «tiene-un» en la que una clase contiene instancias de otras clases como campos, en lugar de extenderlas.

Herencia frente a composición:

```java
// Herencia: Car ES un Engine (no tiene sentido)
class Car extends Engine { }

// Composición: Car TIENE un Engine (tiene sentido)
class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.ignite();
    }
}
```

Ventajas de la composición:

- Los objetos se pueden cambiar en tiempo de ejecución
- Se pueden combinar comportamientos de varias clases
- Mejor encapsulación: solo expone los métodos elegidos
- Código más flexible y fácil de mantener

Cuándo usarla:

- Herencia: Úsala cuando exista una relación genuina de «es-un» y la subclase sea una versión especializada de la clase principal
- Composición: Úsala cuando necesites la funcionalidad de otra clase sin ser de ese tipo

- Práctica recomendada: «Prefiere la composición a la herencia»