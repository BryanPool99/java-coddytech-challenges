package org.bpao.seccion3poo.metodosespecialesylaclaseobject.tostring_method.desafio;

public class Product {
    // TODO: Declara tres campos privados:
    // - name (String)
    // - price (double)
    // - quantity (int)
    private String name;
    private double price;
    private int quantity;

    // TODO: Crea un constructor que inicialice los tres campos
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // TODO: Sobrescribe el método toString()
    // Formato de retorno: Product[name=X, price=Y, quantity=Z]
    // donde X, Y, Z son los valores reales de los campos
    @Override
    public String toString() {
        return "Product[name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
