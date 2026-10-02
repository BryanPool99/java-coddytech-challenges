# Patrón Command

El patrón Command es un patrón de diseño de comportamiento que encapsula una solicitud como un objeto, lo que permite parametrizar clientes con diferentes solicitudes, poner solicitudes en cola o registrarlas, y admitir operaciones que se pueden deshacer.

El patrón desacopla el objeto que invoca la operación (invocador) del que la realiza (receptor).

### Componentes clave
- Comando: interfaz que declara el método execute()
- ConcreteCommand: clases que implementan acciones específicas
- Receptor: objeto que realiza el trabajo real
- Invocador: objeto que activa los comandos

### Estructura básica
```java
// Interfaz Command
interface Command {
    void execute();
}

// Receptor
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// ConcreteCommand
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

// Invocador
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
```

### Uso
```java
Light light = new Light();
Command lightOn = new LightOnCommand(light);

RemoteControl remote = new RemoteControl();
remote.setCommand(lightOn);
remote.pressButton();  // Salida: Light is ON
```

El invocador no sabe qué acción se realizará. Simplemente llama a execute(). Esto hace que el sistema sea flexible y extensible, ideal para poner operaciones en cola, implementar la funcionalidad de deshacer/rehacer o programar tareas.
