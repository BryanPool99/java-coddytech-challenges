package org.bpao.seccion3poo.proyectogestiondebiblioteca.projectoverviewandumldesign;

public class User {
    // TODO: Declarar campos privados
    // - id (String)
    // - name (String)
    private String id;
    private String name;

    // TODO: Crear un constructor que acepte id y name
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    // TODO: Crear métodos getter
    // - getId()
    // - getName()

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TODO: Sobrescribir el método toString()
    // Debe devolver: "User[id]: name"

    @Override
    public String toString() {
        return String.format("User[%s]: %s", getId(), getName());
    }
}
