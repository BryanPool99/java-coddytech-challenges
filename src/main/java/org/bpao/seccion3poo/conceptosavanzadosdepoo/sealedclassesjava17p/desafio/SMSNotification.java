package org.bpao.seccion3poo.conceptosavanzadosdepoo.sealedclassesjava17p.desafio;

// TODO: Crea una clase non-sealed SMSNotification que extienda Notification
// - Usa la palabra clave 'non-sealed' para permitir la extensión futura
// - Añade un campo privado 'phoneNumber' (String)
// - Añade un constructor que tome message y phoneNumber
//   (llama a super(message) para inicializar el padre)
// - Implement deliver() to return: "Sending SMS to [phoneNumber]: [message]"
public non-sealed class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    String deliver() {
        return "Sending SMS to " + this.phoneNumber + ": " + this.getMessage();
    }
}
