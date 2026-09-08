# Desafio facil de Ocultamiento de información

Vamos a construir una clase de gestión de Password que demuestre la ocultación de información protegiendo datos sensibles y aplicando reglas de seguridad a través del acceso controlado.

Crearás dos archivos para organizar tu código:

Vamos a construir una clase de gestión de Password que demuestre la ocultación de información protegiendo datos sensibles y aplicando reglas de seguridad a través del acceso controlado.

Crearás dos archivos para organizar tu código:

- Password.java: Crea una clase Password que oculte sus datos internos y controle cómo se pueden establecer y acceder a las contraseñas:
  - Un campo privado password (String) que almacena la contraseña real
  - Un campo privado minLength (int) que define la longitud mínima aceptable de la contraseña
  - Un constructor que recibe el requisito de longitud mínima
  - Un setter setPassword(String password) que solo acepta contraseñas que cumplan con el requisito de longitud mínima. Si es válida, almacénala y devuelve true; si es demasiado corta, no cambies la contraseña y devuelve false
  - Un getter getMaskedPassword() que devuelve la contraseña con todos los caracteres reemplazados por asteriscos (*) - ¡nunca expongas la contraseña real!
  - Un método checkPassword(String attempt) que devuelve true si el intento coincide con la contraseña almacenada, false en caso contrario
  - Un getter getLength() que devuelve la longitud de la contraseña actual (o 0 si no se ha establecido ninguna contraseña)
- Main.java: Crea un objeto Password con una longitud mínima de 6, luego lee dos entradas: una contraseña para establecer y un intento para verificar. Imprime tres líneas:
  - Set: true o Set: false (resultado de establecer la contraseña)
  - Masked: ****** (la versión enmascarada de la contraseña)
  - Match: true o Match: false (resultado de verificar el intento)


Recibirás dos entradas: la contraseña a establecer y el intento de contraseña a verificar.

Observa cómo la contraseña real nunca es accesible directamente desde fuera de la clase;
esto es la ocultación de información en acción.
La clase controla exactamente qué información se revela y cómo se puede modificar la contraseña.