# Resumen - Ordenamiento personalizado

Construyamos un gestor de colecciones de libros que reúna todo lo que has aprendido sobre métodos especiales y ordenación. Crearás una clase Book con los métodos toString(), equals() y hashCode() implementados correctamente, y orden natural mediante Comparable, además de comparadores externos para ofrecer opciones de ordenación flexibles.

Organizarás tu código en cuatro archivos:
- Book.java: Crea una clase que represente un libro con tres campos privados: title (String), author (String) y year (int). Incluye un constructor y getters para todos los campos.
    Tu clase Book debe implementar Comparable<Book> con orden natural por year en orden ascendente (del más antiguo al más reciente).
    
    Sobrescribe toString() para que devuelva: [title] by [author] ([year])
    
    Sobrescribe equals() para que dos libros sean iguales cuando tengan el mismo title Y author. Sobrescribe hashCode() usando Objects.hash() con los mismos campos.
- TitleComparator.java: Crea un comparador que ordene los libros alfabéticamente por título en orden ascendente (de la A a la Z).
- AuthorComparator.java: Crea un comparador que ordene los libros alfabéticamente por autor en orden ascendente (de la A a la Z).
  Main.java: ¡Reúne todo! Recibirás los datos de tres libros, cada uno en una línea independiente, con el formato: title,author,year

Crea un ArrayList de libros y demuestra los tres enfoques de ordenación:

1. Ordena usando el orden natural (por año) e imprime cada libro
2. Imprime una línea vacía
3. Ordena por título usando TitleComparator e imprime cada libro
4. Imprime una línea vacía
5. Ordena por autor usando AuthorComparator e imprime cada libro

Recibirás tres líneas de entrada, cada una con los datos de un libro en el formato: title,author,year

Por ejemplo: 1984,George Orwell,1949

Recuerda importar java.util.Objects en Book.java, java.util.Comparator en tus archivos de comparadores, y java.util.ArrayList, java.util.Collections y java.util.Scanner en Main.java.
