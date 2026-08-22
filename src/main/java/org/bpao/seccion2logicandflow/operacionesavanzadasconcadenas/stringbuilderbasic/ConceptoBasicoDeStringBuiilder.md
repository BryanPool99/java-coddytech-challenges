# Conceptos Básicos de StringBuilder

`StringBuilder` se utiliza para crear cadenas **mutables** (modificables). Es mucho más eficiente que la concatenación de `String` regular cuando necesitas modificar un texto múltiples veces.

## 1. Crear un StringBuilder con texto inicial
```java
StringBuilder sb = new StringBuilder("Hello");
```

## 2. Añadir texto al final con `append()`
```java
sb.append(" World");
```
* **Resultado en `sb`:** `Hello World`

## 3. Insertar texto en una posición específica con `insert()`
```java
StringBuilder sb = new StringBuilder("Java");
sb.append(" is");      // Agrega al final
sb.insert(0, "Hey ");  // Agrega en la posición 0 (inicio)
```
* **Resultado en `sb`:** `Hey Java is`

## 4. Convertir StringBuilder a String con `toString()`
Cuando necesitas devolver, almacenar o imprimir el resultado como un `String` tradicional, debes usar el método `toString()`:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");

String result = sb.toString();  // Convierte a String
System.out.println(result);     // Imprime: Hello World
```

> **¿Por qué usar `toString()`?**
> Los métodos que requieren o devuelven el tipo `String` no pueden recibir un `StringBuilder` directamente. Siempre debes realizar la conversión primero.
