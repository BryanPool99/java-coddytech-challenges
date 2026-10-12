package org.bpao.seccion3poo.desafiofinales.gamecharacterdevelopment.desafio;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Usa una colección para mantener los personajes (LinkedHashMap preserva el orden de inserción)
        // LinkedHashMap<String, Character> characters = new LinkedHashMap<>();
        LinkedHashMap<String, Character> characters = new LinkedHashMap<>();
        // TODO: Divide la entrada por comas para obtener los comandos individuales
        String[] commands = input.split(",");
        // TODO: Procesa cada comando:
        // - CREATE_WARRIOR:name:maxHealth:level:strength
        //   Print: "[name] the Warrior joins the battle!"
        //
        // - CREATE_MAGE:name:maxHealth:level:intelligence:mana
        //   Print: "[name] the Mage joins the battle!"
        //
        // - ATTACK:attackerName:targetName
        //   Imprime el resultado del ataque del método attack
        //
        // - HEAL:mageName:amount
        //   Imprime el resultado de la curación, o "[name] cannot heal" si no es un Mage
        //
        // - STATUS:characterName
        //   Imprime: "[name] ([characterClass]) - Level [level] - Health: [health]/[maxHealth] - [Alive/Defeated]"
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];

            if (action.equals("CREATE_WARRIOR")) {
                String name = parts[1];
                int maxHealth = Integer.parseInt(parts[2]);
                int level = Integer.parseInt(parts[3]);
                int strength = Integer.parseInt(parts[4]);
                Warrior warrior = new Warrior(name, maxHealth, level, strength);
                characters.put(name, warrior);
                System.out.println(name + " the Warrior joins the battle!");
            } else if (action.equals("CREATE_MAGE")) {
                String name = parts[1];
                int maxHealth = Integer.parseInt(parts[2]);
                int level = Integer.parseInt(parts[3]);
                int intelligence = Integer.parseInt(parts[4]);
                int mana = Integer.parseInt(parts[5]);
                Mage mage = new Mage(name, maxHealth, level, intelligence, mana);
                characters.put(name, mage);
                System.out.println(name + " the Mage joins the battle!");
            } else if (action.equals("ATTACK")) {
                String attackerName = parts[1];
                String targetName = parts[2];
                Character attacker = characters.get(attackerName);
                Character target = characters.get(targetName);
                if (attacker instanceof Attackable) {
                    String result = ((Attackable) attacker).attack(target);
                    System.out.println(result);
                }
            } else if (action.equals("HEAL")) {
                String mageName = parts[1];
                int amount = Integer.parseInt(parts[2]);
                Character character = characters.get(mageName);
                if (character instanceof Healable) {
                    String result = ((Healable) character).heal(amount);
                    System.out.println(result);
                } else {
                    System.out.println(mageName + " cannot heal");
                }
            } else if (action.equals("STATUS")) {
                String characterName = parts[1];
                Character character = characters.get(characterName);
                String status = character.isAlive() ? "Alive" : "Defeated";
                System.out.println(character.getName() + " (" + character.getCharacterClass() + ") - Level " + character.getLevel() + " - Health: " + character.getHealth() + "/" + character.getMaxHealth() + " - " + status);
            }
        }

        // TODO: After all commands, print "--- Battle Summary ---"
        System.out.println("--- Battle Summary ---");
        // Luego imprime el estado de cada personaje
        for (Character character : characters.values()) {
            String status = character.isAlive() ? "Alive" : "Defeated";
            System.out.println(character.getName() + " (" + character.getCharacterClass() + ") - Level " + character.getLevel() + " - Health: " + character.getHealth() + "/" + character.getMaxHealth() + " - " + status);
        }
    }
}
