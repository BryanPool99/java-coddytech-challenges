package org.bpao.seccion3poo.herencia.whynomulticlassinherit.desafio;

// MusicPlayer extends AudioDevice - herencia simple
public class MusicPlayer extends AudioDevice {
    // TODO: Añadir campo privado para currentSong (String)
    private String currentSong;

    // TODO: Crear un constructor que tome el nombre del dispositivo y llame a super(deviceName)
    public MusicPlayer(String deviceName) {
        super(deviceName);
    }

    public String getCurrentSong() {
        return this.currentSong;
    }

    // TODO: Crear el método setSong(String song) que establezca la canción actual
    public void setSong(String song) {
        this.currentSong = song;
    }

    // TODO: Override playSound() to print: [deviceName]: Now playing - [currentSong]
    @Override
    public void playSound() {
        System.out.println(this.getDeviceName() + ": Now playing - " + this.getCurrentSong());
    }
}
