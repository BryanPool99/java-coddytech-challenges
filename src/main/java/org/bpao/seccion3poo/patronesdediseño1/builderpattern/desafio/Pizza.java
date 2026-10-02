package org.bpao.seccion3poo.patronesdediseño1.builderpattern.desafio;

public class Pizza {
    // TODO: Declare private fields for size, cheese, pepperoni, mushrooms
    private final String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // TODO: Crea un constructor privado que acepte un PizzaBuilder
    // y copia todos los valores del builder a los campos de la pizza
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.cheese = pizzaBuilder.cheese;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.mushrooms = pizzaBuilder.mushrooms;
    }

    // TODO: Implementa el método getDescription()
    // Formato: "[size] Pizza with: [toppings]"
    // Toppings should be comma-separated (Cheese, Pepperoni, Mushrooms)
    // Si no hay toppings, di "no toppings"
    public String getDescription() {
        StringBuilder toppings = new StringBuilder();

        if (cheese) {
            toppings.append("Cheese");
        }
        if (pepperoni) {
            if (toppings.length() > 0) {
                toppings.append(", ");
            }
            toppings.append("Pepperoni");
        }
        if (mushrooms) {
            if (toppings.length() > 0) {
                toppings.append(", ");
            }
            toppings.append("Mushrooms");
        }

        String toppingsStr = toppings.length() > 0 ? toppings.toString() : "no toppings";
        return size + " Pizza with: " + toppingsStr;
    }

    // TODO: Crea una clase interna estática PizzaBuilder
    // - El constructor toma el parámetro size requerido
    // - El método cheese() establece cheese en true, devuelve this
    // - El método pepperoni() establece pepperoni en true, devuelve this
    // - El método mushrooms() establece mushrooms en true, devuelve this
    // - El método build() devuelve una nueva Pizza
    public static class PizzaBuilder {
        // TODO: Declara campos que coincidan con los campos de Pizza
        private final String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        // TODO: Constructor con parámetro size
        public PizzaBuilder(String size) {
            this.size = size;
            this.cheese = false;
            this.pepperoni = false;
            this.mushrooms = false;
        }

        // TODO: Implement cheese(), pepperoni(), mushrooms() methods
        // Cada uno debe establecer el booleano a true y devolver this
        public PizzaBuilder cheese() {
            this.cheese = true;
            return this;
        }

        public PizzaBuilder pepperoni() {
            this.pepperoni = true;
            return this;
        }

        public PizzaBuilder mushrooms() {
            this.mushrooms = true;
            return this;
        }

        // TODO: Implementa el método build() que devuelve new Pizza(this)
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
