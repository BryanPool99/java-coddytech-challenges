package org.bpao.seccion3poo.manejodeexcepcionespoo.checkedvsuncheckederrors.desafio;

// NegativeAgeException.java
// This is an UNCHECKED exception - extends RuntimeException
// Los llamadores NO están obligados a manejar esta excepción
public class NegativeAgeException extends RuntimeException {
    // TODO: Crea un constructor que acepte un mensaje
    // y lo pasa a la clase padre usando super()
    public NegativeAgeException(String message) {
        super(message);
    }
}
