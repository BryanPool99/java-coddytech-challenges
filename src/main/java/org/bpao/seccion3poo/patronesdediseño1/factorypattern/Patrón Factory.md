# Patrón Factory
El patrón Factory es un patrón de diseño creacional que delega la creación de objetos en un método o una clase independientes, centralizando la lógica de creación y desacoplando el código cliente de las implementaciones concretas.

En lugar de instanciar objetos directamente con new, utilizas un método de fábrica:

```java
// Sin Factory - el cliente depende de clases concretas
Notification notification;
if (type.equals("email")) {
notification = new EmailNotification();
} else if (type.equals("sms")) {
notification = new SMSNotification();
}
```

Con el patrón Factory, define una interfaz común e implementaciones concretas:

```java
public interface Notification {
    void send(String message);
}

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("SMS: " + message);
    }
}
```

Crea una clase de fábrica con un método de creación estático:

```java
public class NotificationFactory {
    public static Notification create(String type) {
        if (type.equals("email")) {
            return new EmailNotification();
        } else if (type.equals("sms")) {
            return new SMSNotification();
        }
        return null;
    }
}
```

El código cliente utiliza la fábrica en lugar de la instanciación directa:

```java
Notification notification = NotificationFactory.create("email");
notification.send("Hello!");  // Salida: Email: Hello!
```

Beneficios: añadir nuevos tipos solo requiere actualizar la fábrica; el código cliente permanece sin cambios. Esto sigue el principio de programar contra una interfaz, lo que hace que los sistemas sean más flexibles y fáciles de ampliar.
