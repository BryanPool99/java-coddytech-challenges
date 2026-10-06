package org.bpao.seccion3poo.patronesdediseño2.iteratorpattern.desafio;

// Clase agregada que contiene canciones y proporciona un iterador
public class Playlist {
    // TODO: Añade un array de String para almacenar las canciones
    private String[] songs;
    // TODO: Añade una variable para rastrear el número de canciones añadidas
    private int count = 0;

    // TODO: Crea un constructor que tome la capacidad e inicialice el array
    public Playlist(int size) {
        songs = new String[size];
    }

    // TODO: Implementa el método addSong(String song) para añadir canciones a la playlist
    public void addSong(String song) {
        songs[count++] = song;
    }

    // TODO: Implementa el método createIterator() que devuelve un Iterator<String>
    public Iterator<String> createIterator() {
        return new PlaylistIterator();
    }

    // TODO: Crea una clase interna privada PlaylistIterator que implemente Iterator<String>
    // La clase interna debería:
    // - Mantener su propia posición de índice
    // - Implementar hasNext() para comprobar si existen más canciones
    // - Implementar next() para devolver la siguiente canción
    private class PlaylistIterator implements Iterator<String> {
        private int idx = 0;

        @Override
        public boolean hasNext() {
            return idx < count;
        }

        @Override
        public String next() {
            return songs[idx++];
        }
    }
}
