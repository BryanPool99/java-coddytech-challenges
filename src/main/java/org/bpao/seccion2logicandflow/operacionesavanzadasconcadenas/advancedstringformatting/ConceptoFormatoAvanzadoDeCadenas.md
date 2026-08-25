# Formato Avanzado de Cadenas

El formateo de cadenas en Java utiliza especificadores de formato con el método `String.format()`:

- `%s` para cadenas (Strings)
- `%d` para números enteros
- `%.2f` para números decimales con 2 lugares decimales

## 1. Formatear cadenas con múltiples valores

```java
String name = "John";
int age = 25;
String text = String.format("Name: %s, Age: %d", name, age);
// Resultado: "Name: John, Age: 25"
```

## 2. Formatear números decimales con precisión

```java
double price = 19.99;
String formatted = String.format("Price: $%.2f", price);
// Resultado: "Price: $19.99"
```

> 💡 **Nota:** `String.format()` no imprime directamente en la consola, sino que **devuelve** una nueva cadena con el formato aplicado, la cual puedes almacenar en una variable o usar donde lo necesites.