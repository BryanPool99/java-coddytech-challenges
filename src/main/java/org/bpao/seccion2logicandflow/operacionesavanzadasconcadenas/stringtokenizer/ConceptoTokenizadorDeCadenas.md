# Tokenizador de Cadenas

`StringTokenizer` divide una cadena en *tokens* (partes más pequeñas) basándose en un delimitador. Por defecto, utiliza
el espacio en blanco como delimitador.

## 1. Crear un StringTokenizer con el delimitador por defecto (espacio)

```java
StringTokenizer st = new StringTokenizer("Hello World Java");
```

## 2. Contar y obtener tokens

```java
int count = st.countTokens();  // Obtiene el número de tokens
String first = st.nextToken(); // Obtiene el siguiente token
```

## 3. Crear StringTokenizer con un delimitador personalizado

```java
StringTokenizer st = new StringTokenizer(text, delimiter);
```

---

### ⚠️ Comportamiento importante

Cuando llamas a `nextToken()`, este **elimina** ese token del tokenizer. El método `countTokens()` devuelve el número de
tokens **restantes**, no el total original.

**Ejemplo:**

```java
StringTokenizer st = new StringTokenizer("Hello World Java");

System.out.

println(st.countTokens());  // Imprime: 3

        st.

nextToken();  // Consume "Hello"
System.out.

println(st.countTokens());  // Imprime: 2 (¡no 3!)

        st.

nextToken();  // Consume "World"
System.out.

println(st.countTokens());  // Imprime: 1
```

Consejo: Si necesitas saber el recuento total de tokens, llama a countTokens() antes de consumir cualquier token. Usa
hasMoreTokens() para verificar si hay más tokens disponibles mientras iteras.