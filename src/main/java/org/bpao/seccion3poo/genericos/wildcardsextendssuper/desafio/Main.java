package org.bpao.seccion3poo.genericos.wildcardsextendssuper.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meatName = scanner.nextLine();
        String vegetableName = scanner.nextLine();

        // TODO: Crea un ArrayList<Food> y añade objetos Meat y Vegetable
        ArrayList<Food> foods = new ArrayList<>();
        Meat meat = new Meat(meatName);
        Vegetable vegetable = new Vegetable(vegetableName);
        foods.add(meat);
        foods.add(vegetable);
        // TODO: Print "Food inventory:" then call printInventory
        System.out.println("Food inventory:");
        ZooFeeder.printInventory(foods);
        // TODO: Print blank line, then "Total food items: [count]" using calculateTotalFood
        System.out.println();
        System.out.println("Total food items: " + ZooFeeder.calculateTotalFood(foods));
        // TODO: Crea un nuevo ArrayList<Food> llamado meatStock
        ArrayList<Food> meatStock = new ArrayList<>();
        // TODO: Print blank line, then "Adding to meat stock..."
        System.out.println();
        System.out.println("Adding to meat stock...");
        // TODO: Llama a addMeatToStock con meatStock y "Beef"
        ZooFeeder.addMeatToStock(meatStock, "Beef");
        // TODO: Print "Meat stock after adding:" then call printInventory on meatStock
        System.out.println("Meat stock after adding:");
        ZooFeeder.printInventory(meatStock);
    }
}
