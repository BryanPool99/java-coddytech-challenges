package org.bpao.seccion3poo.herencia.recapemployeehierarchy;

// Clase Developer que extiende de Employee
public class Developer extends Employee {
    // TODO: Declarar un campo para language (String)
    private String language;

    // TODO: Crear un constructor que reciba name, salary y language
    // Usar super() para inicializar los campos de la clase padre
    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    // TODO: Sobrescribir el método work() para imprimir: "[name] is coding in [language]"
    @Override
    public void work() {
        System.out.println(this.getName() + " is coding in " + this.getLanguage());
    }

    // TODO: Crear el método getDeveloperDetails() que devuelva:
    // "Developer: [name] earns $[salary], Language: [language]"
    // Usar String.format("%.2f", salary) para el formato
    public String getDeveloperDetails() {
        return String.format("Developer: %s earns $%.2f, Language: %s", this.getName(), this.getSalary(), this.getLanguage());
    }
}
