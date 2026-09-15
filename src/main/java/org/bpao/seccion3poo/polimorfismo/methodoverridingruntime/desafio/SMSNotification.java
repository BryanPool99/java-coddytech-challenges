package org.bpao.seccion3poo.polimorfismo.methodoverridingruntime.desafio;

// Clase de notificación SMS que extiende Notification
public class SMSNotification extends Notification {
    // TODO: Agrega el campo phoneNumber (String)
    private String phoneNumber;

    // TODO: Crea un constructor que reciba recipient y phoneNumber
    // Usa super() para inicializar la clase padre
    public SMSNotification(String recipient, String phoneNumber) {
        super(recipient);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // TODO: Sobrescribe el método send() para imprimir:
    // "Texting [phoneNumber] for [recipient]"
    @Override
    public void send() {
        System.out.println("Texting " + this.getPhoneNumber() + " for " + this.getRecipient());
    }
}
