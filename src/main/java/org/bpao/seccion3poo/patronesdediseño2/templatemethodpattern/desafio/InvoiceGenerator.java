package org.bpao.seccion3poo.patronesdediseño2.templatemethodpattern.desafio;

// Subclase concreta para generar facturas
public class InvoiceGenerator extends DocumentGenerator {
    // TODO: Añadir campos privados para almacenar el nombre del cliente y el monto
    private String name;
    private double amount;

    // TODO: Crear un constructor que reciba el nombre del cliente (String) y el monto (double)
    public InvoiceGenerator(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    // TODO: Implementar createHeader() para imprimir: *** INVOICE ***
    @Override
    void createHeader() {
        System.out.println("*** INVOICE ***");
    }

    // TODO: Implementar createBody() para imprimir:
    // Customer: [name]
    // Amount Due: $[amount] (formatear el monto a dos decimales)
    // Pista: Usa String.format("%.2f", amount) para formatear
    @Override
    void createBody() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: " + this.name);
        sb.append("\n");
        sb.append(String.format("Amount Due: $%.2f", this.amount));
        System.out.println(sb);
    }

    // TODO: Override createFooter() to print: Thank you for your business!
    @Override
    void createFooter() {
        System.out.println("Thank you for your business!");
    }
}
