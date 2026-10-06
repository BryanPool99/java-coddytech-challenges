package org.bpao.seccion3poo.patronesdediseño2.compositepattern.desafio;

// Define la interfaz del componente para el Patrón Composite
// This interface will be implemented by both Employee (leaf) and Department (composite)
public interface OrganizationComponent {
    // TODO: Declara el método showDetails que toma un parámetro String indent
    void showDetails(String indent);

    // TODO: Declara el método getSalary que devuelve un int
    int getSalary();
}
