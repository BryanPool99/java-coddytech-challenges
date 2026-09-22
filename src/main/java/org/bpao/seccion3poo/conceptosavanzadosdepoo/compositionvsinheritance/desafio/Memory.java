package org.bpao.seccion3poo.conceptosavanzadosdepoo.compositionvsinheritance.desafio;

public class Memory {
    // TODO: Declara campos privados: type (String) y sizeGB (int)
    private String type;
    private int sizeGB;

    // TODO: Crea un constructor que inicialice ambos campos
    public Memory(String type, int sizeGB) {
        this.type = type;
        this.sizeGB = sizeGB;
    }
    // TODO: Crea métodos getter para type y sizeGB

    public String getType() {
        return type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    // TODO: Crea un método load() que devuelva:
    // "Loading [sizeGB]GB [type] memory"
    public String load() {
        return String.format("Loading %dGB %s memory", this.getSizeGB(), this.getType());
    }
}
