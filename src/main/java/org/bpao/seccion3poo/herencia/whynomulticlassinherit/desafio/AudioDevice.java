package org.bpao.seccion3poo.herencia.whynomulticlassinherit.desafio;

// Clase base para todos los dispositivos de reproducción de audio
public class AudioDevice {
    // TODO: Añadir un campo privado para deviceName (String)
    private String deviceName;

    // TODO: Crear un constructor que acepte el nombre del dispositivo
    public AudioDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    // TODO: Crear el método getDeviceName() que devuelva el nombre

    public String getDeviceName() {
        return this.deviceName;
    }

    // TODO: Crear el método playSound() que imprima: [deviceName]: Playing audio
    public void playSound() {
        System.out.println(this.getDeviceName() + ": Playing audio");
    }
}
