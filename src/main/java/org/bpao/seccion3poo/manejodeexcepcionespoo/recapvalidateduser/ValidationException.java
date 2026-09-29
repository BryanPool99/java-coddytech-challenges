package org.bpao.seccion3poo.manejodeexcepcionespoo.recapvalidateduser;
// ValidationException.java
// Excepción comprobada base para todos los errores de validación

// TODO: Crea una clase de excepción comprobada llamada ValidationException
// - Debe extender Exception
// - Incluye un constructor que acepte un mensaje String
// - Pasa el mensaje al constructor padre
public class ValidationException extends Exception {
    // TODO: Implementa el constructor
    public ValidationException(String message) {
        super(message);
    }
}
