package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.instancevsstaticvariables.desafio;

public class Book {
    // TODO: Declarar la variable de instancia 'title' (String)
    private String title;
    // TODO: Declarar la variable de instancia 'price' (double)
    private double price;
    // TODO: Declarar la variable estática 'totalBooks' (int) - compartida entre todos los objetos Book
    private static int totalBooks;

    // TODO: Crear un constructor que reciba title y price
    // No olvides incrementar totalBooks cuando se cree un nuevo libro
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
        totalBooks++;
    }
    // TODO: Crear el getter getTitle() que devuelva el title

    public String getTitle() {
        return this.title;
    }

    // TODO: Crear el getter getPrice() que devuelva el price

    public double getPrice() {
        return this.price;
    }

    // TODO: Crear el método estático getTotalBooks() que devuelva el número total de libros

    public static int getTotalBooks() {
        return totalBooks;
    }
}
