package org.bpao.seccion3poo.manejodeexcepcionespoo.checkedvsuncheckederrors.desafio;

// InvalidAgeException.java
// This is a CHECKED exception - extends Exception directly
// Los llamadores se verán FORZADOS a manejar esta excepción
public class InvalidAgeException extends Exception {
    // TODO: Crea un constructor que acepte un mensaje
    // y lo pasa a la clase padre usando super()
    public InvalidAgeException(String message) {
        super(message);
    }
}
