# Desafio Resumen - Jerarquía de empleados

Construyamos un sistema completo de jerarquía de empleados que reúna todos los conceptos de herencia de este capítulo. Crearás una estructura empresarial en la que distintos tipos de empleados compartan atributos comunes, pero tengan sus propios comportamientos especializados.

Organizarás tu código en cuatro archivos:

- Employee.java: Crea la clase base que todos los empleados comparten. Cada empleado tiene un nombre y un salario. Incluye un constructor que inicialice ambos campos y un método getDetails() que devuelva: [name] earns $[salary]. Añade también un método work() que muestre: [name] is working.
- Manager.java: Crea una clase que extienda Employee. Los gerentes tienen un campo adicional teamSize que representa a cuántas personas gestionan. Usa super para encargarte de la inicialización de la clase padre. Sobrescribe el método work() para mostrar: [name] is managing a team of [teamSize]. Añade un método getManagerDetails() que devuelva: Manager: [name] earns $[salary], Team size: [teamSize]

- Developer.java: Crea otra clase que extienda Employee. Los desarrolladores tienen un campo language para su especialidad de programación. De nuevo, usa super para la parte correspondiente a la clase padre. Sobrescribe work() para mostrar: [name] is coding in [language]. Añade un método getDeveloperDetails() que devuelva: Developer: [name] earns $[salary], Language: [language].
- Main.java: Reúne todo aquí. Recibirás cinco entradas: el nombre de un empleado, el salario, el tamaño del equipo del gerente, otro nombre y un lenguaje de programación para el desarrollador. Crea un Manager y un Developer; después, para cada uno, llama a su método de detalles especializado seguido de su método work().

Recibirás cinco entradas en este orden: nombre del gerente (String), salario del gerente (double), tamaño del equipo (int), nombre del desarrollador (String) y lenguaje de programación (String). Usa un salario de 75000.0 para el desarrollador.

Da formato a todos los valores salariales con 2 decimales utilizando String.format("%.2f", salary). Tu salida debe mostrar cuatro líneas en total: los detalles y el comportamiento laboral del gerente, seguidos de los detalles y el comportamiento laboral del desarrollador.