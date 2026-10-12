package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

// Enum que representa diferentes tipos de daño en el juego
public enum DamageType {
    // TODO: Define los valores del enum PHYSICAL, MAGICAL y RANGED
    // Cada uno debe tener una descripción:
    // - PHYSICAL: "brute force"
    // - MAGICAL: "arcane energy"
    // - RANGED: "precision strike"
    PHYSICAL("brute force"),
    MAGICAL("arcane energy"),
    RANGED("precision strike");

    // TODO: Añade el campo privado 'description' (String)
    private String description;

    // TODO: Añade un constructor que establezca la description
    private DamageType(String description) {
        this.description = description;
    }

    // TODO: Añade el getter para description

    public String getDescription() {
        return description;
    }
}
