package org.bpao.seccion3poo.patronesdediseño2.decoratorpattern.desafio;

// BasicNotifier - la clase del componente concreto
// Esta es la forma más simple de notificación (alerta in-app)
public class BasicNotifier implements Notifier {
    // TODO: Implementa el método send
    // Debería imprimir: In-App: [message]
    @Override
    public void send(String message) {
        System.out.println("In-App: " + message);
    }
}
