# Desafio de Visión general de los niveles de acceso

Construyamos un sistema de registro de Student que demuestre cómo los modificadores de acceso controlan la visibilidad a través de diferentes archivos.

Crearás dos archivos para organizar tu código:

Construyamos un sistema de registro de Student que demuestre cómo los modificadores de acceso controlan la visibilidad a través de diferentes archivos.

Crearás dos archivos para organizar tu código:

- Student.java: Define una clase Student con campos que utilicen diferentes niveles de acceso:
  * Campo private: studentId (String) - solo accesible dentro de la clase Student
  * Campo por defecto (sin modificador): grade (int) - accesible dentro del mismo paquete
  * Campo protected: name (String) - accesible en el mismo paquete y subclases
  * Campo public: school (String) - accesible en todas partes
Incluye un constructor que establezca los cuatro campos, y un método public llamado getInfo() que devuelva una cadena en el formato: "[studentId] name - Grade grade at school"
- Main.java: Crea un objeto Student y demuestra qué campos pueden ser accedidos directamente desde fuera de la clase. Imprime el campo school directamente, luego imprime el resultado de getInfo() para mostrar toda la información del estudiante.

Recibirás cuatro entradas: studentId, name, grade, y school (en ese orden).

Tu salida debe constar de dos líneas: el nombre de la escuela accedido directamente,
seguido de la información completa del estudiante del método getInfo().