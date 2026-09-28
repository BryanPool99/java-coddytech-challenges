# Resumen - Contenedor genérico
¡Construyamos un sistema de almacenamiento versátil que reúna todo lo que has aprendido sobre los genéricos! Crearás una clase Container que puede almacenar, recuperar y procesar elementos de cualquier tipo, junto con métodos de utilidad que demuestran los comodines en acción.

Organizarás tu código en tres archivos:
- Container.java: Crea una clase genérica Container<T> que administre una colección de elementos. Tu contenedor debe usar internamente un ArrayList<T> para almacenar elementos. Incluye métodos para add(T item) un elemento, get(int index) para recuperar un elemento en una posición específica, size() para devolver la cantidad de elementos y isEmpty() para comprobar si el contenedor no tiene elementos. Añade también un método getAll() que devuelva la lista interna.
- ContainerUtils.java: Crea una clase de utilidad con métodos genéricos estáticos que funcionen con tus contenedores:
  - printAll(Container<?> container) - Usa un comodín no acotado para imprimir todos los elementos de cualquier contenedor, uno por línea.

  - countItems(Container<? extends Number> container) - Usa un comodín con límite superior para calcular la suma de todos los valores numéricos del contenedor y devuelve el resultado como un double.

  - addDefaults(Container<? super Integer> container) - Usa un comodín con límite inferior para añadir los enteros 1, 2 y 3 a cualquier contenedor que pueda contener enteros.

  - <T> T getLastOrDefault(Container<T> container, T defaultValue) - Un método genérico que devuelve el último elemento del contenedor o el valor predeterminado si el contenedor está vacío.

- Main.java: ¡Reúne tu sistema de contenedores genéricos! Recibirás tres entradas: una palabra (String), un entero y un double.
  - Primero, crea un Container<String> y añade la palabra dos veces. Imprime String container: y después usa printAll para mostrar su contenido.

  - A continuación, crea un Container<Double> y añade el valor double. Imprime una línea en blanco y después Number sum: [sum] usando sumValues.

  - Después crea un Container<Number> y llama a addDefaults en él. Imprime una línea en blanco y después After adding defaults:; usa printAll para mostrar el contenido.

  - Por último, crea un Container<Integer> vacío y usa getLastOrDefault con tu entrada entera como valor predeterminado. Imprime una línea en blanco y después Last or default: [result].

Recibirás tres entradas en este orden: una palabra (String), un entero y un double.

Este desafío combina clases genéricas, métodos genéricos, parámetros de tipo acotados y los tres tipos de comodines. Observa cómo cada pieza cumple un propósito diferente: la clase genérica proporciona un almacenamiento seguro en cuanto al tipo, los comodines acotados permiten leer y escribir de forma flexible, y los métodos genéricos ofrecen operaciones reutilizables para distintos tipos de contenedores.