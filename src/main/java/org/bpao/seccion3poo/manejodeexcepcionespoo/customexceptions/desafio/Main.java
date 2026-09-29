package org.bpao.seccion3poo.manejodeexcepcionespoo.customexceptions.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeats = scanner.nextInt();
        int seatNumber = scanner.nextInt();

        // TODO: Crea un TicketBooth con el total de asientos dado
        TicketBooth ticketBooth = new TicketBooth(totalSeats);
        // TODO: Usa un bloque try-catch para intentar reservar el asiento
        // - Captura TicketSoldOutException primero e imprime "Booking failed: [exception message]"
        // - Captura InvalidSeatException e imprime "Booking failed: [exception message]"
        try {
            ticketBooth.bookTicket(seatNumber);
        } catch (TicketSoldOutException ticketSoldOutException) {
            System.out.println("Booking failed: " + ticketSoldOutException.getMessage());
        } catch (InvalidSeatException invalidSeatException) {
            System.out.println("Booking failed: " + invalidSeatException.getMessage());
        }
        // TODO: After the try-catch, print "Remaining seats: [count]"
        System.out.println("Remaining seats: " + ticketBooth.getAvailableSeats());
    }
}
