# Desafio Facil de Método Getter and Setter

Vamos a construir un convertidor de Temperature que demuestre el poder de los getters y setters con lógica de validación.

Crearás dos archivos para organizar tu código:
- Temperature.java: Define una clase Temperature que almacene un valor de temperatura en Celsius. La clase debe tener:
  - Un campo privado celsius (double)
  - Un campo privado valid (boolean) que rastree si la temperatura es físicamente posible
  - Un getter getCelsius() que devuelva el valor de celsius
  - Un setter setCelsius() que solo acepte valores iguales o superiores al cero absoluto (-273.15). Si el valor es válido, establece valid como true; de lo contrario, no cambies celsius y establece valid como false
  - Un getter isValid() para el campo booleano (recuerda: los getters booleanos usan el prefijo is)
  - Un getter getFahrenheit() que convierta y devuelva la temperatura en Fahrenheit usando la fórmula: (celsius * 9/5) + 32
- Main.java: Crea un objeto Temperature, lee un valor celsius como entrada, usa el setter para establecerlo, luego imprime si la temperatura es válida y su equivalente en Fahrenheit. Formatea tu salida en dos líneas:
Valid: true o Valid: false
Fahrenheit: X.X (mostrando un decimal)