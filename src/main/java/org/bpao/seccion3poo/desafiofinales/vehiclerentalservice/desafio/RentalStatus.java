package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crear un enum que represente el estado de alquiler de un vehículo
// Incluir valores: AVAILABLE, RENTED, MAINTENANCE
// Añadir un campo privado 'description' (String)
// Añadir un constructor que reciba la descripción
// Añadir un getter para description
// Descripciones: AVAILABLE="ready to rent", RENTED="currently in use", MAINTENANCE="under service"
public enum RentalStatus {
    // TODO: Definir los valores del enum con descripciones
    AVAILABLE("ready to rent"),
    RENTED("currently in use"),
    MAINTENANCE("under service");

    // TODO: Añadir un campo privado para description
    private String description;

    // TODO: Añadir el constructor
    private RentalStatus(String description) {
        this.description = description;
    }

    // TODO: Añadir el getter para description
    public String getDescription() {
        return description;
    }
}
