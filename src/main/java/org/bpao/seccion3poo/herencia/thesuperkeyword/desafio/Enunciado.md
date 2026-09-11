# Desafio fácil de La palabra clave super

Construyamos un sistema de electrodomésticos que demuestre cómo las clases hijas pueden usar super para llamar a los constructores de las clases padre y ampliar el comportamiento de los métodos heredados.

Crearás tres archivos para organizar tu código:

- Appliance.java: Crea la clase padre que representa cualquier electrodoméstico del hogar. Debe tener:
  - Un campo privado para la brand (String) del electrodoméstico
  - Un campo privado para wattage (int)
  - Un constructor que acepte ambos valores y los inicialice
  - Un método getBrand() que devuelva la marca
  - Un método getWattage() que devuelva la potencia
  - Un método getInfo() que devuelva: [brand] - [wattage]W
- WashingMachine.java: Crea una subclase que extienda Appliance. Una lavadora tiene todo lo que tiene un electrodoméstico, además de sus propias características especiales:
  - Un campo privado para capacity (int) que representa la capacidad de carga en kg
  - Un constructor que reciba la marca, la potencia y la capacidad; usa super(brand, wattage) para inicializar la parte de la clase padre y después establece la capacidad
  - Un método getCapacity() que devuelva la capacidad
  - Un método getInfo() que llame al método getInfo() de la clase padre usando super.getInfo() y lo amplíe para devolver: [parent info], Capacity: [capacity]kg
- Main.java: Crea una WashingMachine y muestra toda su información. Recibirás tres entradas: la marca (String), la potencia (int) y la capacidad (int). Imprime el resultado de llamar a getInfo() en tu lavadora.

Recibirás tres entradas: el nombre de la marca, la potencia y la capacidad.

Observa cómo super cumple aquí dos propósitos: llamar al constructor de la clase padre para inicializar los campos heredados y llamar al método de la clase padre para basarse en su comportamiento en lugar de reemplazarlo por completo.
