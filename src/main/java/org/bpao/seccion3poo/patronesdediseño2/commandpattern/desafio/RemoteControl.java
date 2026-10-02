package org.bpao.seccion3poo.patronesdediseño2.commandpattern.desafio;

// TODO: Crea la clase RemoteControl (el invocador) con:
// - método setCommand(Command cmd) para almacenar un comando
// - método pressButton() para ejecutar el comando almacenado
public class RemoteControl {
    // TODO: Implementa RemoteControl
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
