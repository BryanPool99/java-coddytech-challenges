package org.bpao.seccion3poo.polimorfismo.abstractclassesandmethods.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String brand1 = scanner.nextLine();
        int wattage1 = scanner.nextInt();
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consumir nueva línea
        String brand2 = scanner.nextLine();
        int power = scanner.nextInt();

        // TODO: Crear un objeto WashingMachine con brand1, wattage1 y capacity
        WashingMachine myWashingMachine = new WashingMachine(brand1, wattage1, capacity);
        // TODO: Crear un objeto Microwave con brand2, wattage1 (o el vataje apropiado) y power
        Microwave myMicrowave = new Microwave(brand2, wattage1, power);
        // TODO: Crear un arreglo de referencias de Appliance y almacenar ambos objetos
        Appliance[] appliances = {myWashingMachine, myMicrowave};
        // TODO: Recorrer el arreglo y para cada electrodoméstico:
        // - Imprimir su información usando getInfo()
        // - Llamar a operate()
        for (Appliance appliance : appliances) {
            System.out.println(appliance.getInfo());
            appliance.operate();
        }
    }
}
