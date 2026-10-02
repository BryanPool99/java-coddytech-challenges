package org.bpao.seccion3poo.patronesdediseño1.builderpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String size = scanner.nextLine();
        String addCheese = scanner.nextLine();
        String addPepperoni = scanner.nextLine();
        String addMushrooms = scanner.nextLine();

        // TODO: Crea un PizzaBuilder con el tamaño dado
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder(size);
        // TODO: Encadena los métodos de toppings según las entradas de sí/no
        if (addCheese.equals("yes")) {
            pizzaBuilder.cheese();
        }
        if (addPepperoni.equals("yes")) {
            pizzaBuilder.pepperoni();
        }
        if (addMushrooms.equals("yes")) {
            pizzaBuilder.mushrooms();
        }
        // TODO: Construye la pizza e imprime su descripción
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getDescription());
    }
}
