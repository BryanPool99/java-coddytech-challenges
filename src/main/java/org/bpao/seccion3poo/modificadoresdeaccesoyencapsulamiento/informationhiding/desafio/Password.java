package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.informationhiding.desafio;

public class Password {
    // TODO: Declarar un campo privado para almacenar la contraseña
    private String password;
    // TODO: Declarar un campo privado para el requisito de longitud mínima
    private int minLength;

    // TODO: Crear un constructor que reciba el requisito de longitud mínima
    public Password(int minLength) {
        this.minLength = minLength;
        this.password = null;
    }
    // TODO: Crear el método setPassword que valide y establezca la contraseña
    // Devolver true si la contraseña cumple con la longitud mínima, false en caso contrario

    public boolean setPassword(String password) {
        if (password.length() >= this.minLength) {
            this.password = password;
            return true;
        }
        return false;
    }

    // TODO: Crear el método getMaskedPassword que devuelva asteriscos en lugar de la contraseña real
    // ¡Nunca expongas la contraseña real!
    public String getMaskedPassword() {
        if (password==null) {
            return "";
        }
        StringBuilder masked = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            masked.append("*");
        }
        return masked.toString();
    }

    // TODO: Crear el método checkPassword que compare un intento con la contraseña almacenada
    public boolean checkPassword(String attempt) {
        if (password==null) {
            return false;
        }
        return password.equals(attempt);
    }

    // TODO: Crear el método getLength que devuelva la longitud de la contraseña (o 0 si no se ha establecido)
    public int getLength(String password) {
        if (password==null || password.isEmpty() || password.isBlank()) return 0;
        return password.length();
    }
}
