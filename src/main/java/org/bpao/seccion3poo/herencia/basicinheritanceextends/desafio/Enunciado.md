# Desafio facil de Herencia 

Construyamos un sistema sencillo de vehículos que demuestre la herencia en acción. Crearás una clase principal que contenga las propiedades comunes de los vehículos y una clase secundaria que la amplíe con un comportamiento especializado.

Organizarás tu código en tres archivos:

- Vehicle.java: Crea la clase principal que representa cualquier vehículo. Debe tener:
  - Un campo privado para la brand del vehículo (String)
  - Un constructor que acepte el nombre de la marca y lo asigne al campo. (Aquí no se necesita una llamada a super(), ya que Vehicle está en la parte superior de la jerarquía.)
  - Un método getBrand() que devuelva la marca
  - Un método start() que imprima: [brand] is starting
- Motorcycle.java: Crea una subclase que amplíe Vehicle. Una motocicleta es un vehículo, por lo que esta relación de «es un» hace que la herencia sea apropiada. Tu Motorcycle debe:
  - Usar extends para heredar de Vehicle
  - Tener un constructor que reciba la marca y se la pase a la clase principal mediante super(brand)
  - Añadir su propio método wheelie() que imprima: [brand] is doing a wheelie!
- Main.java: Une todo creando un objeto Motorcycle y demostrando tanto los comportamientos heredados como los propios. Recibirás una entrada: el nombre de la marca. Imprime dos líneas llamando a:
  - El método heredado start()
  - El método propio de Motorcycle, wheelie()

Recibirás una entrada: el nombre de la marca (String) de tu motocicleta.

Observa cómo tu Motorcycle tiene acceso automáticamente a start() y getBrand() sin tener que reescribirlos; ¡ese es el poder de la herencia!

REQUIRED OUTPUT FORMAT: [Your translated content here]