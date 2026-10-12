package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

// Clase Mage que extiende Character e implementa Attackable y Healable
public class Mage extends Character implements Attackable, Healable {
    // TODO: Añade campos privados: intelligence (int) y mana (int)
    private int intelligence;
    private int mana;

    // TODO: Crea el constructor que recibe name, maxHealth, level, intelligence y mana
    public Mage(String name, int maxHealth, int level, int intelligence, int mana) {
        super(name, maxHealth, level);
        this.intelligence = intelligence;
        this.mana = mana;
    }

    // TODO: Implementa getCharacterClass() para devolver "Mage"
    @Override
    public String getCharacterClass() {
        return "Mage";
    }

    // TODO: Implementa getDamageType() para devolver MAGICAL
    @Override
    public DamageType getDamageType() {
        return DamageType.MAGICAL;
    }

    // TODO: Implementa attack(Character target)
    // Daño = intelligence * 2
    // Sigue el mismo formato que Warrior
    @Override
    public String attack(Character target) {
        int damage = intelligence * 2;
        String damageResult = target.takeDamage(damage);
        return String.format("%s strikes with %s for %s damage!\n%s", getName(), getDamageType().getDescription(), damage, damageResult);
    }

    // TODO: Implementa heal(int amount)
    // Restaura la salud usando setHealth
    // Return "[name] channels healing magic! Health: [health]/[maxHealth]"

    @Override
    public String heal(int amount) {
        setHealth(getHealth() + amount);
        return String.format("%s channels healing magic! Health: %d/%d", getName(), getHealth(), getMaxHealth());
    }
}
