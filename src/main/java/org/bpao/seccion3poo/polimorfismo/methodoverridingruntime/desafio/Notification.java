package org.bpao.seccion3poo.polimorfismo.methodoverridingruntime.desafio;

// Clase base para todas las notificaciones
public class Notification {
    // TODO: Añade el campo recipient (String)
    private String recipient;

    // TODO: Crea un constructor que inicialice el recipient
    public Notification(String recipient) {
        this.recipient = recipient;
    }

    // TODO: Crea un método getter para recipient

    public String getRecipient() {
        return this.recipient;
    }

    // TODO: Crea un método send() que imprima:
    // "Sending notification to [recipient]"
    public void send() {
        System.out.println("Sending notification to " + this.getRecipient());
    }
}
