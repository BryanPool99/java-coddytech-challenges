# Bloques estáticos
Un bloque estático (o inicializador estático) se ejecuta una vez cuando la clase se carga por primera vez, antes de que se cree cualquier objeto o se llame a métodos estáticos. Se utiliza para lógica de inicialización compleja que requiere múltiples sentencias.

```java
public class Example {
    private static String value;

    static {
        // Lógica de inicialización
        value = "initialized";
        System.out.println("Static block executed");
    }
}
```

Los bloques estáticos se ejecutan automáticamente cuando la clase se carga en memoria, solo una vez independientemente de cuántos objetos se creen.

Puedes tener múltiples bloques estáticos en una clase. Se ejecutan en el orden en que aparecen:

```java
public class Example {
    private static int[] values;
    
    static {
        values = new int[5];
    }
    
    static {
        for (int i = 0; i < values.length; i++) {
            values[i] = i * 10;
        }
    }
}
```

Los usos comunes incluyen la inicialización de arreglos o colecciones estáticas, la configuración de valores de configuración que requieren cálculos y la realización de tareas de configuración únicas a nivel de clase.
