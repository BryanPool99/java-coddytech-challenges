package org.bpao.seccion3poo.patronesdediseño2.decoratorpattern.desafio;

// NotifierDecorators - contiene la jerarquía de decoradores
public class NotifierDecorators {
    // Clase decoradora abstracta que implementa Notifier
    abstract static class NotifierDecorator implements Notifier {
        // TODO: Añade un campo protected para contener el Notifier envuelto
        protected Notifier notifier;

        // TODO: Crea un constructor que acepte un Notifier para envolver
        public NotifierDecorator(Notifier notifier) {
            this.notifier = notifier;
        }
    }

    // EmailDecorator - añade capacidad de notificación por email
    static class EmailDecorator extends NotifierDecorator {
        // TODO: Crea un constructor que pase el notifier al padre
        public EmailDecorator(Notifier notifier) {
            super(notifier);
        }

        // TODO: Implementa el método send
        // Primero delega al notifier envuelto, luego imprime: Email: [message]
        @Override
        public void send(String message) {
            notifier.send(message);
            System.out.println("Email: " + message);
        }
    }

    // SMSDecorator - añade capacidad de notificación por SMS
    static class SMSDecorator extends NotifierDecorator {
        // TODO: Crea un constructor que pase el notifier al padre
        public SMSDecorator(Notifier notifier) {
            super(notifier);
        }

        // TODO: Implementa el método send
        // Primero delega al notifier envuelto, luego imprime: SMS: [message]
        @Override
        public void send(String message) {
            notifier.send(message);
            System.out.println("SMS: " + message);
        }
    }

    // PushDecorator - añade capacidad de notificación push
    static class PushDecorator extends NotifierDecorator {
        // TODO: Crea un constructor que pase el notifier al padre
        public PushDecorator(Notifier notifier) {
            super(notifier);
        }

        // TODO: Implementa el método send
        // Primero delega al notifier envuelto, luego imprime: Push: [message]
        @Override
        public void send(String message) {
            notifier.send(message);
            System.out.println("Push: " + message);
        }
    }
}
