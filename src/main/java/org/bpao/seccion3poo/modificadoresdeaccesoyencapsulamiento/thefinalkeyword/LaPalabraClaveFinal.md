# La palabra clave final
La palabra clave final evita la modificación en Java. Se puede aplicar a variables,
métodos y clases.

Cuando se aplica a una variable, final la convierte en una constante: una vez asignada, 
su valor no puede cambiar:

```java
public class Circle {
    private final double PI = 3.14159;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;  // Se puede asignar una vez en el constructor
    }

    public void setRadius(double r) {
        // this.radius = r;  // ¡Error! No se puede reasignar una variable final
    }
}
```

Una variable final debe inicializarse ya sea en la declaración o en el constructor.
Después de eso, cualquier intento de reasignarla provoca un error de compilación.

Para los tipos de referencia, final significa que la referencia no puede apuntar a un 
objeto diferente, pero el contenido del objeto aún puede cambiar:

```java
private final StringBuilder name = new StringBuilder("John");

// name = new StringBuilder("Jane");  // ¡Error! No se puede reasignar
name.append(" Doe");  // ¡OK! El contenido del objeto puede cambiar
```

El uso de final con campos comunica la intención: indica que un valor nunca debe 
cambiar después de la inicialización, lo cual es útil para valores de configuración, 
IDs o datos constantes.