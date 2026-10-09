package org.bpao.seccion3poo.proyectogestiondebiblioteca.exceptionhandlingintegration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee los comandos separados por comas
        String input = scanner.nextLine();
        String[] commands = input.split(",");

        // Crea Library y AdminService
        Library library = new Library();
        AdminService adminService = new AdminService(library);

        // Procesa cada comando
        for (String command : commands) {
            String[] parts = command.split(":");
            String operation = parts[0];

            if (operation.equals("ADD_BOOK")) {
                String isbn = parts[1];
                String title = parts[2];
                String author = parts[3];
                if (adminService.addBook(isbn, title, author)) {
                    System.out.println("Added: " + title);
                }
            } else if (operation.equals("REMOVE_BOOK")) {
                String isbn = parts[1];
                if (adminService.removeBook(isbn)) {
                    System.out.println("Removed: " + isbn);
                } else {
                    System.out.println("Cannot remove: " + isbn);
                }
            } else if (operation.equals("REGISTER_USER")) {
                String id = parts[1];
                String name = parts[2];
                if (adminService.registerUser(id, name)) {
                    System.out.println("Registered: " + name);
                }
            } else if (operation.equals("BORROW")) {
                String userId = parts[1];
                String isbn = parts[2];
                // TODO: Usa un bloque try-catch para llamar a library.borrowBook(userId, isbn)
                // En caso de éxito, imprime el mensaje de confirmación devuelto
                // En caso de LibraryException, imprime "Error: " + e.getMessage()
                try {
                    System.out.println(library.borrowBook(userId, isbn));
                } catch (LibraryException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        // TODO: Print "Operations completed"
        System.out.println("Operations completed");
    }
}
