# Desafio facil de Métodos estáticos

¡Vamos a construir una clase de utilidad StringUtils que proporcione métodos útiles de manipulación de cadenas sin necesidad de crear ningún objeto, lo cual es perfecto para demostrar los métodos estáticos!

Crearás dos archivos para organizar tu código:

- StringUtils.java: Crea una clase de utilidad con métodos estáticos que realicen operaciones comunes de cadenas:
  - Un método estático countVowels(String text) que devuelva el número de vocales (a, e, i, o, u - tanto en mayúsculas como en minúsculas) en la cadena dada.
  - Un método estático reverse(String text) que devuelva la cadena invertida.
  - Un método estático isPalindrome(String text) que devuelva true si la cadena se lee igual de adelante hacia atrás que de atrás hacia adelante (insensible a mayúsculas y minúsculas), y false en caso contrario.

- Main.java: Utiliza tu clase de utilidad para procesar una cadena. Recibirás una entrada: una cadena de texto. Llama a cada método estático directamente a través del nombre de la clase e imprime tres líneas:
  - Vowels: [count]
  - Reversed: [reversed string]
  - Palindrome: true o Palindrome: false

Recibirás una entrada: una cadena de texto para analizar.

Recuerda que los métodos estáticos se llaman utilizando el nombre de la clase (como StringUtils.countVowels(text)) en lugar de crear una instancia primero. Esto hace que las clases de utilidad sean convenientes para operaciones que no necesitan mantener ningún estado entre llamadas.