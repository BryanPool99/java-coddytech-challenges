# Interfaz de administrador

¡Ampliemos tu sistema de gestión de bibliotecas con una interfaz de administración! Una biblioteca real necesita capacidades administrativas: añadir nuevos libros a la colección, eliminar los que estén desactualizados y registrar nuevos miembros. Crearás una interfaz que defina estas operaciones administrativas y las implementarás en una clase de administración específica.

Continuarás desarrollando tu código existente en cinco archivos:

- Book.java: conserva tu clase Book con toda la funcionalidad existente: isbn, title, author, isAvailable, borrowedBy, getDetails() y los getters/setters correspondientes.
- User.java: conserva tu clase User sin cambios, con id, name, el ArrayList borrowedBooks, borrowBook(), returnBook(), getBorrowedCount() y toString().
- Library.java: conserva tu clase Library con todos sus métodos existentes. Añade un nuevo método removeBook(String isbn) que encuentre y elimine un libro de la colección mediante su ISBN. El método debe devolver true si el libro se encontró y se eliminó, y false en caso contrario. Un libro solo puede eliminarse si está disponible actualmente (no prestado).
- LibraryAdmin.java: crea una interfaz llamada LibraryAdmin que defina el contrato para las operaciones administrativas. Tu interfaz debe declarar tres métodos:
  - addBook(String isbn, String title, String author): devuelve un booleano que indica si la operación tuvo éxito
  - removeBook(String isbn): devuelve un booleano que indica si la operación tuvo éxito
  - registerUser(String id, String name): devuelve un booleano que indica si la operación tuvo éxito

Después, crea una clase llamada AdminService que implemente esta interfaz. AdminService debe mantener una referencia a una Library (recibida mediante su constructor) e implementar los tres métodos delegando en Library y añadiendo los mensajes adecuados. Al añadir un libro, crea un nuevo Book y añádelo a la biblioteca. Al registrar un usuario, crea un nuevo User y regístralo.

- Main.java: ¡demuestra tu sistema de administración! Recibirás una serie de comandos administrativos como una única cadena separada por comas. Cada comando sigue uno de estos formatos:
  - ADD_BOOK:isbn:title:author
  - REMOVE_BOOK:isbn
  - REGISTER_USER:id:name
  - BORROW:userId:isbn

Crea una Library y un AdminService. Procesa cada comando e imprime el resultado:

- Para ADD_BOOK: imprime Added: [title] si la operación tuvo éxito
- Para REMOVE_BOOK: imprime Removed: [isbn] si la operación tuvo éxito, o Cannot remove: [isbn] si el libro no existe o está prestado
- Para REGISTER_USER: imprime Registered: [name]
- Para BORROW: utiliza la funcionalidad existente de préstamo de la biblioteca

Después de procesar todos los comandos, imprime Library status: seguido de los detalles de cada libro y su estado de disponibilidad con el formato [details] - [Available/Borrowed].

Recibirás una entrada: una cadena de comandos separados por comas.

Por ejemplo, con la entrada REGISTER_USER:U001:Alice,ADD_BOOK:ISBN-001:Clean Code:Robert Martin,ADD_BOOK:ISBN-002:Design Patterns:Gang of Four,BORROW:U001:ISBN-001,REMOVE_BOOK:ISBN-001,REMOVE_BOOK:ISBN-002,

tu salida sería:
Registered: Alice
Added: Clean Code
Added: Design Patterns
Alice borrowed Clean Code
Cannot remove: ISBN-001
Removed: ISBN-002
Library status:
[ISBN-001] Clean Code by Robert Martin - Borrowed

Observa cómo la interfaz de administración proporciona un contrato claro para las operaciones administrativas, mientras que la implementación de AdminService gestiona la lógica real. El sistema impide correctamente eliminar un libro prestado y permite eliminar los que están disponibles. Esta separación entre interfaz e implementación es un principio fundamental de la POO que hace que tu código sea más fácil de mantener y probar.