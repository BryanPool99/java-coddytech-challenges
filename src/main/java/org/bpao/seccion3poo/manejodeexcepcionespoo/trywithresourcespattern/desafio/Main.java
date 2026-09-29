package org.bpao.seccion3poo.manejodeexcepcionespoo.trywithresourcespattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String connectionName = scanner.nextLine();
        String username = scanner.nextLine();
        String action = scanner.nextLine();

        // === Single Resource ===
        // TODO: Imprime el encabezado
        // TODO: Usa try-with-resources para crear un Connection
        // TODO: Inside the try block, call query("SELECT * FROM users")
        System.out.println("=== Single Resource ===");
        try (Connection connection = new Connection(connectionName)) {
            connection.query("SELECT * FROM users");
        }
        // === Multiple Resources ===
        // TODO: Imprime una línea en blanco y el encabezado
        // TODO: Usa try-with-resources con Connection y Session
        // TODO: Dentro del bloque try:
        //       - Call query("INSERT INTO logs") on the connection
        //       - Llama a performAction con la action de entrada en el session
        System.out.println();
        System.out.println("=== Multiple Resources ===");
        try (Connection connection = new Connection(connectionName);
             Session session = new Session(username)) {
            connection.query("INSERT INTO logs");
            session.performAction(action);
        }
    }
}
