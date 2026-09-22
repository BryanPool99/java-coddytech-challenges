package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparatorinterface.desafio;

public class Employee {
    // TODO: Declara tres campos privados:
    // - name (String)
    // - department (String)
    // - salary (double)
    private String name;
    private String department;
    private double salary;

    // TODO: Crea un constructor que inicialice todos los campos
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    // TODO: Crea métodos getter para cada campo
    // - getName()
    // - getDepartment()
    // - getSalary()

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    // TODO: Sobrescribe toString() para devolver:
    // [name] ([department]) - $[salary]
    @Override
    public String toString() {
        // TODO: Implementa este método
        return String.format("%s (%s) - $%s", this.getName(), this.getDepartment(), this.getSalary());
    }
}
