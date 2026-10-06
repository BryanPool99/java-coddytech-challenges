# Patrón State
El Patrón de estado es un patrón de diseño de comportamiento que permite que un objeto cambie su comportamiento cuando cambia su estado interno, delegando el comportamiento a diferentes objetos de estado en lugar de usar instrucciones condicionales complejas.

El patrón consta de un Contexto que mantiene una referencia al estado actual y de clases Estado que definen el comportamiento de cada estado:

```java
interface State {
    void handle(Context context);
}

class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
```

Cada estado concreto implementa el comportamiento y puede activar transiciones a otros estados:

```java
class IdleState implements State {
    public void handle(Context context) {
        System.out.println("Idle: Insert coin to start");
        context.setState(new ActiveState());
    }
}

class ActiveState implements State {
    public void handle(Context context) {
        System.out.println("Active: Processing...");
        context.setState(new IdleState());
    }
}
```

El contexto delega las solicitudes a su estado actual y el comportamiento cambia automáticamente a medida que cambia el estado:

```java
Context context = new Context();
context.setState(new IdleState());

context.request();  // Idle: Inserta una moneda para empezar
context.request();  // Active: Procesando...
```

El patrón de estado es ideal cuando el comportamiento de un objeto depende en gran medida de su estado y debe cambiar durante la ejecución. Elimina grandes bloques condicionales y facilita la adición de nuevos estados.
