Comencemos el proyecto del Sistema de Gestión de Bibliotecas construyendo los cimientos: las clases de entidad principales de las que dependerá todo lo demás. Este primer desafío se centra en crear clases Book y User bien estructuradas que modelen las entidades principales del sistema.

Organizarás tu código en tres archivos:

- Book.java: Crea la clase Book que representa un libro de la biblioteca. Cada libro debe tener campos privados para isbn (String), title (String), author (String) y isAvailable (booleano, con el valor predeterminado true). Incluye un constructor que acepte isbn, title y author. Proporciona métodos getter apropiados para todos los campos y un setter para isAvailable. Añade un método getDetails() que devuelva una cadena con el formato: [isbn] title by author.
- User.java: Crea la clase User que representa a un miembro de la biblioteca. Cada usuario debe tener campos privados para id (String) y name (String). Incluye un constructor que acepte ambos valores y proporciona métodos getter para cada campo. Añade un método toString() que devuelva: User[id]: name.
- Main.java: Une tus clases para demostrar que funcionan correctamente. Recibirás cuatro entradas: el ISBN, el título y el autor de un libro, después el ID y el nombre de un usuario.
Crea un Book con las tres primeras entradas y un User con las dos últimas. Imprime los detalles del libro usando getDetails(), después imprime si el libro está disponible con el formato Available: true o Available: false. Finalmente, imprime el usuario usando su método toString().

Recibirás cinco entradas en orden: ISBN (String), título (String), autor (String), ID de usuario (String) y nombre de usuario (String).

Por ejemplo, con las entradas 978-0-13-468599-1, Effective Java, Joshua Bloch, U001 y Alice Smith, tu salida sería:

[978-0-13-468599-1] Effective Java by Joshua Bloch
Available: true
User[U001]: Alice Smith

Estas clases fundamentales servirán como bloques de construcción para todo el Sistema de Gestión de Bibliotecas. En las próximas lecciones, las ampliarás con funcionalidad de préstamos, capacidades de búsqueda y mucho más.



