package org.bpao.seccion3poo.herencia.singleandmultilevelinherit.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String brand = scanner.nextLine();
        int wheels = scanner.nextInt();
        scanner.nextLine(); // consumir nueva línea
        String model = scanner.nextLine();

        // TODO: Crear un objeto Car con los valores de entrada
        Car myCar = new Car(brand, wheels, model);
        // TODO: Llamar a move() - heredado de Vehicle (abuelo)
        myCar.move();
        // TODO: Llamar a honk() - heredado de LandVehicle (padre)
        myCar.honk();
        // TODO: Llamar a displayInfo() - definido en el propio Car
        myCar.displayInfo();
    }
}
