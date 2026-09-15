package org.bpao.seccion3poo.polimorfismo.theinstanceofoperator.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String carModel = scanner.nextLine();
        int numDoors = Integer.parseInt(scanner.nextLine());
        String motorcycleModel = scanner.nextLine();
        boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());

        // TODO: Crea un objeto Car con carModel y numDoors
        Car myCar = new Car(carModel, numDoors);
        // TODO: Crea un objeto Motorcycle con motorcycleModel y hasSidecar
        Motorcycle myMotorcycle = new Motorcycle(motorcycleModel, hasSidecar);
        // TODO: Crea un array de referencias Vehicle que contenga el Car y el Motorcycle
        Vehicle[] myVehicles = {myCar, myMotorcycle};
        // TODO: Recorre el array y para cada vehículo:
        // 1. Llama al método inspect()
        // 2. Usa instanceof para comprobar si es un Car, luego haz downcast y llama a checkDoors()
        // 3. Usa instanceof para comprobar si es un Motorcycle, luego haz downcast y llama a checkSidecar()
        for (Vehicle vehicle : myVehicles) {
            vehicle.inspect();
            if (vehicle instanceof Car car) {
                car.checkDoors();
            }
            if (vehicle instanceof Motorcycle motorcycle) {
                motorcycle.checkSidecar();
            }
        }
    }
}
