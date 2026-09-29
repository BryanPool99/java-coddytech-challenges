# Desafio Resumen - Usuario validado
¡Construyamos un sistema completo de registro de usuarios que valide los datos de entrada y use excepciones personalizadas para comunicar exactamente qué salió mal! Combinarás todo lo aprendido en este capítulo: excepciones comprobadas y no comprobadas personalizadas, la jerarquía de excepciones y try-with-resources con un validador autocerrable.

Organizarás tu código en cinco archivos:
- ValidationException.java: Crea una excepción comprobada que sirva como base para todos los errores de validación. Esta excepción debe extender Exception e incluir un constructor que acepte un mensaje.
- InvalidUsernameException.java: Crea una excepción comprobada para los fallos de validación del nombre de usuario. Esta debe extender tu clase ValidationException, creando una pequeña jerarquía de excepciones. Incluye un constructor que acepte un mensaje y se lo pase a la clase padre.
- InvalidAgeException.java: Crea una excepción no comprobada para los errores relacionados con la edad (como las edades negativas, que representan errores de programación). Esta debe extender RuntimeException e incluir un constructor que acepte un mensaje.
- UserValidator.java: Crea una clase que implemente AutoCloseable para simular una sesión de validación que debe cerrarse correctamente. Tu validador debe:
  - Imprimir Validator session started en el constructor.

  - Tener un método validateUsername(String username) que lance InvalidUsernameException si el nombre de usuario es null, está vacío o tiene menos de 3 caracteres (con el mensaje "Username must be at least 3 characters"). De lo contrario, debe imprimir Username '[username]' is valid.

  - Tener un método validateAge(int age) que lance InvalidAgeException si age es negativo (con el mensaje "Age cannot be negative: [age]"). Si age es menor que 13, debe lanzar ValidationException con el mensaje "Must be at least 13 years old". De lo contrario, debe imprimir Age [age] is valid.

  - Implementar close() para imprimir Validator session closed.
- Main.java: ¡Integra tu sistema de validación! Recibirás dos entradas: un nombre de usuario (String) y una edad (entero).
  - Usa try-with-resources para crear un UserValidator. Dentro del bloque try, valida primero el nombre de usuario y después la edad. Si ambas validaciones se completan correctamente, imprime User registration successful!

  - Captura InvalidUsernameException e imprime Username error: [message]. Captura InvalidAgeException e imprime Age error: [message]. Captura ValidationException (la clase padre) e imprime Validation error: [message].

  - ¡El validador debe cerrarse automáticamente independientemente de que la validación tenga éxito o falle!

Recibirás dos entradas en este orden: nombre de usuario (String) y edad (entero).

Este desafío reúne todo el capítulo: crearás una jerarquía de excepciones con ValidationException como clase padre, usarás correctamente excepciones comprobadas y no comprobadas, y te asegurarás de que el recurso del validador siempre se limpie mediante try-with-resources. Observa cómo capturar la clase padre ValidationException después de su clase hija InvalidUsernameException permite gestionar primero los casos específicos y, al mismo tiempo, capturar otros errores de validación.