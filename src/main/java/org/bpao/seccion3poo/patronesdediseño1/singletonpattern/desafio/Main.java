package org.bpao.seccion3poo.patronesdediseño1.singletonpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String newAppName = scanner.nextLine();
        int newMaxUsers = scanner.nextInt();

        // TODO: Obtén la primera instancia de AppConfig y guárdala en config1
        AppConfig config1 = AppConfig.getInstance();
        // TODO: Llama a displaySettings() en config1 para mostrar los valores predeterminados
        config1.displaySettings();
        // TODO: Actualiza la configuración usando setAppName y setMaxUsers en config1
        config1.setAppName(newAppName);
        config1.setMaxUsers(newMaxUsers);
        // TODO: Obtén otra instancia y guárdala en config2
        AppConfig config2 = AppConfig.getInstance();
        // TODO: Llama a displaySettings() en config2 para demostrar que los cambios se comparten
        config2.displaySettings();
        // TODO: Imprime si ambas referencias apuntan al mismo objeto:
        // "Same instance: [true/false]" using config1 == config2
        System.out.println("Same instance: " + (config1==config2));
    }
}
