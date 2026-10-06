package org.bpao.seccion3poo.patronesdediseño2.compositepattern.desafio;

import java.util.ArrayList;
import java.util.List;

// Clase Composite que puede contener tanto empleados como subdepartamentos
// Implementa la interfaz OrganizationComponent
public class Department implements OrganizationComponent {
    // TODO: Declara el campo privado para name (String)
    private String name;
    // TODO: Declara la List privada de OrganizationComponent para contener children
    private List<OrganizationComponent> children;

    // TODO: Crea el constructor que toma name como parámetro
    // Inicializa la lista de children
    public Department(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    // TODO: Implementa el método add para añadir OrganizationComponent a children
    public void add(OrganizationComponent organizationComponent) {
        this.children.add(organizationComponent);
    }

    // TODO: Implementa el método showDetails
    // Debe imprimir: [indent][name] Department
    // Luego llama a showDetails en cada child con indent + "  " (dos espacios)
    @Override
    public void showDetails(String indent) {
        System.out.println(indent + name + " Department");
        for (OrganizationComponent child : children) {
            child.showDetails(indent + "  ");
        }
    }

    // TODO: Implementa el método getSalary
    // Debe devolver la suma de los salarios de todos los children
    @Override
    public int getSalary() {
        return children.stream().mapToInt(OrganizationComponent::getSalary).sum();
    }
}
