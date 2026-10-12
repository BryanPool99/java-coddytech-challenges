package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

// Interfaz que define las capacidades de combate
public interface Attackable {
    // TODO: Declara el método attack(Character target) que devuelve un String
    String attack(Character target);

    // TODO: Declara el método getDamageType() que devuelve un DamageType
    DamageType getDamageType();
}
