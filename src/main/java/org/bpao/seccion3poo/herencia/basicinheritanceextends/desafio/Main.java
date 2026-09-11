package org.bpao.seccion3poo.herencia.basicinheritanceextends.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();

        // TODO: Crea un objeto Motorcycle con la marca
        Motorcycle myMotorcycle = new Motorcycle(brand);
        // TODO: Llama al método start() heredado
        myMotorcycle.start();
        // TODO: Llama al método wheelie()
        myMotorcycle.wheelie();
    }
}
