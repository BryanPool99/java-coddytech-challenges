# Desafio Composición vs. Herencia

Construyamos un sistema informático usando composición para demostrar la relación «tiene un». En lugar de que un Computer herede de sus componentes (lo cual no tendría sentido), tu computadora contendrá las partes que necesita para funcionar.

Organizarás tu código en tres archivos:

- Processor.java: Crea una clase que represente una CPU. Un Processor tiene dos campos privados: brand (String) y speedGHz (double). Incluye un constructor para inicializar ambos campos y métodos getter para cada uno. Añade un método process() que devuelva un String: [brand] processing at [speedGHz] GHz
- Memory.java: Crea una clase que represente la RAM. Un Memory tiene dos campos privados: type (String, como "DDR4" o "DDR5") y sizeGB (int). Incluye un constructor, getters y un método load() que devuelva: Loading [sizeGB]GB [type] memory
- Computer.java: ¡Aquí es donde destaca la composición! Tu clase Computer debe tener un Processor y un Memory como campos privados. No los extiende, los contiene. Incluye un constructor que acepte ambos componentes. Añade un método boot() que devuelva un String de varias líneas mostrando cómo la computadora se inicia utilizando sus componentes:

Booting computer...
[processor.process() result]
[memory.load() result]
System ready!

Añade también un método getSpecs() que devuelva: Specs: [processor brand] CPU, [memory sizeGB]GB [memory type]

- Main.java: ¡Da vida a tu sistema compuesto! Recibirás cuatro entradas: marca del procesador (String), velocidad del procesador (double), tipo de memoria (String) y tamaño de la memoria (int).
Crea un Processor y un Memory con estos valores y, después, compónlos en un Computer. Imprime el resultado de llamar a boot() y, después, imprime el resultado de getSpecs().

Recibirás cuatro entradas en este orden: marca del procesador, velocidad del procesador (GHz), tipo de memoria y tamaño de la memoria (GB).

Observa cómo el Computer delega el trabajo en sus componentes en lugar de intentar serlos. ¡Este es el poder de la composición! El Computer puede utilizar cualquier Processor o Memory que le proporciones, lo que hace que el diseño sea flexible y realista.
