package org.bpao.seccion3poo.objectorientedprogramming.constructormethod.desafio;

public class Book {
    private String title;
    private String author;
    private int pages;

    // TODO: Crea un constructor que tome title, author y pages
    // Usa la palabra clave 'this' para asignar cada parámetro a su campo
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // TODO: Crea el getter getTitle()
    public String getTitle() {
        return this.title;
    }

    // TODO: Crea el getter getAuthor()
    public String getAuthor() {
        return this.author;
    }

    // TODO: Crea el getter getPages()
    public int getPages() {
        return this.pages;
    }

    // TODO: Crea el método getSummary() que devuelva:
    // "<title> by <author> (<pages> pages)"
    public String getSummary() {
        return this.getTitle() + " by " + this.getAuthor() + " (" + this.getPages() + " pages)";
    }
}