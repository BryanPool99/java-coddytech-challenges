# Desafio facil - Encadenamiento de constructores

Construyamos un sistema de pedidos de productos que demuestre el encadenamiento de constructores tanto dentro de una clase como a través de una jerarquía de herencia. Verás cómo this() encadena constructores en la misma clase, mientras que super() encadena constructores de la clase padre.

Crearás tres archivos para organizar tu código:

- Product.java: Crea una clase padre que represente cualquier producto de una tienda. Debe tener:
    - Campos privados para name (String) y price (double)
    - Un constructor principal que acepte name y price, inicialice los campos e imprima: Product constructor: [name]
    - Un segundo constructor que acepte únicamente name y se encadene al constructor principal mediante this(name, 0.0) para establecer un precio predeterminado de 0.0
    - Métodos getName() y getPrice() para acceder a los campos
- Electronics.java: Crea una subclase que extienda Product y añada información sobre la garantía:
  - Un campo privado para warrantyYears (int)
  - Un constructor principal que acepte name, price y warrantyYears; usa super(name, price) para inicializar la clase padre, luego establece la garantía e imprime: Electronics constructor: [warrantyYears] year warranty
  - Un segundo constructor que acepte únicamente name y price, encadenándose al constructor principal mediante this(name, price, 1) para proporcionar una garantía predeterminada de 1 año
  - Un tercer constructor que acepte únicamente name y se encadene al segundo constructor mediante this(name, 0.0)
  - Un método getDetails() que devuelva: [name] - $[price] ([warrantyYears] year warranty)
- Main.java: Demuestra el encadenamiento de constructores en acción. Recibirás tres entradas: un nombre de producto (String), un precio (double) y los años de garantía (int). Crea un objeto Electronics usando los tres parámetros y luego imprime el resultado de getDetails().

Recibirás tres entradas: el nombre del producto, el precio y los años de garantía.

Da formato al precio en getDetails() para mostrar 2 decimales usando String.format("%.2f", price). Observa atentamente la salida: verás que los mensajes de los constructores aparecen en orden, mostrando cómo fluye la cadena desde la clase padre hasta la hija.