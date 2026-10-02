package org.bpao.seccion3poo.patronesdediseño2.commandpattern.desafio;

// Clases receptoras - los dispositivos reales que realizan acciones
public class Devices {
    // TODO: Crea la clase Television con:
    // - método powerOn() que imprime "TV is now ON"
    // - método powerOff() que imprime "TV is now OFF"
    // - setChannel(int channel) method that prints "TV channel set to [channel]"
    static class Television {
        // TODO: Implementa los métodos de Television
        public void powerOn() {
            System.out.println("TV is now ON");
        }

        public void powerOff() {
            System.out.println("TV is now OFF");
        }

        public void setChannel(int channel) {
            System.out.println("TV channel set to " + channel);
        }
    }

    // TODO: Crea la clase Thermostat con:
    // - setTemperature(int temp) method that prints "Thermostat set to [temp] degrees"
    // - método turnOff() que imprime "Thermostat turned OFF"
    static class Thermostat {
        // TODO: Implementa los métodos de Thermostat
        public void setTemperature(int temp) {
            System.out.println("Thermostat set to " + temp + " degrees");
        }

        public void turnOff() {
            System.out.println("Thermostat turned OFF");
        }
    }
}
