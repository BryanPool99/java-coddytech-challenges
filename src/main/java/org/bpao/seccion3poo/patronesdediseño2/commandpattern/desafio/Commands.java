package org.bpao.seccion3poo.patronesdediseño2.commandpattern.desafio;

// Clases Command concretas que encapsulan operaciones de dispositivos
public class Commands {
    // TODO: Crea la clase TVOnCommand que:
    // - Toma un Television en su constructor
    // - Implementa la interfaz Command
    // - Llama a powerOn() cuando se ejecuta
    static class TVOnCommand implements Command {
        private Devices.Television television;

        public TVOnCommand(Devices.Television television) {
            this.television = television;
        }

        // TODO: Implementa TVOnCommand
        @Override
        public void execute() {
            this.television.powerOn();
        }
    }

    // TODO: Crea la clase TVOffCommand que:
    // - Toma un Television en su constructor
    // - Implementa la interfaz Command
    // - Llama a powerOff() cuando se ejecuta
    static class TVOffCommand implements Command {
        private Devices.Television television;

        public TVOffCommand(Devices.Television television) {
            this.television = television;
        }

        // TODO: Implementa TVOffCommand
        @Override
        public void execute() {
            this.television.powerOff();
        }
    }

    // TODO: Crea la clase TVChannelCommand que:
    // - Toma un Television y un int channel en su constructor
    // - Implementa la interfaz Command
    // - Llama a setChannel() con el channel cuando se ejecuta
    static class TVChannelCommand implements Command {
        private Devices.Television television;
        private int channel;

        public TVChannelCommand(Devices.Television television, int channel) {
            this.television = television;
            this.channel = channel;
        }

        // TODO: Implementar TVChannelCommand
        @Override
        public void execute() {
            this.television.setChannel(this.channel);
        }
    }

    // TODO: Create ThermostatSetCommand class that:
    // - Toma un Thermostat y un int temperature en su constructor
    // - Implementa la interfaz Command
    // - Llama a setTemperature() con la temperature cuando se ejecuta
    static class ThermostatSetCommand implements Command {
        private Devices.Thermostat thermostat;
        private int temperature;

        public ThermostatSetCommand(Devices.Thermostat thermostat, int temperature) {
            this.thermostat = thermostat;
            this.temperature = temperature;
        }

        // TODO: Implement ThermostatSetCommand
        @Override
        public void execute() {
            this.thermostat.setTemperature(this.temperature);
        }
    }
}
