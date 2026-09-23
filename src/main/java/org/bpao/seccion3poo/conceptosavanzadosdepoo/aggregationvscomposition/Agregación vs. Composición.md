# Agregación vs. Composición

Tanto la agregación como la composición son relaciones «tiene-un» que difieren en la propiedad y la dependencia del ciclo de vida.

Composición: El objeto contenido no puede existir independientemente del contenedor. Cuando se destruye el contenedor, sus partes también se destruyen. El contenedor crea sus partes internamente.

```java
class House {
    private Room[] rooms;

    public House(int numRooms) {
        rooms = new Room[numRooms];
        for (int i = 0; i < numRooms; i++) {
            rooms[i] = new Room();  // House crea y posee rooms
        }
    }
}
```

Agregación: El objeto contenido puede existir de forma independiente. El contenedor utiliza el objeto, pero no controla su ciclo de vida. Los objetos se pasan desde el exterior.

```java
class Team {
    private List<Player> players;
    
    public Team() {
        players = new ArrayList<>();
    }
    
    public void addPlayer(Player player) {
        players.add(player);  // Team usa jugadores existentes
    }
}
```

Diferencia clave: Cuando se elimina un contenedor, los objetos agregados siguen existiendo, pero los objetos compuestos se destruyen.
