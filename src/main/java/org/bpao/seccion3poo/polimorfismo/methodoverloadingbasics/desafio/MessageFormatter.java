package org.bpao.seccion3poo.polimorfismo.methodoverloadingbasics.desafio;

public class MessageFormatter {

    // TODO: Crear el método format que reciba solo un message
    // Debe devolver el message envuelto entre corchetes: [message]
    public String format(String message) {
        return String.format("[%s]", message);
    }

    // TODO: Crear el método format que reciba un message y un repeatCount
    // Debe devolver el message repetido repeatCount veces, separado por espacios
    public String format(String message, int repeatCount) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(message);
        }
        return result.toString();
    }

    // TODO: Crear el método format que reciba un message y un prefix
    // Debe devolver: prefix: message
    public String format(String message, String prefix) {
        return String.format("%s: %s", prefix, message);
    }

    // TODO: Crear el método format que reciba un message, prefix y suffix
    // Debe devolver: prefix: message (suffix)
    public String format(String message, String prefix, String suffix) {
        return String.format("%s: %s (%s)", prefix, message, suffix);
    }
}
