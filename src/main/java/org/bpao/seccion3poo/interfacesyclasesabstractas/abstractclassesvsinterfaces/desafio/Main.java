package org.bpao.seccion3poo.interfacesyclasesabstractas.abstractclassesvsinterfaces.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String carBrand = scanner.nextLine();
        int carYear = scanner.nextInt();
        scanner.nextLine(); // consumir salto de línea
        String motorcycleBrand = scanner.nextLine();
        int motorcycleYear = scanner.nextInt();

        // TODO: Crear un Car con 4 puertas
        Car myCar = new Car(carBrand, carYear, 4);
        // TODO: Crear un Motorcycle sin sidecar (false)
        Motorcycle myMotorcycle = new Motorcycle(motorcycleBrand, motorcycleYear, false);
        // TODO: Imprimir getInfo() para ambos vehículos (demuestra el comportamiento de la clase abstracta compartida)
        System.out.println(myCar.getInfo());
        System.out.println(myMotorcycle.getInfo());
        // TODO: Imprimir startEngine() para ambos vehículos (demuestra diferentes implementaciones)
        System.out.println(myCar.startEngine());
        System.out.println(myMotorcycle.startEngine());
        // TODO: Imprimir openRoof() y closeRoof() solo para el car (demuestra la capacidad de la interfaz)
        System.out.println(myCar.openRoof());
        System.out.println(myCar.closeRoof());
    }
}
