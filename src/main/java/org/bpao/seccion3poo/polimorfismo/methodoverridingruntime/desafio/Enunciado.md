# Desafio - Sobrescritura de métodos (tiempo de ejecución)

Construyamos un sistema de notificaciones que demuestre el polimorfismo en tiempo de ejecución en acción. Crearás una jerarquía de tipos de notificación en la que la misma llamada a un método produce diferentes resultados según el tipo real del objeto en tiempo de ejecución.

Organizarás tu código en cuatro archivos:

- Notification.java: Crea la clase base que comparten todas las notificaciones. Cada notificación tiene un campo recipient (String). Incluye un constructor para inicializarlo, un método getter y un método send() que imprime: Sending notification to [recipient]
- EmailNotification.java: Crea una clase que extienda Notification. Las notificaciones por correo electrónico agregan un campo subject. Usa super para la inicialización del padre. Sobrescribe el método send() para imprimir: Emailing [recipient]: [subject]
- SMSNotification.java: Crea otra clase que extienda Notification. Las notificaciones SMS agregan un campo phoneNumber. Sobrescribe send() para imprimir: Texting [phoneNumber] for [recipient]
- Main.java: ¡Aquí es donde brilla el polimorfismo en tiempo de ejecución! Recibirás tres entradas: un nombre de destinatario, un asunto de correo electrónico y un número de teléfono. Crea un arreglo de referencias de Notification que contenga tres objetos en este orden: una Notification base, una EmailNotification y una SMSNotification (todas usando el mismo destinatario). Después, recorre el arreglo y llama a send() en cada elemento. ¡Observa cómo Java llama automáticamente a la versión sobrescrita correcta según lo que realmente sea cada objeto!

Recibirás tres entradas: el nombre del destinatario (String), el asunto del correo electrónico (String) y el número de teléfono (String).

Tu salida debe mostrar tres líneas: cada llamada a send() produce una salida diferente aunque estés llamando al mismo método sobre referencias de Notification. ¡Ese es el despacho dinámico de métodos en acción!
