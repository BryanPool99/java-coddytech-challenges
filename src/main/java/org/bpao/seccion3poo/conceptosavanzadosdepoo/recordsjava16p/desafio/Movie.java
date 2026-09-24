package org.bpao.seccion3poo.conceptosavanzadosdepoo.recordsjava16p.desafio;
// TODO: Crea un record llamado Movie con tres componentes:
// - title (String)
// - genre (String)
// - durationMinutes (int)

// TODO: Añade un método personalizado getFormattedDuration() que devuelva
// la duración en formato: "[hours]h [minutes]m"
// Ejemplo: 142 minutos se convierten en "2h 22m"
// Pista: Usa la división entera (/) para las horas y el módulo (%) para los minutos restantes
public record Movie(String title, String genre, int durationMinutes) {
    // TODO: Implementa el método getFormattedDuration()
    public String getFormattedDuration() {
        int hours = durationMinutes / 60;
        int minutes = durationMinutes - (hours * 60);
        return String.format("%dh %dm", hours, minutes);
    }
}
