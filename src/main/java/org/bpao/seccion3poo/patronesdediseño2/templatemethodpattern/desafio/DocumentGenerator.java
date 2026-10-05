package org.bpao.seccion3poo.patronesdediseño2.templatemethodpattern.desafio;

// Clase base abstracta que define el método plantilla
public abstract class DocumentGenerator {
    // TODO: Crea un método final llamado generateDocument() que define el esqueleto del algoritmo
    // Debe llamar a tres pasos en orden: createHeader(), createBody(), createFooter()
    public final void generateDocument() {
        createHeader();
        createBody();
        createFooter();
    }

    // TODO: Declara el método abstracto createHeader()
    abstract void createHeader();

    // TODO: Declara el método abstracto createBody()
    abstract void createBody();

    // TODO: Crea un método hook createFooter() con implementación por defecto
    // Default should print: --- End of Document ---
    void createFooter() {
        System.out.println("--- End of Document ---");
    }
}
