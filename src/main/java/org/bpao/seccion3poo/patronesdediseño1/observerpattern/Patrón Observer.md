# Patrón Observer
El patrón Observer es un patrón de diseño de comportamiento que establece una relación de uno a muchos entre objetos. Cuando un objeto (el sujeto) cambia de estado, todas sus dependencias (los observadores) reciben una notificación y se actualizan automáticamente.

El patrón consta de dos componentes principales:
- Sujeto: mantiene una lista de observadores y les notifica los cambios
- Observadores: definen un método de actualización para responder a las notificaciones

Estructura básica:
```java
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

class ConcreteObserver implements Observer {
    public void update(String message) {
        // Reaccionar a la notificación
    }
}
```

Ejemplo de uso:
```java
Subject subject = new Subject();
subject.subscribe(new ConcreteObserver());
subject.notifyObservers("State changed!");
// Todos los observadores suscritos reciben la actualización
```
El patrón Observer promueve un acoplamiento débil: el sujeto no necesita conocer las clases concretas de sus observadores, solo que implementan la interfaz Observer. Esto facilita añadir nuevos tipos de observadores sin modificar el sujeto.
