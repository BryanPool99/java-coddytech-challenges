package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Crear una instancia de RentalAgency
        RentalAgency agency = new RentalAgency();

        // TODO: Dividir la entrada por comas para obtener los comandos individuales
        String[] commands = input.split(",");
        // TODO: Procesar cada comando:
        // ADD_CAR:licensePlate:brand:dailyRate:seats -> imprimir "Added: [brand] ([vehicleType])"
        // ADD_MOTORCYCLE:licensePlate:brand:dailyRate:engineCC -> imprimir "Added: [brand] ([vehicleType])"
        // RENT:licensePlate:days -> imprimir "Rented [licensePlate] for [days] days - Total: $[cost]" (2 decimales)
        //                           o "Error: [exception message]" si se lanza una excepción
        // RETURN:licensePlate -> imprimir "Returned: [licensePlate]" o "Return failed: [licensePlate]"
        // AVAILABLE -> imprimir "Available vehicles:" seguido de los detalles de cada vehículo disponible
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];

            if (action.equals("ADD_CAR")) {
                String licensePlate = parts[1];
                String brand = parts[2];
                double dailyRate = Double.parseDouble(parts[3]);
                int seats = Integer.parseInt(parts[4]);
                Car car = new Car(licensePlate, brand, dailyRate, seats);
                agency.addVehicle(car);
                System.out.println("Added: " + brand + " (" + car.getVehicleType() + ")");
            } else if (action.equals("ADD_MOTORCYCLE")) {
                String licensePlate = parts[1];
                String brand = parts[2];
                double dailyRate = Double.parseDouble(parts[3]);
                int engineCC = Integer.parseInt(parts[4]);
                Motorcycle motorcycle = new Motorcycle(licensePlate, brand, dailyRate, engineCC);
                agency.addVehicle(motorcycle);
                System.out.println("Added: " + brand + " (" + motorcycle.getVehicleType() + ")");
            } else if (action.equals("RENT")) {
                String licensePlate = parts[1];
                int days = Integer.parseInt(parts[2]);
                try {
                    double cost = agency.rentVehicle(licensePlate, days);
                    System.out.printf("Rented %s for %d days - Total: $%.2f%n", licensePlate, days, cost);
                } catch (VehicleNotAvailableException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (action.equals("RETURN")) {
                String licensePlate = parts[1];
                boolean success = agency.returnVehicle(licensePlate);
                if (success) {
                    System.out.println("Returned: " + licensePlate);
                } else {
                    System.out.println("Return failed: " + licensePlate);
                }
            } else if (action.equals("AVAILABLE")) {
                System.out.println("Available vehicles:");
                ArrayList<Vehicle> available = agency.getAvailableVehicles();
                for (Vehicle v : available) {
                    System.out.println(v.getDetails());
                }
            }
        }

        // TODO: Después de todos los comandos, imprimir "--- Fleet Summary ---"
        System.out.println("--- Fleet Summary ---");

        // seguido de los detalles de cada vehículo
        ArrayList<Vehicle> allVehicles = agency.getVehicles();
        for (Vehicle v : allVehicles) {
            System.out.println(v.getDetails());
        }
    }
}
