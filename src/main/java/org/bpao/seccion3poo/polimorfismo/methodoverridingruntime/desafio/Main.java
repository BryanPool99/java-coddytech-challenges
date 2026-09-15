package org.bpao.seccion3poo.polimorfismo.methodoverridingruntime.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String recipient = scanner.nextLine();
        String subject = scanner.nextLine();
        String phoneNumber = scanner.nextLine();

        // TODO: Crear un arreglo de referencias de Notification con 3 elementos
        // El arreglo debe contener (en este orden):
        // 1. Un objeto Notification base
        // 2. Un objeto EmailNotification
        // 3. Un objeto SMSNotification
        // Todos usando el mismo recipient
        Notification[] notifications = {
                new Notification(recipient),
                new EmailNotification(recipient, subject),
                new SMSNotification(recipient, phoneNumber)
        };
        // TODO: Recorrer el arreglo y llamar a send() en cada elemento
        // ¡Esto demuestra el polimorfismo en tiempo de ejecución!
        for (Notification notification : notifications) {
            notification.send();
        }
    }
}
