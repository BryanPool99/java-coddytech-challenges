# Desafio - Fundamentos de sobrecarga de métodos

Construyamos un formateador de mensajes que demuestre la sobrecarga de métodos proporcionando varias formas de dar formato a los mensajes. Crearás una clase de utilidad con varios métodos format sobrecargados que gestionen diferentes escenarios de entrada.

Organizarás tu código en dos archivos:

- MessageFormatter.java: Crea una clase que proporcione un formato flexible de mensajes mediante métodos sobrecargados. Tu formateador debe tener:
  - Un método format(String message) que devuelva el mensaje entre corchetes: [message]
  - Un método format(String message, int repeatCount) que devuelva el mensaje repetido el número de veces especificado, separado por espacios
  - Un método format(String message, String prefix) que devuelva el mensaje con el prefijo adjunto: prefix: message
  - Un método format(String message, String prefix, String suffix) que devuelva: prefix: message (suffix)
  El compilador elegirá el método correcto según los argumentos que pases: ¡eso es polimorfismo en tiempo de compilación en acción!
- Main.java: Demuestra cómo funcionan juntos los cuatro métodos sobrecargados. Recibirás cuatro entradas: un mensaje (String), un número de repeticiones (int), un prefijo (String) y un sufijo (String). Crea un MessageFormatter y llama a cada versión del método format, imprimiendo cada resultado en su propia línea:
  - Primero, da formato usando solo el mensaje
  - Segundo, da formato usando el mensaje y el número de repeticiones
  - Tercero, da formato usando el mensaje y el prefijo
  - Cuarto, da formato usando el mensaje, el prefijo y el sufijo

Recibirás cuatro entradas: el texto del mensaje, cuántas veces repetirlo, una cadena de prefijo y una cadena de sufijo.

Por ejemplo, si el mensaje es "Hello", el número de repeticiones es 3, el prefijo es "INFO" y el sufijo es "done", tu salida debería mostrar cuatro versiones formateadas diferentes del mismo mensaje, cada una usando un método sobrecargado distinto.
