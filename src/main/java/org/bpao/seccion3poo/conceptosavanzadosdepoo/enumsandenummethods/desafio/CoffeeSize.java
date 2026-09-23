package org.bpao.seccion3poo.conceptosavanzadosdepoo.enumsandenummethods.desafio;

public enum CoffeeSize {
    // TODO: Define las constantes del enum SMALL, MEDIUM, LARGE con precios 2.50, 3.50, 4.50
    SMALL(2.50), MEDIUM(3.50), LARGE(4.50);
    // TODO: Añade un campo private double para price
    private double price;

    // TODO: Añade un constructor que tome un parámetro price
    CoffeeSize(double price) {
        this.price = price;
    }
    // TODO: Añade un método getPrice() que devuelva el price

    public double getPrice() {
        return price;
    }

    // TODO: Añade un método getDescription() que devuelva "[SIZE_NAME] - $[price]"
    public String getDescription() {
        return String.format("%s - $%s", name(), getPrice());
    }
}
