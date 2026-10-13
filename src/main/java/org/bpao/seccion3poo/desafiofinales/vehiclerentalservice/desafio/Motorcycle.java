package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crear una clase que extienda Vehicle e implemente Rentable
// Añadir campo privado: engineCC (int)
// El constructor recibe: licensePlate, brand, dailyRate, engineCC
// Implementar getVehicleType() para que devuelva "Motorcycle"
// Implementar rent() y returnVehicle() igual que en Car
// Implementar calculateCost(int days): aplicar un 10% de descuento (multiplicar por 0.9)
public class Motorcycle extends Vehicle implements Rentable {
    // TODO: Añadir campo privado para engineCC
    private int engineCC;

    // TODO: Añadir constructor
    public Motorcycle(String licensePlate, String brand, double dailyRate, int engineCC) {
        super(licensePlate, brand, dailyRate);
        this.engineCC = engineCC;
    }

    // TODO: Implementar getVehicleType()
    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }

    // TODO: Implementar rent()
    @Override
    public boolean rent() {
        if (getStatus()==(RentalStatus.AVAILABLE)) {
            setStatus(RentalStatus.RENTED);
            return true;
        }
        return false;
    }

    // TODO: Implementar returnVehicle()
    @Override
    public boolean returnVehicle() {
        if (getStatus()==(RentalStatus.RENTED)) {
            setStatus(RentalStatus.AVAILABLE);
            return true;
        }
        return false;
    }

    // TODO: Implementar calculateCost(int days) con un 10% de descuento
    @Override
    public double calculateCost(int days) {
        return getDailyRate() * days * 0.9;
    }
}
