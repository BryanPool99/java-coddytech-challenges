# Desafio de  Clases y métodos abstractos

Construyamos un sistema de electrodomésticos que demuestre el poder de las clases abstractas. Crearás una clase base Appliance que define lo que todo electrodoméstico debe hacer, mientras permite que los tipos específicos de electrodomésticos decidan exactamente cómo hacerlo.

Organizarás tu código en cuatro archivos:

- Appliance.java: Crea una clase abstracta que sirva como modelo para todos los electrodomésticos. Cada electrodoméstico tiene un campo brand (String) y un campo wattage (int). Incluye un constructor que inicialice ambos campos, métodos getter para cada uno y un método normal getInfo() que devuelva: [brand] - [wattage]W. Define un método abstracto operate() que las subclases deban implementar; esto representa cómo realiza cada electrodoméstico su función principal.
- WashingMachine.java: Crea una clase concreta que extienda Appliance. Las lavadoras tienen un campo adicional capacity (int) que representa el tamaño de la carga en kg. Usa super para gestionar la inicialización de la clase padre. Implementa el método operate() para imprimir: [brand] washing machine is washing [capacity]kg of clothes
- Microwave.java: Crea otra clase concreta que extienda Appliance. Los microondas tienen un campo power (int) que representa el porcentaje del nivel de potencia. Implementa operate() para imprimir: [brand] microwave is heating at [power]% power
- Main.java: Reúne todo usando polimorfismo. Recibirás cinco entradas: un nombre de marca, la potencia en vatios, la capacidad de la lavadora, otro nombre de marca y el nivel de potencia del microondas. Crea un WashingMachine y un Microwave, y luego guárdalos en un arreglo de referencias Appliance. Recorre el arreglo y, para cada electrodoméstico, imprime su información usando getInfo(), seguido de una llamada a operate().

Recibirás cinco entradas en este orden: primera marca (String), primera potencia en vatios (int), capacidad en kg (int), segunda marca (String) y nivel de potencia (int).

Tu salida debe mostrar cuatro líneas: para cada electrodoméstico, verás su línea de información seguida de su comportamiento de operación. Observa cómo la clase abstracta te permite tratar distintos electrodomésticos de manera uniforme, mientras cada uno funciona a su manera particular.