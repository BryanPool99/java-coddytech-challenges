package org.bpao.seccion3poo.conceptosavanzadosdepoo.aggregationvscomposition.desafio;

// Clase Lecture - solo tiene sentido dentro de un curso (usada en composición)
public class Lecture {
    // TODO: Declara campos privados: topic (String) y durationMinutes (int)
    private String topic;
    private int durationMinutes;

    // TODO: Crea un constructor que inicialice ambos campos
    public Lecture(String topic, int durationMinutes) {
        this.topic = topic;
        this.durationMinutes = durationMinutes;
    }
    // TODO: Crea métodos getter para topic y durationMinutes

    public String getTopic() {
        return topic;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    // TODO: Override toString() to return: Lecture: [topic] ([durationMinutes] min)

    @Override
    public String toString() {
        return String.format("Lecture: %s (%d min)", this.getTopic(), this.getDurationMinutes());
    }
}
