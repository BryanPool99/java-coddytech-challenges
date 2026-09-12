# Desafio facil - La clase Object

Exploremos cómo la clase Object sirve como clase principal universal de todas las clases de Java mediante la creación de un sistema sencillo de inventario de dispositivos que demuestra los métodos heredados de Object.

Crearás tres archivos para organizar tu código:
- Gadget.java: Crea una clase que represente un dispositivo electrónico. Tu clase debe tener:
  - Campos privados para name (String) y year (int)
  - Un constructor que inicialice ambos campos
  - Métodos getter getName() y getYear()
No sobrescribas ningún método de Object; primero queremos ver el comportamiento predeterminado.
- Smartphone.java: Crea una subclase que extienda Gadget y añada características específicas de un smartphone:
  - Un campo privado para brand (String)
  - Un constructor que reciba name, year y brand; usa super(name, year) para la parte correspondiente a la clase principal
  - Un método getBrand() que devuelva brand
  - Sobrescribe el método toString() para que devuelva: Smartphone: [brand] [name] ([year])
- Main.java: Demuestra la diferencia entre los métodos Object predeterminados y sobrescritos. Recibirás tres entradas: el nombre de un dispositivo, el año y la marca. Crea un Gadget y un Smartphone usando el mismo nombre y año (además de la marca para el smartphone) y, después:
  - Imprime el nombre de la clase del dispositivo usando getClass().getSimpleName()
  - Imprime si el toString() predeterminado del dispositivo contiene el símbolo "@" (imprime true o false)
  - Imprime el smartphone usando su método toString() sobrescrito

Recibirás tres entradas: el nombre del dispositivo/smartphone (String), el año (int) y la marca (String).

Este desafío muestra por qué es importante sobrescribir los métodos de Object: el toString() predeterminado te proporciona algo como Gadget@1a2b3c, mientras que tu versión personalizada ofrece información significativa.