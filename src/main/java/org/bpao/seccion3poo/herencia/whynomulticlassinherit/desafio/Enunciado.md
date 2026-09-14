# Desafio fácil - Por qué no hay herencia múltiple de clases

Construyamos un sistema de reproductor de música que demuestre la regla de herencia simple de Java y muestre cómo aún puedes lograr diseños flexibles dentro de esta limitación.

Imagina que quieres crear un altavoz inteligente que combine funciones de un reproductor de música y de un asistente de voz. Como Java no permite extender varias clases, tendrás que diseñar cuidadosamente tu jerarquía usando herencia simple.

Crearás cuatro archivos para organizar tu código:

- AudioDevice.java: Crea la clase base que comparten todos los dispositivos que reproducen audio. Debe tener:
  - Un campo privado para deviceName (String)
  - Un constructor que acepte el nombre del dispositivo
  - Un método getDeviceName() que devuelva el nombre
  - Un método playSound() que imprima: [deviceName]: Playing audio
- MusicPlayer.java: Crea una clase que extienda AudioDevice y añada funciones específicas de música:
  - Un campo privado para currentSong (String)
  - Un constructor que reciba el nombre del dispositivo y use super(deviceName)
  - Un método setSong(String song) que establezca la canción actual
  - Redefine playSound() para que imprima: [deviceName]: Now playing - [currentSong]
- SmartSpeaker.java: Crea una clase que extienda MusicPlayer (¡no tanto MusicPlayer como alguna clase VoiceAssistant; eso sería herencia múltiple!). El altavoz inteligente se basa en el reproductor de música al añadir funciones de voz:
  - Un campo privado para assistantName (String)
  - Un constructor que reciba el nombre del dispositivo y el nombre del asistente, usando super(deviceName)
  - Un método voiceCommand(String command) que imprima: [assistantName]: Processing "[command]"
  - Un método getFullInfo() que imprima: [deviceName] with [assistantName] assistant
- Main.java: Demuestra tu cadena de herencia multinivel. Recibirás tres entradas: un nombre de dispositivo (String), un nombre de asistente (String) y un nombre de canción (String). Crea un SmartSpeaker, establece una canción y después llama a estos métodos en orden:
  - getFullInfo()
  - playSound()
  - voiceCommand("skip to next")

Recibirás tres entradas: el nombre del dispositivo, el nombre del asistente y el nombre de la canción.

Observa cómo SmartSpeaker obtiene capacidades musicales al extender MusicPlayer en una cadena (AudioDevice -> MusicPlayer -> SmartSpeaker), en lugar de intentar extender varias clases no relacionadas. ¡Este es el enfoque de Java para mantener la herencia limpia y sin ambigüedades!
