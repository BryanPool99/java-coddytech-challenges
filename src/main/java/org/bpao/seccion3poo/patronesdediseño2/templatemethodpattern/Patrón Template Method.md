# Patrón Template Method

El patrón de método plantilla es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en una clase base, lo que permite que las subclases sobrescriban pasos específicos sin cambiar la estructura general.

El patrón utiliza una clase abstracta con un método plantilla que llama a una secuencia de pasos. Algunos pasos tienen implementaciones predeterminadas, mientras que otros son abstractos y deben ser implementados por las subclases:

```java
abstract class DataProcessor {
    // Método plantilla - define la estructura del algoritmo
    public final void process() {
        readData();
        processData();
        saveData();
    }

    abstract void readData();
    abstract void processData();

    // Implementación por defecto (método hook)
    void saveData() {
        System.out.println("Saving to default location");
    }
}
```

Las subclases concretas implementan los métodos abstractos:
```java
class CSVProcessor extends DataProcessor {
    void readData() {
        System.out.println("Reading CSV file");
    }
    
    void processData() {
        System.out.println("Parsing CSV data");
    }
}
```
El método plantilla está marcado como final para evitar que las subclases alteren la estructura del algoritmo. Cuando se llama, ejecuta la misma secuencia para todas las subclases:
```java
DataProcessor csv = new CSVProcessor();
csv.process();
// Salida:
// Leyendo archivo CSV
// Analizando datos CSV
// Guardando en la ubicación predeterminada
```

### Características principales:
- El método plantilla es final y define la estructura del algoritmo
- Los métodos abstractos deben ser implementados por las subclases
- Los métodos gancho proporcionan implementaciones predeterminadas que se pueden sobrescribir opcionalmente
- Promueve la reutilización del código al colocar la lógica común en la clase base