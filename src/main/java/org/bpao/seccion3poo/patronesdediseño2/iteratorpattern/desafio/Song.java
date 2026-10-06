package org.bpao.seccion3poo.patronesdediseño2.iteratorpattern.desafio;

// Clase Song simple que envuelve un título de canción
public class Song {
    // TODO: Añade un campo privado para almacenar el título
    private String title;

    // TODO: Crea un constructor que tome el título (String)
    public Song(String title) {
        this.title = title;
    }
    // TODO: Implementa el método getTitle()
    public String getTitle() {
        return title;
    }

    // TODO: Implementa el método toString() que devuelve "Playing: [title]"
    @Override
    public String toString() {
        return "Playing: " + getTitle();
    }
}
