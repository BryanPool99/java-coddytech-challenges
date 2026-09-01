# Clases vs. Objetos
Una clase es un plano que define la estructura.
Un objeto es una instancia específica creada a partir de ese plano.

Definiendo una clase:
```java
public class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getInfo() {
        return this.brand + " (" + this.year + ")";
    }
}
```

Creando objetos a partir de una clase:
```java
Car car1 = new Car("Tesla", 2023);
Car car2 = new Car("Honda", 2020);

System.out.println(car1.getInfo());  // Tesla (2023)
System.out.println(car2.getInfo());  // Honda (2020)
```

Cada objeto es independiente con sus propios datos.
Puedes crear objetos ilimitados a partir de la misma clase.