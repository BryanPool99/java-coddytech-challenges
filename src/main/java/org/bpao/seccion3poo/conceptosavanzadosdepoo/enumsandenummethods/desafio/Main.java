package org.bpao.seccion3poo.conceptosavanzadosdepoo.enumsandenummethods.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String customerName = scanner.nextLine();
        String sizeName = scanner.nextLine();

        // TODO: Convertir sizeName al enum CoffeeSize usando valueOf()
        CoffeeSize size = CoffeeSize.valueOf(sizeName);
        // TODO: Crear un Order con el nombre del cliente y el tamaño
        Order order = new Order(customerName, size);
        // TODO: Imprimir el recibo
        System.out.println(order.getReceipt());
        // TODO: Imprimir una línea vacía
        System.out.println();
        // TODO: Mostrar el menú completo iterando a través de todos los valores de CoffeeSize
        // Hint: Usa CoffeeSize.values() para obtener todas las constantes del enum
        for (CoffeeSize coffeeSize : CoffeeSize.values()){
            System.out.println(coffeeSize.getDescription());
        }
    }
}
