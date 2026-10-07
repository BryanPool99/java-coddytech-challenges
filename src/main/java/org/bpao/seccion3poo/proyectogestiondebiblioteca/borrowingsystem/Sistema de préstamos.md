# Sistema de préstamos

Continuemos creando el Sistema de Gestión de Bibliotecas mediante la creación de un sistema de préstamos adecuado con una clase Library que gestione la colección de libros y usuarios. Aquí es donde tu sistema empieza a parecerse a una biblioteca real: ¡hacer un seguimiento de quién tiene qué y aplicar las reglas de préstamo!

Organizarás tu código en cuatro archivos:

- Book.java: Conserva tu clase Book del desafío anterior con toda su funcionalidad: isbn, title, author, isAvailable, borrowedBy, getDetails() y los getters/setters correspondientes.
- User.java: Conserva tu clase User con id, name, la ArrayList borrowedBooks, borrowBook(), returnBook(), getBorrowedCount() y toString().
- Library.java: Crea la clase central Library que gestione todo. Tu biblioteca debe mantener dos ArrayLists: uno para objetos Book y otro para objetos User. Incluye estos métodos:

  - addBook(Book book) - añade un libro a la colección de la biblioteca.

  - registerUser(User user) - añade un usuario a los usuarios registrados de la biblioteca.

  - findBookByIsbn(String isbn) - busca entre los libros y devuelve el Book cuyo ISBN coincida, o null si no lo encuentra.

  - findUserById(String id) - busca entre los usuarios y devuelve el User cuyo ID coincida, o null si no lo encuentra.

  - borrowBook(String userId, String isbn) - busca al usuario y el libro; después, si ambos existen y el libro está disponible, hace que el usuario tome prestado el libro e imprime [userName] borrowed [bookTitle]. Si el libro no está disponible, imprime Book not available. Si no se encuentra el usuario o el libro, imprime Invalid user or book.

  - returnBook(String userId, String isbn) - busca al usuario y el libro; después, hace que el usuario devuelva el libro e imprime [userName] returned [bookTitle]. Si no se encuentra el usuario o el libro, imprime Invalid user or book.

- Main.java: ¡Integra tu sistema de biblioteca! Recibirás los datos de dos libros (ISBN, título y autor de cada uno), un usuario (ID y nombre) y, después, una serie de operaciones.
Crea una Library, añade ambos libros y registra al usuario. Después, procesa las operaciones: recibirás una cadena separada por comas en la que cada operación tiene el formato borrow:userId:isbn o return:userId:isbn.

Después de procesar todas las operaciones, imprime un resumen que muestre el estado de cada libro con el formato [isbn]: [Available/Borrowed].

Recibirás las entradas en este orden: ISBN de book1, título de book1, autor de book1, ISBN de book2, título de book2, autor de book2, ID de usuario, nombre de usuario y, finalmente, la cadena de operaciones.

Por ejemplo, con las entradas ISBN-001, Clean Code, Robert Martin, ISBN-002, Design Patterns, Gang of Four, U001, Alice y borrow:U001:ISBN-001,borrow:U001:ISBN-002,return:U001:ISBN-001, el resultado sería:

Alice borrowed Clean Code
Alice borrowed Design Patterns
Alice returned Clean Code
ISBN-001: Available
ISBN-002: Borrowed

Este desafío reúne la composición, la encapsulación y el diseño de métodos para crear un sistema cohesionado. La clase Library actúa como coordinadora y delega la lógica real de los préstamos en las clases User y Book, mientras gestiona la colección general.

