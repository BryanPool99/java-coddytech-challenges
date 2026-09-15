package org.bpao.seccion3poo.polimorfismo.upcastinganddowncasting.desafio;

// Clase Podcast que extiende Media
public class Podcast extends Media {
    // TODO: Declara el campo episode (int)
    private int episode;

    // TODO: Crea un constructor que tome title y episode
    // Usa super() para inicializar la clase padre
    public Podcast(String title, int episode) {
        super(title);
        this.episode = episode;
    }

    public int getEpisode() {
        return this.episode;
    }

    // TODO: Override play() to print: Playing podcast: [title] - Episode [episode]

    @Override
    public void play() {
        System.out.println("Playing podcast: " + this.getTitle() + " - Episode " + this.getEpisode());
    }

    // TODO: Añade el método showEpisode() que imprime: Episode: [episode]
    public void showEpisode() {
        System.out.println("Episode: " + this.getEpisode());
    }
}
