# Desafio facil de La palabra clave final

Vamos a construir un sistema de registro de Student que utiliza la palabra clave final 
para proteger los datos que nunca deben cambiar después de que un estudiante es registrado.

Crearás dos archivos para organizar tu código:

Vamos a construir un sistema de registro de Student que utiliza la palabra clave final para proteger los datos que nunca deben cambiar después de que un estudiante es registrado.

Crearás dos archivos para organizar tu código:

- Student.java: Crea una clase Student donde cierta información queda permanentemente bloqueada una vez establecida:
  - Un campo final studentId (String) - asignado al momento de la creación y que nunca puede cambiar
  - Un campo final enrollmentYear (int) - el año en que el estudiante se inscribió, también permanente
  - Un campo privado regular name (String) - puede ser actualizado si el estudiante cambia su nombre
  - Un constructor que recibe los tres valores e inicializa los campos
  - Un getter getStudentId() para el ID del estudiante
  - Un getter getEnrollmentYear() para el año de inscripción
  - Un getter getName() y un setter setName() para el nombre
  - Un método getInfo() que devuelve: "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
  
- Main.java: Crea un objeto Student, luego actualiza su nombre y muestra su información. Recibirás cuatro entradas: el ID del estudiante, el nombre inicial, el año de inscripción y un nuevo nombre para actualizar. Imprime dos líneas:
  - La información del estudiante antes del cambio de nombre
  - La información del estudiante después del cambio de nombre

Recibirás cuatro entradas en orden: studentId (String), name (String), enrollmentYear (int), y newName (String).

Observa cómo los campos final protegen el ID y el año de inscripción del estudiante; estos son registros permanentes que no deben cambiar, mientras que el nombre puede actualizarse a través de su setter.