# Patrón Decorator
El Patrón Decorator es un patrón de diseño estructural que agrega nuevos comportamientos a los objetos envolviéndolos en objetos decoradores. Añade funcionalidad dinámicamente durante el tiempo de ejecución sin modificar la clase original.

El patrón utiliza una interfaz común para que los objetos decorados puedan tratarse de la misma forma que el objeto original.

### Estructura básica
Define una interfaz de componente:
```java
interface Coffee {
    String getDescription();
    double getCost();
}
```

Crea un componente concreto que implemente la interfaz:
```java
class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }
    public double getCost() {
        return 2.0;
    }
}
```

Crea una clase decoradora abstracta que implemente la misma interfaz y mantenga una referencia al objeto envuelto:
```java
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
```
Crea decoradores concretos que extiendan el decorador abstracto:
```java
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
    
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
```

### Uso de decoradores
Apila varios decoradores para combinar funcionalidades:
```java
Coffee order = new SimpleCoffee();
order = new MilkDecorator(order);
order = new SugarDecorator(order);

System.out.println(order.getDescription());  // Simple Coffee, Milk, Sugar
System.out.println(order.getCost());         // 2.75
```

El decorador delega las llamadas al objeto envuelto mientras agrega su propio comportamiento. Cada decorador es independiente y se puede combinar libremente con los demás.
