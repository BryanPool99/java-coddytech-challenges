# Desafio fácil de Sobrescritura de métodos (@Override)

Construyamos un sistema de notificaciones que demuestre cómo las subclases pueden sobrescribir los métodos de la clase padre para proporcionar su propio comportamiento especializado. Verás cómo la anotación @Override ayuda a detectar errores y cómo cada subclase puede personalizar los métodos heredados.

Crearás tres archivos para organizar tu código:

- Notification.java: Crea la clase padre que representa una notificación genérica. Debe tener:
  - Un campo privado para el message (String)
  - Un constructor que acepte el mensaje
  - Un método getMessage() que devuelva el mensaje
  - Un método send() que imprima: Sending notification: [message]
- EmailNotification.java: Crea una subclase que extienda Notification y personalice la forma en que se envían las notificaciones por correo electrónico:
  - Un campo privado para la dirección de correo electrónico del recipient (String)
  - Un constructor que reciba tanto el mensaje como el destinatario, usando super(message) para la parte correspondiente a la clase padre
  - Sobrescribe el método send() usando la anotación @Override para imprimir: Emailing [recipient]: [message]
- Main.java: Demuestra cómo el mismo nombre de método produce un comportamiento diferente dependiendo del tipo de objeto. Recibirás dos entradas: un mensaje y una dirección de correo electrónico. Crea una Notification normal y una EmailNotification con el mismo mensaje; después, llama a send() en cada una para ver las diferentes salidas.

Recibirás dos entradas: el mensaje (String) y la dirección de correo electrónico del destinatario (String).

Tu salida debe mostrar dos líneas: primero la del método send() de la clase padre y después la de la versión sobrescrita en EmailNotification. Esto demuestra cómo la sobrescritura de métodos permite a las subclases reemplazar el comportamiento heredado con su propia implementación.