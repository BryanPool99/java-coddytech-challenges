package org.bpao.seccion3poo.herencia.methodoverridingoverride.desafio;

// Subclass that extends Notification for email-specific behavior
public class EmailNotification extends Notification {
    // TODO: Añade un campo privado para la dirección de correo del destinatario
    private String recipient;

    // TODO: Crea un constructor que tome message y recipient
    // Pista: Usa super(message) para llamar al constructor padre
    public EmailNotification(String recipient, String message) {
        super(message);
        this.recipient = recipient;
    }

    public String getRecipient() {
        return this.recipient;
    }

    // TODO: Sobrescribe el método send() usando la anotación @Override
    // Debería imprimir: Emailing [recipient]: [message]
    @Override
    public void send() {
        System.out.println("Emailing " + this.getRecipient() + ": " + this.getMessage());
    }
}
