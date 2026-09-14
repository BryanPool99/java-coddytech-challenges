package org.bpao.seccion3poo.herencia.whynomulticlassinherit.desafio;

// SmartSpeaker extiende MusicPlayer - cadena de herencia multinivel
// AudioDevice -> MusicPlayer -> SmartSpeaker
public class SmartSpeaker extends MusicPlayer {
    // TODO: Añadir un campo privado para assistantName (String)
    private String assistantName;

    // TODO: Crear un constructor que reciba el nombre del dispositivo y el nombre del asistente
    //       Usar super(deviceName) para llamar al constructor padre
    public SmartSpeaker(String deviceName, String assistantName) {
        super(deviceName);
        this.assistantName = assistantName;
    }

    public String getAssistantName() {
        return this.assistantName;
    }

    // TODO: Crear el método voiceCommand(String command)
    //       Imprimir: [assistantName]: Processing "[command]"
    public void voiceCommand(String command) {
        System.out.println(this.getAssistantName() + ": Processing \"" + command + "\"");
    }

    // TODO: Crear el método getFullInfo()
    //       Imprimir: [deviceName] con el asistente [assistantName]
    public void getFullInfo() {
        System.out.println(this.getDeviceName() + " with " + this.getAssistantName() + " assistant");
    }
}
