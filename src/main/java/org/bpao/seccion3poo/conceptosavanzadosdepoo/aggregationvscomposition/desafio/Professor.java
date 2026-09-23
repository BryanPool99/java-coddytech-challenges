package org.bpao.seccion3poo.conceptosavanzadosdepoo.aggregationvscomposition.desafio;

// Clase Professor - existe independientemente de cualquier curso (usada en agregación)
public class Professor {
    // TODO: Declara campos privados: name (String) y department (String)
    private String name;
    private String department;

    // TODO: Crea un constructor que inicialice ambos campos
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }
    // TODO: Crea métodos getter para name y department

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // TODO: Sobrescribe toString() para devolver: Prof. [name] ([department])

    @Override
    public String toString() {
        return String.format("Prof. %s (%s)", this.getName(), this.getDepartment());
    }
}
