package org.bpao.seccion3poo.interfacesyclasesabstractas.multiinterfaceimplemen.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String brand = scanner.nextLine();
        int volumeLevel = scanner.nextInt();

        // TODO: Crea un SmartTV con la marca dada
        SmartTV smartTV = new SmartTV(brand);
        // TODO: Llama a powerOn()
        smartTV.powerOn();
        // TODO: Llama a setVolume() con el nivel dado
        smartTV.setVolume(volumeLevel);
        // TODO: Print: Current volume: [volume] using getVolume()
        System.out.println("Current volume: " + smartTV.getVolume());
        // TODO: Llama a powerOff()
        smartTV.powerOff();
    }
}
