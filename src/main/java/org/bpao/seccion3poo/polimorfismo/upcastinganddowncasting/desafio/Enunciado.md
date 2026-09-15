# Desafio - Upcasting y Downcasting

Construyamos un sistema de reproductor multimedia que demuestre tanto el upcasting como el downcasting en acción. Crearás una jerarquía de tipos multimedia y practicarás la conversión entre referencias de clases padre e hijas.

Organizarás tu código en cuatro archivos:

- Media.java: Crea la clase base que comparten todos los tipos multimedia. Cada elemento multimedia tiene un campo title (String). Incluye un constructor para inicializarlo, un método getter getTitle() y un método play() que imprime: Playing: [title]
- Song.java: Crea una clase que extienda Media. Las canciones tienen un campo adicional artist (String). Usa super para la inicialización de la clase padre. Sobrescribe play() para imprimir: Playing song: [title] by [artist]. Añade un método showArtist() que imprime: Artist: [artist]
- Podcast.java: Crea otra clase que extienda Media. Los podcasts tienen un campo episode (int). Sobrescribe play() para imprimir: Playing podcast: [title] - Episode [episode]. Añade un método showEpisode() que imprime: Episode: [episode]
- Main.java: Demuestra el upcasting y el downcasting con tus tipos multimedia. Recibirás cuatro entradas: el título de una canción, el nombre de un artista, el título de un podcast y un número de episodio.
Primero, crea un Song y haz upcasting a una referencia Media. Llama a play() en esta referencia para observar la polimorfía en tiempo de ejecución.

Después, haz downcasting de esa referencia Media nuevamente a Song y llama a showArtist() para acceder al método específico de la clase hija.

Luego, crea un Podcast y haz upcasting a una referencia Media. Llama a play() en esta referencia.

Finalmente, haz downcasting de esa referencia Media nuevamente a Podcast y llama a showEpisode().

Recibirás cuatro entradas: el título de la canción (String), el nombre del artista (String), el título del podcast (String) y el número de episodio (int).

Tu salida debe mostrar cuatro líneas: dos para la canción (su salida de reproducción y la información del artista) y dos para el podcast (su salida de reproducción y la información del episodio). ¡Observa cómo el upcasting te permite tratar diferentes tipos multimedia de manera uniforme, mientras que el downcasting te permite acceder a sus características únicas!