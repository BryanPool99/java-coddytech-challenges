package org.bpao.seccion3poo.herencia.thesuperkeyword.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String brand = scanner.nextLine();
        int wattage = scanner.nextInt();
        int capacity = scanner.nextInt();

        // TODO: Crear un objeto WashingMachine con los valores de entrada
        WashingMachine myWashingMachine = new WashingMachine(brand, wattage, capacity);
        // TODO: Imprimir el resultado de llamar a getInfo() en la lavadora
        System.out.println(myWashingMachine.getInfo());
    }
}
