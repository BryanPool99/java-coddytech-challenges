# Constantes (static final)

Combinar static y final crea una constante: un valor que pertenece a la clase y nunca puede cambiar:

```java
public class GameSettings {
    public static final int MAX_PLAYERS = 4;
    public static final double GRAVITY = 9.81;
    public static final String GAME_TITLE = "Space Adventure";
}
```

Por convención, los nombres de las constantes usan UPPER_SNAKE_CASE.
Accede a las constantes mediante el nombre de la clase:

```java
System.out.println(GameSettings.MAX_PLAYERS);  // 4
// GameSettings.MAX_PLAYERS = 8;  // ¡Error! No se puede modificar
```

Normalmente, las constantes se declaran como public para compartirlas en toda la aplicación.
Hacen que el código sea más fácil de mantener y leer al reemplazar valores codificados directamente por nombres significativos.