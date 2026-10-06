package org.bpao.seccion3poo.patronesdediseño2.iteratorpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Crea una Playlist con capacidad para 10 canciones
        Playlist playlist = new Playlist(10);
        // TODO: Analiza la entrada (separada por comas) y añade cada título de canción a la playlist
        String[] songs = input.split(",");
        for (String song : songs) {
            playlist.addSong(song);
        }
        // TODO: Obtén un iterador de la playlist usando createIterator()
        Iterator<String> iterator = playlist.createIterator();
        // TODO: Usa el iterador para recorrer todas las canciones
        // Para cada canción, envuélvela en un objeto Song e imprímela
        while (iterator.hasNext()) {
            Song song = new Song(iterator.next());
            System.out.println(song);
        }
        // TODO: Print "Playlist complete!" after iterating through all songs
        System.out.println("Playlist complete!");
    }
}
