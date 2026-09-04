package org.bpao.seccion3poo.objectorientedprogramming.constructoroverloading.desafio;

public class Product {
    private String name;
    private double price;
    private int stock;

    // TODO: Crear un constructor con 3 parámetros: name, price, stock
    // Inicializar todos los campos usando 'this'
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // TODO: Crear un constructor con 2 parámetros: name, price
    // Usar this() para llamar al constructor de 3 parámetros con stock = 0
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // TODO: Crear un constructor por defecto sin parámetros
    // Usar this() para llamar al constructor de 2 parámetros con name = "Unknown" y price = 0
    public Product() {
        this("Unknown", 0);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }
}
