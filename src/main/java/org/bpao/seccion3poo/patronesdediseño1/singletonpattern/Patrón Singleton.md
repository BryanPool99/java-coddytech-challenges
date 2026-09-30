# Patrón Singleton
El patrón Singleton garantiza que una clase tenga una sola instancia en toda la aplicación, proporcionando un punto de acceso global a esa instancia.

### Componentes clave:
- Un campo private static que contiene la única instancia
- Un constructor private para evitar la creación directa de instancias
- Un método public static que devuelve la instancia

### Implementación básica:
```java
public class DatabaseConnection {
    private static DatabaseConnection instance;

    // El constructor privado previene la instanciación directa
    private DatabaseConnection() {
        System.out.println("Connection created");
    }

    // Punto de acceso global
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing: " + sql);
    }
}
```

### Uso:
```java
DatabaseConnection db1 = DatabaseConnection.getInstance();
DatabaseConnection db2 = DatabaseConnection.getInstance();

System.out.println(db1 == db2);  // true - misma instancia
```
La instancia se crea únicamente cuando se solicita por primera vez. Esto se denomina inicialización diferida. Cada llamada a getInstance() devuelve el mismo objeto, lo que garantiza un estado compartido en toda la aplicación.
