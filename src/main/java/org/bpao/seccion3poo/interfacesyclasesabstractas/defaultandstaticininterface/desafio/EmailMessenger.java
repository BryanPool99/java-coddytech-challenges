package org.bpao.seccion3poo.interfacesyclasesabstractas.defaultandstaticininterface.desafio;

// TODO: Crea la clase EmailMessenger que implementa Messenger
// 1. Añade un campo String llamado 'recipient'
// 2. Crea un constructor que inicialice el recipient
// 3. Implementa sendMessage() para imprimir: "Email to [recipient]: [message]"
// 4. Esta clase usa el método sendWithTimestamp() predeterminado tal cual (no se necesita sobrescribir)
public class EmailMessenger implements Messenger {
    // TODO: Añade el campo recipient
    private String recipient;

    // TODO: Crea el constructor
    public EmailMessenger(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return this.recipient;
    }

    // TODO: Implementa el método sendMessage
    @Override
    public void sendMessage(String message) {
        System.out.println("Email to " + this.getRecipient() + ": " + message);
    }
}
