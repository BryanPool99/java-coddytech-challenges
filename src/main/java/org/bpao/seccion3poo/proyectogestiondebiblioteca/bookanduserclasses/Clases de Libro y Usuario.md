Continuemos construyendo el sistema de gestión de bibliotecas ampliando las clases Book y User de la lección anterior. Ahora añadirás la capacidad para que los usuarios tomen libros prestados, creando una conexión real entre estas dos entidades.
Organizarás tu código en tres archivos:

- Book.java: Mejora tu clase Book del desafío anterior. Conserva toda la funcionalidad existente (isbn, title, author, isAvailable con getters/setters y getDetails()). Ahora añade un campo privado borrowedBy de tipo String que almacene el ID del usuario que tomó prestado el libro (o null si no está prestado). Añade un getter para borrowedBy y un setter que también actualice isAvailable según corresponda: cuando se presta un libro (borrowedBy se establece con un valor no nulo), deja de estar disponible; cuando se devuelve (se establece en null), vuelve a estar disponible.
- User.java: Amplía tu clase User para realizar un seguimiento de los libros prestados. Conserva el id, name, constructor, getters y toString() existentes. Añade un campo privado ArrayList<Book> llamado borrowedBooks (inicialízalo en el constructor). Crea un método borrowBook(Book book) que añada el libro a la lista del usuario y establezca borrowedBy del libro con el ID de este usuario. Crea un método returnBook(Book book) que elimine el libro de la lista y establezca borrowedBy en null. Añade un método getBorrowedCount() que devuelva cuántos libros tiene actualmente el usuario.
- Main.java: Demuestra el sistema de préstamos en acción. Recibirás cinco entradas: ISBN, título y autor de un libro; después, el ID y el nombre del usuario.
Crea un Book y un User con estas entradas. Imprime los detalles y el estado de disponibilidad del libro. Después, haz que el usuario tome prestado el libro. Imprime nuevamente la disponibilidad del libro, seguida de quién lo tomó prestado, con el formato Borrowed by: [userId]. Imprime cuántos libros tiene el usuario con el formato [name] has [count] book(s). Finalmente, haz que el usuario devuelva el libro e imprime la disponibilidad una vez más.

Recibirás cinco entradas en este orden: ISBN (String), título (String), autor (String), ID de usuario (String) y nombre de usuario (String).

Por ejemplo, con las entradas 978-0-13-468599-1, Effective Java, Joshua Bloch, U001 y Alice, tu salida sería:

[978-0-13-468599-1] Effective Java by Joshua Bloch
Available: true
Available: false
Borrowed by: U001
Alice has 1 book(s)
Available: true

Este desafío se basa directamente en tu trabajo anterior y añade la relación fundamental entre libros y usuarios que hace funcional a un sistema de biblioteca. Utilizarás composición (User «tiene» Books) y verás cómo los cambios en un objeto pueden afectar a otro mediante métodos bien diseñados.
