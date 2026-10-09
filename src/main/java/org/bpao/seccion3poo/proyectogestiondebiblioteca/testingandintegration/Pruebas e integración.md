# Pruebas e integración
¡Felicidades por construir tu sistema de gestión de biblioteca! Es hora de reunirlo todo y verificar que todos los componentes funcionen correctamente como un sistema integrado. Crearás un escenario de prueba completo que ejercite todas las funciones que has construido a lo largo de este proyecto.

Trabajarás con los siete archivos de tu sistema terminado:

- Book.java: Tu clase Book con isbn, title, author, isAvailable, borrowedBy y todos los métodos asociados, incluido getDetails().
- User.java: Tu clase User con id, name, la lista borrowedBooks y métodos para pedir prestados y devolver libros.
- LibraryException.java: Tu clase base de excepción personalizada.
- BookNotAvailableException.java: Tu excepción para libros no disponibles.
- LibraryAdmin.java: Tu interfaz de administración y la implementación AdminService.
- Library.java: Tu clase Library completa con todos los métodos: añadir y eliminar libros, registrar usuarios, pedir prestados y devolver libros, realizar búsquedas y gestionar excepciones.
- Main.java: Tu prueba de integración que demostrará el funcionamiento conjunto de todo el sistema.

En tu clase Main, procesarás una serie de comandos que prueban todas las funciones principales de tu sistema de biblioteca. Los comandos se proporcionan como una única cadena de texto separada por comas, con estos formatos:

- ADD_BOOK:isbn:title:author - Añadir un libro mediante AdminService
- REGISTER_USER:id:name - Registrar un usuario mediante AdminService
- BORROW:userId:isbn - Pedir prestado un libro (con gestión de excepciones)
- RETURN:userId:isbn - Devolver un libro
- SEARCH_TITLE:keyword - Buscar libros por título
- SEARCH_AUTHOR:keyword - Buscar libros por autor
- REMOVE_BOOK:isbn - Eliminar un libro mediante AdminService

Procesa cada comando e imprime la salida correspondiente:

- ADD_BOOK: Added: [title]
- REGISTER_USER: Registered: [name]
- BORROW: Imprime el mensaje de éxito o Error: [exception message]
- RETURN: [userName] returned [bookTitle]
- SEARCH_TITLE: Imprime Search '[keyword]': seguido de los detalles de cada libro coincidente, o No results
- SEARCH_AUTHOR: El mismo formato que la búsqueda por título
- REMOVE_BOOK: Removed: [isbn] o Cannot remove: [isbn]

Después de todos los comandos, imprime un resumen final:

- --- Final Status ---
- Books: [count]
- Users: [count]
- Para cada usuario, imprime [name]: [borrowedCount] book(s)

Recibirás una entrada: la cadena de comandos separada por comas.

Por ejemplo, con la entrada

ADD_BOOK:ISBN-001:Clean Code:Robert Martin,ADD_BOOK:ISBN-002:Effective Java:Joshua Bloch,REGISTER_USER:U001:Alice,REGISTER_USER:U002:Bob,BORROW:U001:ISBN-001,BORROW:U002:ISBN-001,SEARCH_TITLE:java,RETURN:U001:ISBN-001,REMOVE_BOOK:ISBN-001

tu salida sería:
Added: Clean Code
Added: Effective Java
Registered: Alice
Registered: Bob
Alice borrowed Clean Code
Error: Book not available: ISBN-001
Search 'java':
[ISBN-002] Effective Java by Joshua Bloch
Alice returned Clean Code
Removed: ISBN-001
--- Final Status ---
Books: 1
Users: 2
Alice: 0 book(s)
Bob: 0 book(s)

Este desafío final valida que todos tus componentes, clases, interfaces, excepciones y la lógica de la biblioteca funcionen juntos sin problemas. ¡Has construido un sistema de gestión de biblioteca completo y sólido!
