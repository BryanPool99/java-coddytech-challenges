package org.bpao.seccion3poo.polimorfismo.upcastinganddowncasting.desafio;

// Clase Song que extiende Media
public class Song extends Media {
    // TODO: Declara el campo artist (String)
    private String artist;

    // TODO: Crea un constructor que tome title y artist
    // Usa super() para inicializar la clase padre
    public Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    // TODO: Sobrescribe play() para imprimir: Playing song: [title] by [artist]

    @Override
    public void play() {
        System.out.println("Playing song: " + this.getTitle() + " by " + this.getArtist());
    }

    // TODO: Añade el método showArtist() que imprime: Artist: [artist]
    public void showArtist() {
        System.out.println("Artist: " + this.getArtist());
    }
}
