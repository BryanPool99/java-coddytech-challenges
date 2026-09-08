# Ocultamiento de información

El ocultamiento de información restringe el acceso directo a los datos internos de un objeto mediante el uso de campos private combinados con getters y setters.

Sin el ocultamiento de información, los campos quedan expuestos y pueden establecerse con valores no válidos:

```java
public class Temperature {
    public double celsius;  // Expuesto directamente
}

Temperature t = new Temperature();
t.celsius = -500;  // Se permite un valor no válido
```

Con el ocultamiento de información, usted controla el acceso y valida los datos:
```java
public class Temperature {
    private double celsius;
    
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        }
    }
    
    public double getCelsius() {
        return celsius;
    }
}
```

Beneficios clave del ocultamiento de información:

- Validación: Garantiza la integridad de los datos al rechazar valores no válidos
- Flexibilidad: Permite realizar cambios internos sin afectar al código externo
- Control: Le permite decidir qué operaciones están permitidas en sus datos