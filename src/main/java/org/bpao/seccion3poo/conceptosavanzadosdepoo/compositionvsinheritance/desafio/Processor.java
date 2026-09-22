package org.bpao.seccion3poo.conceptosavanzadosdepoo.compositionvsinheritance.desafio;

public class Processor {
    // TODO: Declara campos privados: brand (String) y speedGHz (double)
    private String brand;
    private double speedGHz;

    // TODO: Crea un constructor que inicialice ambos campos
    public Processor(String brand, double speedGHz) {
        this.brand = brand;
        this.speedGHz = speedGHz;
    }
    // TODO: Crea métodos getter para brand y speedGHz

    public String getBrand() {
        return brand;
    }

    public double getSpeedGHz() {
        return speedGHz;
    }

    // TODO: Crea un método process() que devuelva:
    // "[brand] processing at [speedGHz] GHz"
    public String process() {
        return String.format("%s processing at %s GHz", this.getBrand(), this.getSpeedGHz());
    }
}
