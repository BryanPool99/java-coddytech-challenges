package org.bpao.seccion3poo.genericos.wildcardsextendssuper.desafio;

import java.util.List;

public class ZooFeeder {
    // TODO: Crear el método printInventory usando comodín sin acotar (?)
    // Este método debería imprimir cada elemento de la lista en su propia línea
    public static void printInventory(List<?> items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }

    // TODO: Crear el método calculateTotalFood usando comodín acotado superiormente (? extends Food)
    // Este método debería devolver el conteo de elementos de la lista
    public static int calculateTotalFood(List<? extends Food> foods) {
        return foods.size();
    }

    // TODO: Crear el método addMeatToStock usando comodín acotado inferiormente (? super Meat)
    // Este método debería crear un nuevo objeto Meat y añadirlo al stock
    public static void addMeatToStock(List<? super Meat> list, String meatName) {
        list.add(new Meat(meatName));
    }
}
