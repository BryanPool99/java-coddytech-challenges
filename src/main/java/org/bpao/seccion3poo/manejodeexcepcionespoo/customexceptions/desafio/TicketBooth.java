package org.bpao.seccion3poo.manejodeexcepcionespoo.customexceptions.desafio;

// TODO: Crea una clase que gestione las ventas de tickets
public class TicketBooth {
    // TODO: Añade campos para rastrear los asientos disponibles y el total de asientos
    private int availableSeats;
    private int totalSeats;

    // TODO: Crea un constructor que reciba el número total de asientos
    public TicketBooth(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    // TODO: Crea un método bookTicket(int seatNumber) que:
    // - Throws TicketSoldOutException with "No tickets remaining" if no seats available
    // - Lanza InvalidSeatException con "Seat [seatNumber] does not exist" si el asiento no es válido
    // - Otherwise decreases available seats and prints "Booked seat [seatNumber] successfully"
    // Note: Este método debe declarar que lanza TicketSoldOutException
    public void bookTicket(int seatNumber) throws TicketSoldOutException, InvalidSeatException {
        if (this.getAvailableSeats() <= 0) {
            throw new TicketSoldOutException("No tickets remaining");
        } else if (seatNumber < 1 || seatNumber > this.getAvailableSeats()) {
            throw new InvalidSeatException("Seat " + seatNumber + " does not exist");
        } else {
            this.availableSeats--;
            System.out.println("Booked seat " + seatNumber + " successfully");
        }
    }

    // TODO: Crea un método getAvailableSeats() que devuelva la cantidad de asientos disponibles
    public int getAvailableSeats() {
        return availableSeats;
    }
}
