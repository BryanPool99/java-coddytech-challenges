package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.staticblocks.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        // TODO: Acceder a GameConfig para demostrar la ejecución del bloque estático
        // Los bloques estáticos en GameConfig se ejecutarán automáticamente cuando accedas por primera vez a la clase
        GameConfig.getThreshold(level);
        // TODO: Imprimir si la configuración está cargada
        // Formato: "Config loaded: true" o "Config loaded: false"
        System.out.println("Config loaded: " + GameConfig.isConfigLoaded());
        // TODO: Imprimir el nivel máximo
        // Formato: "Max level: [maxLevel]"
        System.out.println("Max level: " + GameConfig.getMaxLevel());
        // TODO: Imprimir el umbral para el nivel de entrada
        // Formato: "Level [level] threshold: [threshold]"
        System.out.println(String.format("Level %d threshold: %d",level,GameConfig.getThreshold(level)));
        // TODO: Imprimir el umbral para el nivel 1
        // Formato: "Level 1 threshold: [threshold]"
        System.out.println(String.format("Level 1 threshold: %d",GameConfig.getThreshold(1)));
    }
}
