package org.bpao.seccion3poo.interfacesyclasesabstractas.multiinterfaceimplemen.desafio;

// TODO: Crea la clase SmartTV que implementa tanto Powerable como VolumeControl
public class SmartTV implements Powerable, VolumeControl {
    // TODO: Declara los campos:
    // - brand (String)
    // - isOn (boolean, inicialmente false)
    // - volume (int, inicialmente 0)
    private String brand;
    private boolean isOn;
    private int volume;

    // TODO: Crea un constructor que tome el nombre de la marca
    public SmartTV(String brand) {
        this.brand = brand;
        this.isOn = false;
        this.volume = 0;
    }

    // TODO: Implementa powerOn() - establece isOn en true e imprime: [brand] TV is now ON
    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println(this.brand + " TV is now ON");
    }

    // TODO: Implementa powerOff() - establece isOn en false e imprime: [brand] TV is now OFF
    @Override
    public void powerOff() {
        this.isOn = false;
        System.out.println(this.brand + " TV is now OFF");
    }

    // TODO: Implement setVolume(int level) - update volume and print: [brand] TV volume set to [level]
    @Override
    public void setVolume(int level) {
        this.volume = level;
        System.out.println(this.brand + " TV volume set to " + this.volume);
    }

    // TODO: Implement getVolume() - return the current volume
    @Override
    public int getVolume() {
        return this.volume;
    }
}
