package org.bpao.seccion3poo.patronesdediseño2.commandpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee las entradas
        int channel = scanner.nextInt();
        int temperature = scanner.nextInt();

        // TODO: Crea un Television y un Thermostat
        Devices.Television television = new Devices.Television();
        Devices.Thermostat thermostat = new Devices.Thermostat();
        // TODO: Crea un RemoteControl
        RemoteControl remoteControl = new RemoteControl();
        // TODO: Demuestra el patrón Command:
        // 1. Establece un TVOnCommand y presiona el botón
        Commands.TVOnCommand tvOnCommand = new Commands.TVOnCommand(television);
        remoteControl.setCommand(tvOnCommand);
        remoteControl.pressButton();
        // 2. Establece un TVChannelCommand con el canal de entrada y presiona el botón
        Commands.TVChannelCommand tvChannelCommand = new Commands.TVChannelCommand(television, channel);
        remoteControl.setCommand(tvChannelCommand);
        remoteControl.pressButton();
        // 3. Set a ThermostatSetCommand with the input temperature and press the button
        Commands.ThermostatSetCommand thermostatSetCommand = new Commands.ThermostatSetCommand(thermostat, temperature);
        remoteControl.setCommand(thermostatSetCommand);
        remoteControl.pressButton();
        // 4. Establece un TVOffCommand y presiona el botón
        Commands.TVOffCommand tvOffCommand = new Commands.TVOffCommand(television);
        remoteControl.setCommand(tvOffCommand);
        remoteControl.pressButton();
        scanner.close();
    }
}
