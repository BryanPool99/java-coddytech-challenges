# Introducción a los genéricos
Los genéricos te permiten escribir clases y métodos que funcionan con cualquier tipo, manteniendo la seguridad de tipos. Utilizan parámetros de tipo (marcadores de posición) que se reemplazan por tipos reales cuando se utiliza la clase.

Sin genéricos (usando Object):
```java
List list = new ArrayList();
list.add("Hello");
String s = (String) list.get(0);  // Se requiere casting manual
```

Con genéricos (seguro en cuanto a tipos):
```java
List<String> list = new ArrayList<String>();
list.add("Hello");
String s = list.get(0);  // No se necesita casting
```

Crear una clase genérica:
```java
public class GenericBox<T> {
    private T content;
    
    public GenericBox(T content) {
        this.content = content;
    }
    
    public T getContent() {
        return content;
    }
}
```

Usar una clase genérica:
```java
GenericBox<String> stringBox = new GenericBox<String>("Hello");
String value = stringBox.getContent();  // Sin casting

GenericBox<Integer> intBox = new GenericBox<Integer>(42);
Integer number = intBox.getContent();  // Seguro de tipos
```

Los corchetes angulares <T> indican un parámetro de tipo. Entre sus ventajas se incluyen: no se necesita una conversión de tipos explícita y los errores de tipo se detectan en tiempo de compilación en lugar de en tiempo de ejecución.
