package org.bpao.seccion3poo.herencia.whynomulticlassinherit.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String deviceName = scanner.nextLine();
        String assistantName = scanner.nextLine();
        String songName = scanner.nextLine();

        // TODO: Crear un SmartSpeaker con deviceName y assistantName
        SmartSpeaker mySmartSpeaker = new SmartSpeaker(deviceName, assistantName);
        // TODO: Establecer la canción usando setSong()
        mySmartSpeaker.setSong(songName);
        // TODO: Llamar a getFullInfo()
        mySmartSpeaker.getFullInfo();
        // TODO: Llamar a playSound()
        mySmartSpeaker.playSound();
        // TODO: Llamar a voiceCommand("skip to next")
        mySmartSpeaker.voiceCommand("skip to next");
    }
}
