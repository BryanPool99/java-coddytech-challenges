package org.bpao.seccion3poo.patronesdediseño2.compositepattern.desafio;

// Clase hoja que representa a los trabajadores individuales
// Implementa la interfaz OrganizationComponent
public class Employee implements OrganizationComponent {
    // TODO: Declara campos privados para name (String) y salary (int)
    private String name;
    private int salary;

    // TODO: Crea un constructor que tome name y salary como parámetros
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // TODO: Implementa el método showDetails
    // Debe imprimir: [indent][name]: $[salary]
    @Override
    public void showDetails(String indent) {
        System.out.println(String.format("%s%s: $%s", indent, this.name, this.salary));
    }

    // TODO: Implementa el método getSalary
    // Debe devolver el salario del empleado
    @Override
    public int getSalary() {
        return this.salary;
    }
}
