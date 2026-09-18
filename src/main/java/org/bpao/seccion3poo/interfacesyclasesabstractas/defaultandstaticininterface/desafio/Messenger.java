package org.bpao.seccion3poo.interfacesyclasesabstractas.defaultandstaticininterface.desafio;

// TODO: Define la interfaz Messenger
// 1. Declara un método abstracto: void sendMessage(String message)
// 2. Añade un método default: sendWithTimestamp(String message)
//    - Debe imprimir "[TIMESTAMP] " y luego llamar a sendMessage(message)
// 3. Añade un método estático: String formatMessage(String message)
//    - Debe devolver el mensaje convertido a mayúsculas
public interface Messenger {
    // TODO: Declara el método abstracto sendMessage
    void sendMessage(String message);

    // TODO: Añade el método default sendWithTimestamp
    default void sendWithTimestamp(String message) {
        System.out.print("[TIMESTAMP] ");
        sendMessage(message);
    }

    // TODO: Añade el método estático formatMessage
    static String formatMessage(String message) {
        return message.toUpperCase();
    }
}
