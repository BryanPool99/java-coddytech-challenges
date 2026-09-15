package org.bpao.seccion3poo.polimorfismo.upcastinganddowncasting.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String songTitle = scanner.nextLine();
        String artistName = scanner.nextLine();
        String podcastTitle = scanner.nextLine();
        int episodeNumber = scanner.nextInt();

        // TODO: Crea un Song y haz upcast a una referencia Media
        Song mySong = new Song(songTitle,artistName);
        Media myMedia = mySong;
        // TODO: Llama a play() en la referencia Media (demuestra polimorfismo)
        myMedia.play();
        // TODO: Haz downcast de la referencia Media de vuelta a Song
        Song song = (Song) myMedia;
        // TODO: Llama a showArtist() en la referencia Song
        song.showArtist();
        // TODO: Crea un Podcast y haz upcast a una referencia Media
        Podcast myPodcast = new Podcast(podcastTitle,episodeNumber);
        Media newMedia = myPodcast;
        // TODO: Llama a play() en la referencia Media
        newMedia.play();
        // TODO: Haz downcast de la referencia Media de vuelta a Podcast
        Podcast podcast = (Podcast) newMedia;
        // TODO: Llama a showEpisode() en la referencia Podcast
        podcast.showEpisode();
    }
}
