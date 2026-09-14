package org.bpao.seccion3poo.herencia.recapemployeehierarchy;

// Clase base para todos los empleados
public class Employee {
    // TODO: Declarar campos protegidos para name (String) y salary (double)
    protected String name;
    protected double salary;

    // TODO: Crear un constructor que inicialice name y salary
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    // TODO: Crear el método getDetails() que devuelva: "[name] earns $[salary]"
    // Usar String.format("%.2f", salary) para el formateo
    public String getDetails() {
        return String.format("%s earns $%.2f", this.getName(), this.getSalary());
    }

    // TODO: Crear el método work() que imprima: "[name] is working"
    public void work() {
        System.out.println(this.getName() + " is working");
    }
}
