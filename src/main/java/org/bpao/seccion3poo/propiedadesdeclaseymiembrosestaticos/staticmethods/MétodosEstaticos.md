# Métodos estáticos
Los métodos estáticos pertenecen a la propia clase y pueden llamarse sin crear un objeto. Decláralos usando la palabra clave static:

```java
public class MathHelper {
    public static int add(int a, int b) {
        return a + b;
    }
}

// Llamada sin crear un objeto
int sum = MathHelper.add(5, 3);  // 8
```

Restricción importante: Los métodos estáticos no pueden acceder directamente a variables de instancia o métodos de instancia, ya que existen sin un objeto y no tienen referencia this:

```java
public class Counter {
    private int count;              // Variable de instancia
    private static int total;       // Variable estática
    
    public static void incrementTotal() {
        total++;      // Correcto - accediendo a una variable estática
        // count++;   // ¡Error! No se puede acceder a una variable de instancia
    }
}
```

Los métodos estáticos son ideales para operaciones de utilidad que no dependen del estado del objeto, como Math.sqrt() o Integer.parseInt().
