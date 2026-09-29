package org.bpao.seccion3poo.manejodeexcepcionespoo.recapvalidateduser;
// InvalidUsernameException.java
// Excepción verificada para fallos de validación de nombre de usuario

// TODO: Crea una clase de excepción verificada llamada InvalidUsernameException
// - Debe extender ValidationException (creando una jerarquía de excepciones)
// - Incluye un constructor que acepte un mensaje String
// - Pasa el mensaje al constructor padre
public class InvalidUsernameException extends ValidationException {
    // TODO: Implementa el constructor
    public InvalidUsernameException(String message) {
        super(message);
    }
}
