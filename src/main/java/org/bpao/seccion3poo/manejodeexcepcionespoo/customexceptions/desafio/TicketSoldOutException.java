package org.bpao.seccion3poo.manejodeexcepcionespoo.customexceptions.desafio;

// TODO: Crea una excepción comprobada personalizada que extienda Exception
// Esta excepción se lanza cuando los tickets ya no están disponibles
public class TicketSoldOutException extends Exception {
    // TODO: Crea un constructor que acepte un mensaje
    // y lo pasa a la clase padre usando super(message)
    public TicketSoldOutException(String message) {
        super(message);
    }
}
