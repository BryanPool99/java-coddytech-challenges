package org.bpao.seccion3poo.manejodeexcepcionespoo.customexceptions.desafio;

// TODO: Crea una excepción personalizada no comprobada que extienda RuntimeException
// Esta excepción se lanza cuando se solicita un número de asiento inválido
public class InvalidSeatException extends RuntimeException {
    // TODO: Crea un constructor que acepte un mensaje
    // y lo pasa a la clase padre usando super(message)
    public InvalidSeatException(String message){
        super(message);
    }
}
