package org.bpao.seccion3poo.proyectogestiondebiblioteca.testingandintegration;

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
                try {
                    String result = library.borrowBook(userId, isbn);
                    System.out.println(result);
                } catch (LibraryException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            // TODO: Añade el manejo del comando RETURN
            else if (operation.equals("RETURN")) {
                String userId = parts[1];
                String isbn = parts[2];
                library.returnBook(userId, isbn);
            }
            // TODO: Añade el manejo del comando SEARCH_TITLE
            else if (operation.equals("SEARCH_TITLE")) {
                String keyword = parts[1];
                System.out.println(String.format("Search '%s':", keyword));
                if (library.searchByTitle(keyword).isEmpty()) {
                    System.out.println("No results");
                } else {
                    for (Book book : library.searchByTitle(keyword)) {
                        System.out.println(book.getDetails());
                    }
                }
            }
            // TODO: Añade el manejo del comando SEARCH_AUTHOR
            else if (operation.equals("SEARCH_AUTHOR")) {
                String keyword = parts[1];
                System.out.println(String.format("Search '%s':", keyword));
                if (library.searchByAuthor(keyword).isEmpty()) {
                    System.out.println("No results");
                } else {
                    for (Book book : library.searchByAuthor(keyword)) {
                        System.out.println(book.getDetails());
                    }
                }
            }
        }

        // TODO: Imprime el estado final
        // --- Final Status ---
        // Libros: [count]
        // Usuarios: [count]
        // Para cada usuario: [name]: [borrowedCount] libro(s)
        System.out.println("--- Final Status ---");
        System.out.println("Books: " + library.getAllBooks().size());
        System.out.println("Users: " + library.getAllUsers().size());
        for (User user : library.getAllUsers()) {
            System.out.println(user.getName() + ": " + user.getBorrowedCount() + " book(s)");
        }
    }
}
