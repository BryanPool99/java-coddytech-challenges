package org.bpao.seccion3poo.conceptosavanzadosdepoo.innernestedandanonymousclass.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String customerName = scanner.nextLine();
        String itemName = scanner.nextLine();
        double itemPrice = scanner.nextDouble();

        double discount = 10.0;

        // TODO: Crear un ShoppingCart con el nombre del cliente
        ShoppingCart cart = new ShoppingCart(customerName);
        // TODO: Crear un Item usando: cart.new Item(itemName, itemPrice)
        ShoppingCart.Item item = cart.new Item(itemName, itemPrice);
        // TODO: Llamar a checkout() con el item y discount, luego imprimir el resultado
        String receipt = cart.checkout(item, discount);
        System.out.println(receipt);
    }
}
