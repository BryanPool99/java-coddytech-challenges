package org.bpao.seccion3poo.polimorfismo.methodoverloadingbasics.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String message = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();

        // TODO: Crear un objeto MessageFormatter
        MessageFormatter messageFormatter = new MessageFormatter();
        // TODO: Llamar a format solo con el mensaje e imprimir el resultado
        System.out.println(messageFormatter.format(message));
        // TODO: Llamar a format con el mensaje y repeatCount e imprimir el resultado
        System.out.println(messageFormatter.format(message, repeatCount));
        // TODO: Llamar a format con el mensaje y el prefijo e imprimir el resultado
        System.out.println(messageFormatter.format(message, prefix));
        // TODO: Llamar a format con el mensaje, el prefijo y el sufijo e imprimir el resultado
        System.out.println(messageFormatter.format(message, prefix, suffix));
    }
}
