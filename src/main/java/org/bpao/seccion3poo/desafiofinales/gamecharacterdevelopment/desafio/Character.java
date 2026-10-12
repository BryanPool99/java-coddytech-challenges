package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

// Clase base abstracta para todos los personajes del juego
public abstract class Character {
    // TODO: Añade campos privados: name (String), health (int), maxHealth (int), level (int)
    private String name;
    private int health;
    private int maxHealth;
    private int level;

    // TODO: Crea un constructor que tome name, maxHealth y level
    // Establece health igual a maxHealth inicialmente
    public Character(String name, int maxHealth, int level) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.level = level;
    }

    // TODO: Añade getters para todos los campos
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getLevel() {
        return level;
    }

    // TODO: Añade el método protected setHealth(int health)
    // Asegura que health se mantenga entre 0 y maxHealth
    protected void setHealth(int health) {
        this.health = Math.max(0, Math.min(health, maxHealth));
    }

    // TODO: Crea el método takeDamage(int damage)
    // Reduce health y devuelve "[name] takes [damage] damage! Health: [health]/[maxHealth]"
    public String takeDamage(int damage) {
        setHealth(health - damage);
        return String.format("%s takes %d damage! Health: %d/%d", getName(), damage, getHealth(), getMaxHealth());
    }

    // TODO: Añade el método isAlive() que devuelva true si health > 0
    public boolean isAlive() {
        return getHealth() > 0;
    }

    // TODO: Declara el método abstracto getCharacterClass() que devuelva un String
    public abstract String getCharacterClass();
}
