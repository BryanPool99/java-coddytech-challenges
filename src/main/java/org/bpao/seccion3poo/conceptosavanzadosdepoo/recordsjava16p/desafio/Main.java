package org.bpao.seccion3poo.conceptosavanzadosdepoo.recordsjava16p.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String title = scanner.nextLine();
        String genre = scanner.nextLine();
        int durationMinutes = Integer.parseInt(scanner.nextLine());
        String seatNumber = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        // TODO: Crea un record Movie con title, genre y durationMinutes
        Movie movie = new Movie(title, genre, durationMinutes);
        // TODO: Crea un record Ticket con movie, seatNumber y price
        Ticket ticket = new Ticket(movie, seatNumber, price);
        // TODO: Imprime el ticket usando el método printTicket()
        System.out.println(ticket.printTicket());
    }
}
