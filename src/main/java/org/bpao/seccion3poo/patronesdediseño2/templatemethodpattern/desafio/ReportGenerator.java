package org.bpao.seccion3poo.patronesdediseño2.templatemethodpattern.desafio;

// Subclase concreta para generar informes
public class ReportGenerator extends DocumentGenerator {
    // TODO: Añade un campo privado para almacenar el título del informe
    private String title;

    // TODO: Crea un constructor que reciba un título de informe (String)
    public ReportGenerator(String title) {
        this.title = title;
    }

    // TODO: Implementa createHeader() para imprimir: === REPORT: [title] ===
    @Override
    void createHeader() {
        System.out.println(String.format("=== REPORT: %s ===", this.title));
    }

    // TODO: Implement createBody() to print: Report content goes here...
    @Override
    void createBody() {
        System.out.println("Report content goes here...");
    }
    // Note: Usa el pie de página predeterminado heredado (no es necesario sobrescribir createFooter)
}
