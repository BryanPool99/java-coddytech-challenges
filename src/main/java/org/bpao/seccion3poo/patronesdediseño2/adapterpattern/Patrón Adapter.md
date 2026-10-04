# Patrón Adapter

El patrón Adaptador es un patrón de diseño estructural que permite que interfaces incompatibles trabajen juntas al actuar como un puente entre dos clases, convirtiendo una interfaz en otra que el cliente espera.

### Componentes clave

- Interfaz objetivo: La interfaz que el cliente espera utilizar
- Adaptado: La clase existente con una interfaz incompatible
- Adaptador: La clase que implementa la interfaz objetivo y envuelve al adaptado, traduciendo las llamadas entre ambos

## Estructura básica
```java
// Interfaz objetivo
interface MediaPlayer {
    void play(String filename);
}

// Adaptee (clase incompatible)
class AdvancedVideoPlayer {
    public void playVideo(String filename) {
        System.out.println("Playing video: " + filename);
    }
}

// Adaptador
class VideoPlayerAdapter implements MediaPlayer {
    private AdvancedVideoPlayer videoPlayer;
    
    public VideoPlayerAdapter() {
        this.videoPlayer = new AdvancedVideoPlayer();
    }
    
    public void play(String filename) {
        videoPlayer.playVideo(filename);
    }
}

// Uso del cliente
MediaPlayer player = new VideoPlayerAdapter();
player.play("movie.mp4");  // Salida: Playing video: movie.mp4
```

## Cuándo utilizarlo
El patrón Adaptador es útil cuando:
- Se integra código heredado o bibliotecas de terceros sin modificar su código fuente
- Se necesita hacer que interfaces incompatibles trabajen juntas
- El cliente debe permanecer ajeno a la implementación adaptada