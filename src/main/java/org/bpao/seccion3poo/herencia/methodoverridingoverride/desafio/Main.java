package org.bpao.seccion3poo.herencia.methodoverridingoverride.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();

        // TODO: Create a Notification object with the message
        Notification myNotification = new Notification(message);
        // TODO: Create an EmailNotification object with the message and recipient
        EmailNotification myEmailNotification = new EmailNotification(recipient,message);
        // TODO: Call send() on the Notification object
        myNotification.send();
        // TODO: Call send() on the EmailNotification object
        myEmailNotification.send();
    }
}
