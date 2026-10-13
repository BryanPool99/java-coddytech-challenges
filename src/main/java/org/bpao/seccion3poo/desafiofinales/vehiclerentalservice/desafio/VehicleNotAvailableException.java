package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crea una excepción personalizada que extienda de Exception
// El constructor debe aceptar una matrícula (String)
// Crea un mensaje con el formato: "Vehicle not available: [licensePlate]"
public class VehicleNotAvailableException extends Exception {
    public VehicleNotAvailableException(String licensePlate) {
        super("Vehicle not available: " + licensePlate);
    }
}
