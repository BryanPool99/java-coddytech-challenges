# Enums y métodos de Enum
Un enum es un tipo de clase especial que representa un conjunto fijo de constantes y proporciona valores seguros con respecto a los tipos y fáciles de leer:
```java
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

Day today = Day.MONDAY;
System.out.println(today);  // Imprime: MONDAY
```

Los enum pueden tener campos, constructores y métodos:
```java
enum Size {
    SMALL(10), MEDIUM(20), LARGE(30);
    
    private int price;
    
    Size(int price) {
        this.price = price;
    }
    
    public int getPrice() {
        return price;
    }
}

System.out.println(Size.MEDIUM.getPrice());  // Imprime: 20
```

Métodos integrados de los enum:

- values() - devuelve un arreglo de todas las constantes del enum
- valueOf(String) - convierte una cadena en la constante del enum correspondiente
- ordinal() - devuelve la posición de la constante (empezando desde 0)
```java
for (Day d : Day.values()) {
    System.out.println(d + " is at position " + d.ordinal());
}

Day day = Day.valueOf("FRIDAY");  // Convierte string a enum
```
