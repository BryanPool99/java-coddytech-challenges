package org.bpao.seccion3poo.patronesdediseño2.templatemethodpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String reportTitle = scanner.nextLine();
        String customerName = scanner.nextLine();
        double invoiceAmount = scanner.nextDouble();

        // TODO: Crea un ReportGenerator con el título y llama a generateDocument()
        ReportGenerator reportGenerator = new ReportGenerator(reportTitle);
        reportGenerator.generateDocument();
        // TODO: Imprime una línea vacía para separación
        System.out.println();
        // TODO: Crea un InvoiceGenerator con el nombre del cliente y el monto, y llama a generateDocument()
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(customerName, invoiceAmount);
        invoiceGenerator.generateDocument();
    }
}
