# Integración de manejo de excepciones
¡Hagamos que tu sistema de gestión de biblioteca sea más robusto integrando un manejo adecuado de excepciones! Un sistema de biblioteca real necesita gestionar correctamente las condiciones de error: ¿qué ocurre cuando alguien intenta pedir prestado un libro que no existe o cuando un usuario intenta pedir prestados más libros de los permitidos? Crearás excepciones personalizadas que proporcionen información útil para estos casos.

Seguirás desarrollando tu código existente en seis archivos:

- Book.java: Conserva tu clase Book con toda la funcionalidad existente: isbn, title, author, isAvailable, borrowedBy, getDetails() y los getters/setters correspondientes.
- User.java: Conserva tu clase User con id, name, la ArrayList borrowedBooks, borrowBook(), returnBook(), getBorrowedCount() y toString().
- LibraryException.java: Crea una clase de excepción personalizada base llamada LibraryException que extienda Exception. Esta será la clase padre de todas las excepciones específicas de la biblioteca. Incluye un constructor que acepte un mensaje y se lo pase a la clase padre.
- BookNotAvailableException.java: Crea una excepción personalizada que extienda LibraryException. Esta excepción debe lanzarse cuando alguien intente pedir prestado un libro que ya está prestado. Incluye un constructor que acepte el ISBN del libro y cree un mensaje significativo como Book not available: [isbn].
- Library.java: Actualiza tu clase Library para que lance excepciones en lugar de imprimir mensajes de error. Modifica el método borrowBook(String userId, String isbn) para:
  - Lanzar LibraryException con el mensaje User not found: [userId] si el usuario no existe
  - Lanzar LibraryException con el mensaje Book not found: [isbn] si el libro no existe
  - Lanzar BookNotAvailableException si el libro ya está prestado
  - En caso de éxito, hacer que el usuario pida prestado el libro y devolver el mensaje de confirmación [userName] borrowed [bookTitle]

Cambia la firma del método a throws LibraryException y cambia el tipo de retorno a String.

Mantén todos los demás métodos (addBook, registerUser, findBookByIsbn, findUserById, returnBook, removeBook, searchByTitle, searchByAuthor, getAvailableBooks) funcionando como antes.

- Main.java: ¡Demuestra tu manejo de excepciones! Recibirás una cadena de comandos separados por comas. Cada comando sigue uno de estos formatos:
  - ADD_BOOK:isbn:title:author
  - REGISTER_USER:id:name
  - BORROW:userId:isbn

Procesa cada comando. Para ADD_BOOK, imprime Added: [title]. Para REGISTER_USER, imprime Registered: [name]. Para los comandos BORROW, usa un bloque try-catch para gestionar las excepciones: en caso de éxito, imprime el mensaje de confirmación; ante cualquier LibraryException, imprime Error: [exception message].

Después de procesar todos los comandos, imprime Operations completed.

Recibirás una entrada: una cadena de comandos separados por comas.

Por ejemplo, con la entrada ADD_BOOK:ISBN-001:Clean Code:Robert Martin,REGISTER_USER:U001:Alice,BORROW:U001:ISBN-001,BORROW:U001:ISBN-001,BORROW:U002:ISBN-001, 

tu salida sería:
Added: Clean Code
Registered: Alice
Alice borrowed Clean Code
Error: Book not available: ISBN-001
Error: User not found: U002
Operations completed

Observa cómo las excepciones personalizadas proporcionan mensajes de error claros y específicos. El primer intento de préstamo tiene éxito, el segundo falla porque el libro ya está prestado (BookNotAvailableException) y el tercero falla porque el usuario U002 no existe (LibraryException). ¡Este enfoque hace que tu sistema de biblioteca sea mucho más informativo y fácil de depurar que los mensajes de error genéricos!
