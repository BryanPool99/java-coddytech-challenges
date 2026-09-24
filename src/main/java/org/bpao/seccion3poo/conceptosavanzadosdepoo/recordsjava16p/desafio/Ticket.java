package org.bpao.seccion3poo.conceptosavanzadosdepoo.recordsjava16p.desafio;
// TODO: Crea un record llamado Ticket con tres componentes:
// - movie (Movie)
// - seatNumber (String)
// - price (double)

// TODO: Añade un constructor compacto que valide el precio
// Si price <= 0, lanza IllegalArgumentException con el mensaje "Price must be positive"

// TODO: Añade un método personalizado printTicket() que devuelva una cadena de varias líneas:
// ========== TICKET ==========
// Movie: [movie title]
// Genre: [movie genre]
// Duration: [formatted duration from movie]
// Seat: [seatNumber]
// Precio: $[price]
// ============================
public record Ticket(Movie movie, String seatNumber, double price) {
    // TODO: Añade un constructor compacto con validación del precio
    public Ticket {
        if (price < 0) throw new IllegalArgumentException("Price must be positive");
    }

    // TODO: Implementa el método printTicket()
    public String printTicket() {
        StringBuilder sb = new StringBuilder();
        sb.append("========== TICKET ==========");
        sb.append("\n");
        sb.append("Movie: " + movie.title());
        sb.append("\n");
        sb.append("Genre: " + movie.genre());
        sb.append("\n");
        sb.append("Duration: " + movie.getFormattedDuration());
        sb.append("\n");
        sb.append("Seat: " + seatNumber);
        sb.append("\n");
        sb.append("Price: $" + price);
        sb.append("\n");
        sb.append("============================");
        return sb.toString();
    }
}
