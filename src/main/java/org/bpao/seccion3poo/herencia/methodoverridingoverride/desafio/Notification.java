package org.bpao.seccion3poo.herencia.methodoverridingoverride.desafio;

// Parent class for generic notifications
public class Notification {
    // TODO: Añade un campo privado para message
    private String message;

    // TODO: Crea un constructor que acepte el message
    public Notification(String message) {
        this.message = message;
    }

    // TODO: Crea el método getMessage() que devuelve el message
    public String getMessage() {
        return this.message;
    }

    // TODO: Create send() method that prints: Sending notification: [message]
    public void send() {
        System.out.println("Sending notification: " + this.getMessage());
    }
}
