package org.bpao.seccion3poo.interfacesyclasesabstractas.introductiontointerfaces.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        // TODO: Imprime información sobre las interfaces
        // Print: "Switchable methods: turnOn, turnOff"
        System.out.println("Switchable methods: turnOn, turnOff");
        // Print: "Adjustable methods: setLevel"
        System.out.println("Adjustable methods: setLevel");
        // Print: "Max level constant: " followed by Adjustable.MAX_LEVEL
        System.out.println("Max level constant: " + Adjustable.MAX_LEVEL);
        // Print: "Setting level to: " followed by the input level
        System.out.println("Setting level to: " + level);
    }
}
