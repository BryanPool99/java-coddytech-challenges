# Patrón Try With Resources
La instrucción try-with-resources cierra automáticamente los recursos cuando se completa el bloque. Se puede usar cualquier clase que implemente AutoCloseable:

```java
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
String line = reader.readLine();
}  // Cerrado automáticamente aquí
```
Se pueden gestionar varios recursos separándolos con punto y coma. Se cierran en el orden inverso al de su declaración:
```java
try (FileReader fr = new FileReader("input.txt");
     BufferedReader br = new BufferedReader(fr)) {
    // Usa ambos recursos
}  // br se cierra primero, luego fr
```

Para crear una clase personalizada que se cierre automáticamente, implementa la interfaz AutoCloseable y su método close():
```java
public class DatabaseConnection implements AutoCloseable {
    public DatabaseConnection() {
        System.out.println("Connection opened");
    }
    
    @Override
    public void close() {
        System.out.println("Connection closed");
    }
}
```
