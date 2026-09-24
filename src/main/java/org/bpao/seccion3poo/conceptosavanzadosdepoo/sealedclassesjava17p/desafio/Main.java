package org.bpao.seccion3poo.conceptosavanzadosdepoo.sealedclassesjava17p.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee las cuatro entradas
        String message = scanner.nextLine();
        String email = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String deviceId = scanner.nextLine();

        // TODO: Crea uno de cada tipo de notificación usando el mismo mensaje
        // - EmailNotification con message y email
        EmailNotification emailNotification = new EmailNotification(message, email);
        // - SMSNotification con message y phoneNumber
        SMSNotification smsNotification = new SMSNotification(message, phoneNumber);
        // - PushNotification con message y deviceId
        PushNotification pushNotification = new PushNotification(message, deviceId);
        // TODO: Almacena las tres notificaciones en un array Notification[]
        // Esto demuestra el polimorfismo con clases selladas
        Notification[] notifications = {emailNotification, smsNotification, pushNotification};
        // TODO: Itera a través del array e imprime el resultado de deliver()
        // para cada notificación
        for (Notification notification : notifications) {
            System.out.println(notification.deliver());
        }
    }
}
