# Funcionalidad de búsqueda
¡Mejoremos tu sistema de gestión de bibliotecas con potentes capacidades de búsqueda! Una biblioteca no es muy útil si los usuarios no pueden encontrar los libros que buscan. Añadirás métodos para buscar por título y autor, haciendo que tu biblioteca sea realmente funcional.


Seguirás desarrollando tu código existente en cuatro archivos:

- Book.java: Conserva tu clase Book con toda la funcionalidad existente: isbn, title, author, isAvailable, borrowedBy, getDetails(), y los getters/setters correspondientes. Asegúrate de tener métodos getter para title y author si aún no los has añadido.
- User.java: Conserva tu clase User sin cambios, con id, name, el ArrayList borrowedBooks, borrowBook(), returnBook(), getBorrowedCount() y toString().
- Library.java: Amplía tu clase Library con funcionalidad de búsqueda. Conserva todos los métodos existentes (addBook, registerUser, findBookByIsbn, findUserById, borrowBook, returnBook) y añade estos nuevos métodos de búsqueda:
  - searchByTitle(String keyword): devuelve un ArrayList<Book> que contiene todos los libros cuyo título contiene la palabra clave (sin distinguir mayúsculas de minúsculas). Usa toLowerCase() tanto en el título como en la palabra clave para la comparación.

  - searchByAuthor(String keyword): devuelve un ArrayList<Book> que contiene todos los libros cuyo nombre de autor contiene la palabra clave (sin distinguir mayúsculas de minúsculas).

  - getAvailableBooks(): devuelve un ArrayList<Book> que contiene únicamente los libros que están disponibles actualmente para préstamo.

- Main.java: ¡Demuestra tu sistema de búsqueda! Recibirás los datos de tres libros (ISBN, título y autor de cada uno), después un usuario (ID y nombre), seguido de una operación de préstamo y dos consultas de búsqueda.
Crea una Library, añade los tres libros y registra al usuario. Procesa la operación de préstamo (con el formato userId:isbn). Después realiza las dos búsquedas: la primera entrada es una palabra clave del título y la segunda es una palabra clave del autor.

Imprime los resultados en este orden:
- Después del préstamo, imprime la confirmación del préstamo
- Imprime Title search '[keyword]': seguido de los detalles de cada libro coincidente en líneas separadas (usando getDetails()). Si no hay coincidencias, imprime No books found
- Imprime Author search '[keyword]': seguido de los detalles de cada libro coincidente. Si no hay coincidencias, imprime No books found
- Imprime Available books: seguido de los detalles de cada libro disponible

Recibirás las entradas en este orden: ISBN de book1, título de book1, autor de book1, ISBN de book2, título de book2, autor de book2, ISBN de book3, título de book3, autor de book3, ID del usuario, nombre del usuario, operación de préstamo, palabra clave de búsqueda del título, palabra clave de búsqueda del autor.

Por ejemplo, con las entradas ISBN-001, Clean Code, Robert Martin, ISBN-002, The Clean Coder, Robert Martin, ISBN-003, Design Patterns, Gang of Four, U001, Alice, U001:ISBN-001, clean, martin, tu salida sería:

Alice borrowed Clean Code
Title search 'clean':
[ISBN-001] Clean Code by Robert Martin
[ISBN-002] The Clean Coder by Robert Martin
Author search 'martin':
[ISBN-001] Clean Code by Robert Martin
[ISBN-002] The Clean Coder by Robert Martin
Available books:
[ISBN-002] The Clean Coder by Robert Martin
[ISBN-003] Design Patterns by Gang of Four
Observa cómo los métodos de búsqueda utilizan coincidencias que no distinguen mayúsculas de minúsculas: buscar "clean" encuentra tanto "Clean Code" como "The Clean Coder". La lista de libros disponibles excluye correctamente el libro prestado. ¡Estas capacidades de búsqueda transforman tu biblioteca de una simple colección en un sistema realmente útil!
