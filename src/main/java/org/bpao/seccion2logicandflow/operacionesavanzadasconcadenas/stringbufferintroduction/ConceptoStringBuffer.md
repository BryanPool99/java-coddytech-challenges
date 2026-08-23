# Introducción a `StringBuffer`

`StringBuffer` es similar a `StringBuilder`, pero es **seguro para hilos (*thread-safe*)**, lo que significa que es adecuado para ser utilizado por múltiples hilos simultáneamente sin problemas de sincronización. Se utiliza para crear cadenas de texto **mutables** (modificables).

---

## 1. Creación de un `StringBuffer`

Puedes crear un `StringBuffer` e inicializarlo con un texto base:

```java
StringBuffer sb = new StringBuffer("Hello");
```

---

## 2. Añadir texto con `append()`

El método `append()` permite agregar texto al final del contenido existente:

```java
sb.append(" World");
```

**Resultado en `sb`:**  
`Hello World`

---

## 3. Modificar texto con `insert()` y `replace()`

Puedes insertar texto en una posición específica o reemplazar un rango de caracteres:

```java
StringBuffer sb = new StringBuffer("Java");

// Añade al principio (índice 0)
sb.insert(0, "Hi ");

// Reemplaza los caracteres del índice 0 al 2 por "Hey"
sb.replace(0, 2, "Hey");
```

**Resultado final en `sb`:**  
`Hey Java`