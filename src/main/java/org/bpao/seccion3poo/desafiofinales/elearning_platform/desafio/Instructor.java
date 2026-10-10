package org.bpao.seccion3poo.desafiofinales.elearning_platform.desafio;

// Clase que representa a un instructor, extiende User
public class Instructor extends User {
    // TODO: Añadir campo privado para specialty (String)
    private String specialty;

    // TODO: Crear constructor que tome id, name y specialty
    public Instructor(String id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }

    // TODO: Implementar getRole() para devolver "Instructor"
    @Override
    public String getRole() {
        return "Instructor";
    }

    // TODO: Añadir getter para specialty
    public String getSpecialty() {
        return specialty;
    }

    // TODO: Sobrescribir toString() para devolver "Instructor: [name] - [specialty]"

    @Override
    public String toString() {
        return String.format("Instructor: %s - %s", getName(), getSpecialty());
    }
}
