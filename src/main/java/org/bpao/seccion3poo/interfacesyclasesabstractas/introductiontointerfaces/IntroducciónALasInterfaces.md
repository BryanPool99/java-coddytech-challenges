# Introducción a las Interfaces

Una interfaz es un contrato que define lo que una clase puede hacer, sin especificar cómo lo hace. Las interfaces contienen únicamente firmas de métodos sin implementación.

Las interfaces se declaran usando la palabra clave interface:

```java
public interface Drawable {
    void draw();
}
```

Todos los métodos de una interfaz son implícitamente public y abstract:

```java
public interface Playable {
    void play();    // implícitamente public abstract
    void pause();
    void stop();
}
```

Las interfaces pueden declarar constantes, que son implícitamente public static final:

```java
public interface GameConstants {
    int MAX_PLAYERS = 4;  // implícitamente public static final
}
```

Una clase puede implementar varias interfaces, a diferencia de extender varias clases.