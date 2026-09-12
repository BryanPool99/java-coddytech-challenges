package org.bpao.seccion3poo.herencia.constructorchaining.desafio;

// Product.java - Clase padre para todos los productos
public class Product {
    // TODO: Declarar campos privados para name (String) y price (double)
    private String name;
    private double price;

    // TODO: Crear el constructor principal que reciba name y price
    // - Inicializar los campos
    // - Imprimir: "Product constructor: [name]"
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("Product constructor: " + this.name);
    }

    // TODO: Crear un segundo constructor que reciba solo name
    // - Encadenar al constructor principal usando this(name, 0.0)
    public Product(String name) {
        this(name, 0.0);
    }
    // TODO: Crear los métodos getter getName() y getPrice()

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
