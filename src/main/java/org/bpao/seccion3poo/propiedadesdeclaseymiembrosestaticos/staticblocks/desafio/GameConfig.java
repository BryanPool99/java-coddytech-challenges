package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.staticblocks.desafio;

public class GameConfig {
    // TODO: Declarar el array estático privado levelThresholds (int[])
    private static int[] levelThresholds;
    // TODO: Declarar la variable estática privada maxLevel (int)
    private static int maxLevel;
    // TODO: Declarar la variable estática privada configLoaded (boolean)
    private static boolean configLoaded;

    // TODO: Primer bloque estático
    // - Inicializar maxLevel a 5
    // - Imprimir "Initializing game configuration..."
    static {
        maxLevel = 5;
        System.out.println("Initializing game configuration...");
    }

    // TODO: Segundo bloque estático
    // - Crear el array levelThresholds con un tamaño igual a maxLevel
    // - Llenarlo de modo que cada nivel requiera level * 100 puntos
    //   (el nivel 1 necesita 100, el nivel 2 necesita 200, etc.)
    // - Establecer configLoaded a true
    static {
        levelThresholds = new int[maxLevel];
        for (int i = 0; i < levelThresholds.length; i++) {
            levelThresholds[i] = (i + 1) * 100;
        }
        configLoaded = true;
    }

    // TODO: Implementar el método getThreshold(int level)
    // Devuelve el umbral de puntuación para ese nivel (los niveles están indexados en 1)
    public static int getThreshold(int level) {
        return levelThresholds[level-1];
    }

    // TODO: Implementar el método getMaxLevel()
    // Devuelve el nivel máximo
    public static int getMaxLevel() {
        return maxLevel;
    }

    // TODO: Implementar el método isConfigLoaded()
    // Devuelve si la configuración ha sido cargada
    public static boolean isConfigLoaded() {
        return configLoaded;
    }
}
