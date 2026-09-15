package org.bpao.seccion3poo.polimorfismo.methodoverridingruntime.desafio;

// Clase de notificación por correo electrónico que extiende Notification
public class EmailNotification extends Notification {
    // TODO: Agrega el campo subject (String)
    private String subject;

    // TODO: Crea un constructor que reciba recipient y subject
    // Usa super() para inicializar la clase padre
    public EmailNotification(String recipient, String subject) {
        super(recipient);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    // TODO: Sobrescribe el método send() para imprimir:
    // "Emailing [recipient]: [subject]"
    @Override
    public void send() {
        System.out.println("Emailing " + this.getRecipient() + ": " + this.getSubject());
    }
}
