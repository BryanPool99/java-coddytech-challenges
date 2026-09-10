# Desafio fácil - Constantes (static final)

Construye una utilidad MathConstants que almacene valores matemáticos importantes como constantes, junto con un CircleCalculator que use esas constantes para realizar cálculos.

Crearás dos archivos para organizar tu código:

- MathConstants.java: Crea una clase que contenga constantes matemáticas usando campos public static final:
  - PI con el valor 3.14159
  - E (el número de Euler) con el valor 2.71828
  - GOLDEN_RATIO con el valor 1.61803
  ¡Recuerda usar UPPER_SNAKE_CASE para los nombres de las constantes!
- Main.java: Usa tus constantes para realizar cálculos relacionados con un círculo. Recibirás un radio como entrada e imprimirás tres líneas:
  - El área del círculo: Area: [value]
  - La circunferencia del círculo: Circumference: [value]
  - El diámetro escalado por la proporción áurea: Golden Diameter: [value]

Para los cálculos:
- Área = PI * radio * radio
- Circunferencia = 2 * PI * radio
- Diámetro áureo = 2 * radio * GOLDEN_RATIO

Recibirás una entrada: el radio (double).

Da formato a todos los valores de salida con 2 decimales usando String.format("%.2f", value).
Accede a tus constantes mediante el nombre de la clase, como MathConstants.PI.