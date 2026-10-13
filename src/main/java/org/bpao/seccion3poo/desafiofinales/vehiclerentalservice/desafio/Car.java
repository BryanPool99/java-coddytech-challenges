package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crear una clase que extienda Vehicle e implemente Rentable
// Añadir campo privado: seats (int)
// El constructor recibe: licensePlate, brand, dailyRate, seats
// Implementar getVehicleType() para que devuelva "Car"
// Implementar rent(): si está AVAILABLE, establecer a RENTED y devolver true; de lo contrario, devolver false
// Implementar returnVehicle(): si está RENTED, establecer a AVAILABLE y devolver true; de lo contrario, devolver false
// Implementar calculateCost(int days): devolver dailyRate * days
public class Car extends Vehicle implements Rentable {
    // TODO: Añadir campo privado para seats
    private int seats;

    // TODO: Añadir constructor
    public Car(String licensePlate, String brand, double dailyRate, int seats) {
        super(licensePlate, brand, dailyRate);
        this.seats = seats;
    }

    // TODO: Implementar getVehicleType()
    @Override
    public String getVehicleType() {
        return "Car";
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

    // TODO: Implementar calculateCost(int days)
    @Override
    public double calculateCost(int days) {
        return getDailyRate() * days;
    }
}
