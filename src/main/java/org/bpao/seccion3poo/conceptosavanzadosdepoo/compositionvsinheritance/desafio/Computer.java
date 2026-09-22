package org.bpao.seccion3poo.conceptosavanzadosdepoo.compositionvsinheritance.desafio;

public class Computer {
    // TODO: Declara campos privados para Processor y Memory (¡composición!)
    // El Computer HAS-A Processor y HAS-A Memory
    private Processor processor;
    private Memory memory;

    // TODO: Crea un constructor que acepte un Processor y una Memory
    public Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    // TODO: Crea un método boot() que devuelva un String de varias líneas:
    // "Booting computer..."
    // [resultado de processor.process()]
    // [resultado de memory.load()]
    // "System ready!"
    public String boot() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Booting computer...\n");
        stringBuilder.append(this.processor.process() + "\n");
        stringBuilder.append(this.memory.load() + "\n");
        stringBuilder.append("System ready!");
        return stringBuilder.toString();
    }

    // TODO: Crea un método getSpecs() que devuelva:
    // "Specs: [processor brand] CPU, [memory sizeGB]GB [memory type]"
    public String getSpecs() {
        return String.format("Specs: %s CPU, %dGB %s", this.processor.getBrand(), this.memory.getSizeGB(), this.memory.getType());
    }
}
