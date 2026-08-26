# Conteo de Palabras
Usaremos un HashMap para contar las frecuencias de palabras. 
La palabra será la clave, y su frecuencia será el valor.
```java
HashMap<String, Integer> wordCount = new HashMap<>();
String word = "hello";
wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
```