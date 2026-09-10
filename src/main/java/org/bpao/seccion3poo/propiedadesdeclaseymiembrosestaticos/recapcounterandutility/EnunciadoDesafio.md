# Desafío facil - Repaso - Contador y utilidad

Vamos a construir un sistema completo que combina una clase Counter para rastrear instancias con una clase de utilidad MathUtils, reuniendo todo lo que has aprendido sobre variables estáticas, métodos estáticos, bloques estáticos y constantes.

Crearás tres archivos para organizar tu código:

- Counter.java: Crea una clase que rastree cuántas instancias se han creado:
  - Una variable estática privada para contar el total de instancias
  - Una variable de instancia privada id que almacena el identificador único de cada contador
  - Un constructor que incrementa el conteo total y asigna el conteo actual como el id de esta instancia
  - Un método getId() que devuelve el id único de este contador
  - Un método estático getTotalCount() que devuelve cuántos objetos Counter se han creado
- MathUtils.java: Crea una clase de utilidad con solo miembros estáticos (nunca instanciada):
  - Una constante pública PI con el valor 3.14159
  - Una constante pública HALF con el valor 0.5
  - Un método estático square(int n) que devuelve n al cuadrado
  - Un método estático cube(int n) que devuelve n al cubo
  - Un método estático circleArea(double radius) que devuelve PI * radius * radius
- Main.java: Demuestra ambas clases trabajando juntas. Recibirás dos entradas: un número para operaciones matemáticas y un conteo de cuántos objetos Counter crear. Imprime lo siguiente:
  - Square: [value]
  - Cube: [value]
  - Circle area (radius=[number]): [value] (área formateada a 2 decimales)
  - Para cada Counter creado, imprime: Counter [id] created
  - Finalmente: Total counters: [count]

Recibirás dos entradas: un número (int) para los cálculos matemáticos, y un conteo (int) de cuántos objetos Counter crear.

Recuerda acceder a los miembros estáticos a través del nombre de la clase (como MathUtils.PI y Counter.getTotalCount()), y usa String.format("%.2f", value) para formatear valores decimales.