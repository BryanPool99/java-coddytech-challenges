# Resumen - Calculadora simple
## Desafio Dificil

Construye una clase Calculator completa que utilice todos los conceptos aprendidos:

- Campos: Campos privados para name (String), memory (double), operationCount (int)
- Constructores: Un constructor parametrizado y un constructor por defecto utilizando el encadenamiento this()
- Palabra clave this: Usa this para asignar campos y acceder a ellos en los métodos
- Getters: getName(), getMemory(), getOperationCount()
- Métodos: add, subtract, multiply, divide, power

El método add almacena su resultado en memory.
Todos los métodos incrementan operationCount.
El método divide devuelve 0 si se divide por cero.
El método power utiliza Math.pow().