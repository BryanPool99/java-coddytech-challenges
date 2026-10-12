package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

// Clase Warrior que extiende Character e implementa Attackable
public class Warrior extends Character implements Attackable {
    // TODO: Añadir campo privado strength (int)
    private int strength;

    // TODO: Crear constructor que reciba name, maxHealth, level y strength
    public Warrior(String name, int maxHealth, int level, int strength) {
        super(name, maxHealth, level);
        this.strength = strength;
    }

    // TODO: Implementar getCharacterClass() para devolver "Warrior"
    @Override
    public String getCharacterClass() {
        return "Warrior";
    }

    // TODO: Implementar getDamageType() para devolver PHYSICAL
    @Override
    public DamageType getDamageType() {
        return DamageType.PHYSICAL;
    }

    // TODO: Implementar attack(Character target)
    // Daño = strength + level
    // Llamar al método takeDamage del target
    // Devolver "[name] strikes with [damageType description] for [damage] damage!"
    // seguido de un salto de línea y el resultado de takeDamage
    @Override
    public String attack(Character target) {
        int damage = strength + getLevel();
        String damageResult = target.takeDamage(damage);
        return String.format("%s strikes with %s for %s damage!\n%s", getName(), getDamageType().getDescription(), damage, damageResult);
    }
}
