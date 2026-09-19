package org.bpao.seccion3poo.metodosespecialesylaclaseobject.tostring_method.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        // TODO: Crea un objeto Product con los valores de entrada
        Product product = new Product(name, price, quantity);
        // TODO: Imprime el objeto product directamente
        // (¡Esto llamará automáticamente a tu método toString()!)
        System.out.println(product);
    }
}
