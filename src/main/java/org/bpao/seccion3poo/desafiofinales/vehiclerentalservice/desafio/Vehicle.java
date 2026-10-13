package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crear una clase base abstracta para todos los vehículos
// Campos privados: licensePlate (String), brand (String), dailyRate (double), status (RentalStatus)
// status debe inicializarse como AVAILABLE
// El constructor recibe: licensePlate, brand, dailyRate
// Incluye getters para todos los campos y un setter para status
// Declara el método abstracto: getVehicleType() que devuelve String
// Implementa getDetails() devolviendo: "[licensePlate] [brand] ([vehicleType]) - $[dailyRate]/day - [status description]"
// Formatea dailyRate a 2 decimales
public abstract class Vehicle {
    // TODO: Añadir campos privados
    private String licensePlate;
    private String brand;
    private double dailyRate;
    private RentalStatus status;

    // TODO: Añadir constructor
    public Vehicle(String licensePlate, String brand, double dailyRate) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.dailyRate = dailyRate;
        this.status = RentalStatus.AVAILABLE;
    }

    // TODO: Añadir getters y setter para status
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public RentalStatus getStatus() {
        return status;
    }

    public void setStatus(RentalStatus status) {
        this.status = status;
    }

    // TODO: Declarar el método abstracto getVehicleType()
    public abstract String getVehicleType();

    // TODO: Implementar el método getDetails()
    public String getDetails() {
        return String.format("%s %s (%s) - $%.2f/day - %s", getLicensePlate(), getBrand(), getVehicleType(), getDailyRate(), getStatus().getDescription());
    }
}
