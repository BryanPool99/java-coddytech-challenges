package org.bpao.seccion3poo.manejodeexcepcionespoo.recapvalidateduser;
// InvalidAgeException.java
// Excepción no verificada para errores de programación relacionados con la edad

// TODO: Crea una clase de excepción no verificada llamada InvalidAgeException
// - Debe extender RuntimeException
// - Incluye un constructor que acepte un mensaje String
// - Pasa el mensaje al constructor padre
public class InvalidAgeException extends RuntimeException {
    // TODO: Implementa el constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}
