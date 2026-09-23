package org.bpao.seccion3poo.conceptosavanzadosdepoo.enumsandenummethods.desafio;

public class Order {
    // TODO: Añade campos privados para customerName (String) y size (CoffeeSize)
    private String customerName;
    private CoffeeSize size;

    // TODO: Añade un constructor que inicialice ambos campos
    public Order(String customerName, CoffeeSize size) {
        this.customerName = customerName;
        this.size = size;
    }
    // TODO: Añade métodos getter para customerName y size

    public String getCustomerName() {
        return customerName;
    }

    public CoffeeSize getSize() {
        return size;
    }

    // TODO: Añade un método getReceipt() que devuelva una cadena de varias líneas:
    // "Order for: [customerName]
    // Tamaño: [descripción de size]
    // Total: $[price]"
    public String getReceipt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order for: " + this.getCustomerName());
        sb.append("\n");
        sb.append("Size: " + this.getSize().getDescription());
        sb.append("\n");
        sb.append("Total: $" + this.getSize().getPrice());
        return sb.toString();
    }
}
