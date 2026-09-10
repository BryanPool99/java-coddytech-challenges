# Desafio Facil de Bloques estáticos

Construyamos un sistema GameConfig que use bloques estáticos para inicializar la configuración del juego cuando la clase se cargue por primera vez. Esto es perfecto para configuraciones que deben calcularse o prepararse una sola vez antes de crear cualquier objeto del juego.

Crearás dos archivos para organizar tu código:

- GameConfig.java: crea una clase de configuración que inicialice sus ajustes mediante bloques estáticos:
  - Un arreglo estático privado levelThresholds (int[]) que almacena la puntuación necesaria para alcanzar cada nivel
  - Una variable estática privada maxLevel (int) que almacena el número total de niveles
  - Una variable estática privada configLoaded (boolean) para indicar si se realizó la inicialización
  - Usa un bloque estático para inicializar maxLevel en 5 e imprimir "Initializing game configuration..."
  - Usa un segundo bloque estático para crear el arreglo levelThresholds con un tamaño igual a maxLevel; después, rellénalo de modo que cada nivel requiera level * 100 puntos (el nivel 1 requiere 100, el nivel 2 requiere 200, etc.) y establece configLoaded en true
  - Un método estático getThreshold(int level) que devuelve el umbral de puntuación de ese nivel (los niveles comienzan en 1)
  - Un método estático getMaxLevel() que devuelve el nivel máximo
  - Un método estático isConfigLoaded() que devuelve si se ha cargado la configuración
- Main.java: demuestra que los bloques estáticos se ejecutan automáticamente cuando se accede a la clase. Recibirás una entrada: un número de nivel que consultar. Imprime cuatro líneas:
  - Config loaded: true o Config loaded: false
  - Max level: [maxLevel]
  - Level [level] threshold: [threshold]
  - Level 1 threshold: [threshold] (muestra siempre también el nivel 1)

Recibirás una entrada: el número de nivel (int) que consultar.

Observa cómo el mensaje de inicialización se imprime antes de que se ejecute cualquier código de tu Main:
¡ese es el bloque estático ejecutándose cuando la clase se carga por primera vez!