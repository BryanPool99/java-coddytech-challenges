package org.bpao.seccion3poo.herencia.recapemployeehierarchy;

// Clase Manager que extiende a Employee
public class Manager extends Employee {
    // TODO: Declarar un campo para teamSize (int)
    private int teamSize;

    // TODO: Crear un constructor que tome name, salary y teamSize
    // Usar super() para inicializar los campos de la clase padre
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return this.teamSize;
    }

    // TODO: Sobrescribir el método work() para imprimir: "[name] is managing a team of [teamSize]"
    @Override
    public void work() {
        System.out.println(this.getName() + " is managing a team of " + this.getTeamSize());
    }

    // TODO: Crear el método getManagerDetails() que devuelva:
    // "Manager: [name] earns $[salary], Team size: [teamSize]"
    // Usar String.format("%.2f", salary) para el formateo
    public String getManagerDetails() {
        return String.format("Manager: %s earns $%.2f, Team size: %d", this.getName(), this.getSalary(), this.getTeamSize());
    }
}
