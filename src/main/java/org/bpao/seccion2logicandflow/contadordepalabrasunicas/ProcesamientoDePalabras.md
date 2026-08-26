# Procesamiento de Palabras
Ahora procesaremos cada palabra eliminando la puntuación y convirtiéndola a minúsculas.
Esto nos ayudará a contar las palabras con precisión, 
de si están en mayúsculas o minúsculas o de la puntuación que las rodea.
```java
String word = "Hello!";
// Eliminar la puntuación y convertir a minúsculas
word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
System.out.println(word);
// imprime: hello
```