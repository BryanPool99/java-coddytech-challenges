package org.bpao.seccion3poo.proyectogestiondebiblioteca.borrowingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer información del libro 1
        String isbn1 = scanner.nextLine();
        String title1 = scanner.nextLine();
        String author1 = scanner.nextLine();

        // Leer información del libro 2
        String isbn2 = scanner.nextLine();
        String title2 = scanner.nextLine();
        String author2 = scanner.nextLine();

        // Leer información del usuario
        String userId = scanner.nextLine();
        String userName = scanner.nextLine();

        // Leer cadena de operaciones (separada por comas, formato: borrow:userId:isbn or return:userId:isbn)
        String operationsStr = scanner.nextLine();

        // TODO: Crear objetos Book para book1 y book2
        Book book1 = new Book(isbn1, title1, author1);
        Book book2 = new Book(isbn2, title2, author2);
        // TODO: Crear un objeto User
        User user = new User(userId, userName);
        // TODO: Crear una Library, añadir ambos libros y registrar el usuario
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.registerUser(user);
        // TODO: Dividir operationsStr por "," y procesar cada operación
        //       Para cada operación, dividir por ":" para obtener action, userId, isbn
        //       Llamar a library.borrowBook() o library.returnBook() según corresponda
        String[] operations = operationsStr.split(",");
        for (String operation:operations){
            String[] parts = operation.split(":");
            String action = parts[0];
            String opUserId = parts[1];
            String opIsbn = parts[2];

            if (action.equals("borrow")) {
                library.borrowBook(opUserId, opIsbn);
            } else if (action.equals("return")) {
                library.returnBook(opUserId, opIsbn);
            }

        }
        // TODO: Imprimir resumen para cada libro en formato "[isbn]: [Available/Borrowed]"
        System.out.println(isbn1 + ": " + (book1.isAvailable() ? "Available" : "Borrowed"));
        System.out.println(isbn2 + ": " + (book2.isAvailable() ? "Available" : "Borrowed"));
    }
}
