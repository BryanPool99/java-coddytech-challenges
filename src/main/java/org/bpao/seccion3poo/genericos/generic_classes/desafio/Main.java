package org.bpao.seccion3poo.genericos.generic_classes.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String recipientName = scanner.nextLine();
        String giftDescription = scanner.nextLine();
        int giftValue = scanner.nextInt();

        // TODO: Crea un GiftBox<String> que contenga la descripción del regalo
        GiftBox<String> stringGiftBox = new GiftBox<>(giftDescription);
        // TODO: Envuélvelo usando el método wrap()
        stringGiftBox.wrap();
        // TODO: Imprime su estado usando getStatus()
        System.out.println(stringGiftBox.getStatus());
        // TODO: Crea un GiftBox<Integer> que contenga el valor del regalo
        GiftBox<Integer> integerGiftBox = new GiftBox<>(giftValue);
        // TODO: No envuelvas este - imprime su estado (debería mostrar unwrapped)
        System.out.println(integerGiftBox.getStatus());
        // TODO: Crea un Registry<String, String> emparejando el destinatario con la descripción del regalo
        Registry<String, String> registry = new Registry<>(recipientName, giftDescription);
        // TODO: Imprime la entrada del registro usando getEntry()
        System.out.println(registry.getEntry());
    }
}
