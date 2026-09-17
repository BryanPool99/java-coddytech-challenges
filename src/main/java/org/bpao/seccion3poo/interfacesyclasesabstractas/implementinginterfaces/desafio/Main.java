package org.bpao.seccion3poo.interfacesyclasesabstractas.implementinginterfaces.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String humanName = scanner.nextLine();
        String robotModel = scanner.nextLine();

        // TODO: Crear un objeto Human con el nombre dado
        Human human = new Human(humanName);
        // TODO: Crear un objeto Robot con el modelo dado
        Robot robot = new Robot(robotModel);
        // TODO: Crear un array de referencias Speaker que contenga ambos objetos
        Speaker[] speakers = {human, robot};
        // TODO: Recorrer el array e imprimir el resultado de speak() para cada speaker
        for (Speaker speaker : speakers) {
            System.out.println(speaker.speak());
        }
    }
}
