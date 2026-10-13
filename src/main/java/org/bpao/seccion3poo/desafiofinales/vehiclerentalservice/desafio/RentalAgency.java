package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

import java.util.ArrayList;
import java.util.stream.Collectors;

// TODO: Crear una clase que gestione la flota de vehículos utilizando un ArrayList
// Implementar los siguientes métodos:
// - addVehicle(Vehicle vehicle): añade un vehículo a la flota
// - findVehicle(String licensePlate): devuelve el Vehicle o null
// - rentVehicle(String licensePlate, int days): busca el vehículo, intenta alquilarlo (cast a Rentable),
//   devuelve el coste del alquiler. Lanzar VehicleNotAvailableException si no se encuentra o si rent() devuelve false
// - returnVehicle(String licensePlate): busca y devuelve el vehículo, retornando true si tiene éxito
// - getAvailableVehicles(): devuelve un ArrayList de vehículos con estado AVAILABLE
public class RentalAgency {
    // TODO: Añadir ArrayList para almacenar vehículos
    private ArrayList<Vehicle> vehicles;

    // TODO: Añadir constructor
    public RentalAgency() {
        this.vehicles = new ArrayList<>();
    }

    // TODO: Implementar addVehicle(Vehicle vehicle)
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    // TODO: Implementar findVehicle(String licensePlate)
    public Vehicle findVehicle(String licensePlate) {
        return this.vehicles.stream()
                .filter(vehicle -> vehicle.getLicensePlate().equals(licensePlate))
                .findFirst()
                .orElse(null);
    }

    // TODO: Implementar rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException
    public double rentVehicle(String licensePlate, int days) throws VehicleNotAvailableException {
        Vehicle vehicle = findVehicle(licensePlate);
        if (vehicle==null) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        Rentable rentable = (Rentable) vehicle;
        if (!rentable.rent()) {
            throw new VehicleNotAvailableException(licensePlate);
        }
        return rentable.calculateCost(days);
    }

    // TODO: Implementar returnVehicle(String licensePlate)
    public boolean returnVehicle(String licensePlate) {
        Vehicle vehicle = findVehicle(licensePlate);
        if (vehicle==null) {
            return false;
        }
        Rentable rentable = (Rentable) vehicle;
        return rentable.returnVehicle();
    }

    // TODO: Implementar getAvailableVehicles()
    public ArrayList<Vehicle> getAvailableVehicles() {
        return this.vehicles.stream()
                .filter(vehicle -> vehicle.getStatus()==(RentalStatus.AVAILABLE))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // TODO: obtener todos los vehiculos
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
