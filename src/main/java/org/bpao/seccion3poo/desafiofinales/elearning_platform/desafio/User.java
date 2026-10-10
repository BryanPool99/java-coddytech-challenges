package org.bpao.seccion3poo.desafiofinales.elearning_platform.desafio;

// Clase base abstracta que representa a cualquier usuario en la plataforma
public abstract class User {
    // TODO: Añade campos privados para id (String) y name (String)
    private String id;
    private String name;

    // TODO: Crea un constructor que inicialice ambos campos
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // TODO: Añade los getters apropiados para id y name
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // TODO: Declara el método abstracto getRole() que devuelve un String
    public abstract String getRole();
}
