# Desafio - Resumen - Calculadora de figuras

Vamos a construir una calculadora de formas que reúna todos los conceptos de polimorfismo que has aprendido en este capítulo. Crearás una clase abstracta Shape con subclases concretas, y luego usarás el polimorfismo para calcular y mostrar áreas de manera uniforme.

Organizarás tu código en cuatro archivos:

- Shape.java: Crea una clase abstracta que sirva como base para todas las formas. Cada forma tiene un campo name (String). Incluye un constructor para inicializarlo, un método getter getName() y un método abstracto getArea() que devuelva un double. También añade un método describe() que devuelva: [name]: [area] (donde el área esté formateada a 2 decimales usando String.format("%.2f", getArea())).
- Circle.java: Crea una clase concreta que extienda de Shape. Los círculos tienen un campo radius (double). Usa super para pasar "Circle" como nombre. Implementa getArea() para devolver el área usando Math.PI * radius * radius.
- Rectangle.java: Crea otra clase concreta que extienda de Shape. Los rectángulos tienen campos width y height (ambos double). Pasa "Rectangle" como nombre al constructor padre. Implementa getArea() para devolver el ancho multiplicado por el alto.
- Main.java: Construye una calculadora de formas que demuestre el polimorfismo en acción. Recibirás tres entradas: un radio para el círculo, un ancho y un alto para el rectángulo.

Crea un Circle y un Rectangle, luego almacénalos en un arreglo de referencias de tipo Shape. Recorre el arreglo y, para cada forma, imprime su descripción usando el método describe().

Después del bucle, calcula e imprime el área total de todas las formas con el formato: Total area: [sum] (también formateado a 2 decimales). Usa un bucle separado o un acumulador para sumar las áreas llamando a getArea() en cada referencia de forma.

Recibirás tres entradas: el radio del círculo (double), el ancho del rectángulo (double) y el alto del rectángulo (double).

Tu salida debería mostrar tres líneas: una descripción para cada forma seguida del área total. ¡Observa cómo puedes tratar diferentes formas de manera uniforme a través del tipo abstracto Shape mientras cada forma calcula su área a su propia manera!