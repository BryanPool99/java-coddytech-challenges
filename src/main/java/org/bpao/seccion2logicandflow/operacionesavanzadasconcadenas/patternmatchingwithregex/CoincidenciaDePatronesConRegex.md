## Coincidencia de Patrones con Regex
Las clases Pattern y Matcher proporcionan herramientas potentes para operaciones regex en Java.
## Crear un patrón usando Pattern.compile():
```java
Pattern pattern = Pattern.compile("cat");
// Crea un patrón para encontrar "cat"
```

## Crear un matcher para su texto:
```java
String text = "The cat and dog";
Matcher matcher = pattern.matcher(text);
// Crea un matcher para el texto
```
## Encontrar coincidencias usando matcher.find():
```java
while (matcher.find()) {
System.out.println("Found at: " + matcher.start());
}
```

## Métodos clave:

* matcher.find() - Busca la siguiente ocurrencia del patrón
* Devuelve true si se encuentra, false si no hay más coincidencias
    * Úselo en un bucle para encontrar todas las ocurrencias
* matcher.start() - Devuelve el índice inicial de la última coincidencia encontrada
* Llame después de un find() exitoso