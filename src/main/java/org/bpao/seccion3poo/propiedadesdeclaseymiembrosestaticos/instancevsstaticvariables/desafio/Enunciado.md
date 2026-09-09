# Desafío Facil de Variables de instancia vs. estáticas

Construyamos un sistema de inventario de Book que realice un seguimiento tanto de los detalles individuales de cada libro como del número total de libros de toda tu colección mediante variables de instancia y estáticas.

Crearás dos archivos para organizar tu código:

- Book.java: Crea una clase Book que realice un seguimiento de la información individual de cada libro y, al mismo tiempo, mantenga el recuento de todos los libros creados:
  - Una variable de instancia title (String), única para cada libro
  - Una variable de instancia price (double), única para cada libro
  - Una variable estática totalBooks (int), compartida entre todos los objetos Book, que realiza un seguimiento de cuántos libros se han creado
  - Un constructor que reciba el título y el precio, e incremente el recuento total de libros
  - Un getter getTitle() para el título
  - Un getter getPrice() para el precio
  - Un método estático getTotalBooks() que devuelva el número total de libros creados
- Main.java: Crea varios objetos Book y demuestra cómo el contador estático realiza un seguimiento de todas las instancias. Recibirás tres títulos de libros y tres precios como entradas. Después de crear los tres libros, imprime cuatro líneas:
  - El título y el precio de cada libro con el formato: [title]: $[price] (el precio debe tener un formato de 2 decimales)
  - El número total de libros mediante el método estático: Total books: [count]

Recibirás seis entradas en este orden: title1, price1, title2, price2, title3, price3.

Recuerda acceder al método estático mediante el nombre de la clase (Book.getTotalBooks()) en lugar de 
hacerlo mediante una instancia de objeto.
Para dar formato a los precios, utiliza String.format("%.2f", price)