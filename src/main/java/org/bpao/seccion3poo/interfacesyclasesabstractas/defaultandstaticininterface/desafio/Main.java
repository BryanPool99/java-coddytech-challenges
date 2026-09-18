package org.bpao.seccion3poo.interfacesyclasesabstractas.defaultandstaticininterface.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String emailRecipient = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String message = scanner.nextLine();

        // TODO: Usa Messenger.formatMessage() para formatear el mensaje y almacenarlo
        String messageFormat = Messenger.formatMessage(message);
        // TODO: Crea un EmailMessenger con el destinatario del email
        EmailMessenger emailMessenger = new EmailMessenger(emailRecipient);
        // TODO: Crea un SMSMessenger con el número de teléfono
        SMSMessenger smsMessenger = new SMSMessenger(phoneNumber);
        // TODO: Llama a sendWithTimestamp() en el EmailMessenger con el mensaje formateado
        emailMessenger.sendWithTimestamp(messageFormat);
        // TODO: Llama a sendWithTimestamp() en el SMSMessenger con el mensaje formateado
        smsMessenger.sendWithTimestamp(messageFormat);
    }
}
