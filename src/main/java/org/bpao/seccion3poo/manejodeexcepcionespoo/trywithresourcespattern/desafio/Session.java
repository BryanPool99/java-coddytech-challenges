package org.bpao.seccion3poo.manejodeexcepcionespoo.trywithresourcespattern.desafio;

// TODO: Crea una clase Session que implemente AutoCloseable
//
// Requerido:
// - Campo privado para username (String)
// - Constructor that takes the username and prints "Session started for [username]"
// - método performAction(String action) que imprime "[username] performed: [action]"
// - close() method that prints "Session ended for [username]"
public class Session implements AutoCloseable {
    // TODO: Añade un campo privado para username
    private String username;

    // TODO: Crea el constructor
    public Session(String username) {
        this.username = username;
        System.out.println("Session started for " + getUsername());
    }

    public String getUsername() {
        return username;
    }

    // TODO: Implementa el método performAction
    public void performAction(String action) {
        System.out.println(getUsername() + " performed: " + action);
    }

    // TODO: Implementa el método close
    @Override
    public void close() {
        // TODO: Imprime el mensaje de cierre
        System.out.println("Session ended for " + getUsername());
    }
}
