package org.bpao.seccion3poo.desafiofinales.vehiclerentalservice.desafio;

// TODO: Crear una interfaz que defina las operaciones de alquiler
// Declarar los siguientes métodos:
// - rent() que devuelva un boolean
// - returnVehicle() que devuelva un boolean
// - calculateCost(int days) que devuelva un double
public interface Rentable {
    // TODO: Declarar los tres métodos
    boolean rent();

    boolean returnVehicle();

    double calculateCost(int days);
}
