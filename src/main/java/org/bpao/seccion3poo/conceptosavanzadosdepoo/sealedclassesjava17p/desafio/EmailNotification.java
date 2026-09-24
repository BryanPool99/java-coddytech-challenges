package org.bpao.seccion3poo.conceptosavanzadosdepoo.sealedclassesjava17p.desafio;

// TODO: Crea una clase final EmailNotification que extienda Notification
// - Usa la palabra clave 'final' ya que esta es una subclase permitida
// - Añade un campo privado 'recipient' (String) para la dirección de correo electrónico
// - Añade un constructor que tome message y recipient
//   (llama a super(message) para inicializar el padre)
// - Implementa deliver() para devolver: "Sending email to [recipient]: [message]"
public final class EmailNotification extends Notification {
    private String recipient;

    public EmailNotification(String message, String recipient) {
        super(message);
        this.recipient = recipient;
    }

    @Override
    String deliver() {
        return "Sending email to " + this.recipient + ": " + this.getMessage();
    }
}
