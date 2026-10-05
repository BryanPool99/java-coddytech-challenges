package org.bpao.seccion3poo.patronesdediseño2.decoratorpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee el mensaje a enviar
        String message = scanner.nextLine();

        // Lee la lista de canales separados por comas (p. ej., "email,sms" o "push,email,sms")
        String channelsInput = scanner.nextLine();

        // TODO: Empieza con un BasicNotifier
        Notifier notifier = new BasicNotifier();
        // TODO: Divide la entrada de canales por coma
        String[] channels = channelsInput.split(",");
        // TODO: Recorre cada canal y envuelve el notificador con el decorador apropiado
        // Los canales válidos son: "email", "sms", "push"
        for (String channel : channels) {
            if (channel.equals("email")) {
                notifier = new NotifierDecorators.EmailDecorator(notifier);
            } else if (channel.equals("sms")) {
                notifier = new NotifierDecorators.SMSDecorator(notifier);
            } else if (channel.equals("push")) {
                notifier = new NotifierDecorators.PushDecorator(notifier);
            }
        }
        // TODO: Llama a send en el notificador completamente decorado con el mensaje
        notifier.send(message);
    }
}
