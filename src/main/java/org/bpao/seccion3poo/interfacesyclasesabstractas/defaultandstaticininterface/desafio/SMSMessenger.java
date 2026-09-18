package org.bpao.seccion3poo.interfacesyclasesabstractas.defaultandstaticininterface.desafio;

// TODO: Crea la clase SMSMessenger que implementa Messenger
// 1. Añade un campo String llamado 'phoneNumber'
// 2. Crea un constructor que inicialice el número de teléfono
// 3. Implementa sendMessage() para imprimir: "SMS to [phoneNumber]: [message]"
// 4. Sobrescribe sendWithTimestamp() para imprimir: "[URGENT] " y luego llama a sendMessage(message)
public class SMSMessenger implements Messenger {
    // TODO: Añade el campo phoneNumber
    private String phoneNumber;

    // TODO: Crea el constructor
    public SMSMessenger(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // TODO: Implementa el método sendMessage
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS to " + this.getPhoneNumber() + ": " + message);
    }

    // TODO: Sobrescribe el método sendWithTimestamp con comportamiento personalizado
    @Override
    public void sendWithTimestamp(String message) {
        System.out.print("[URGENT] ");
        this.sendMessage(message);
    }
}
