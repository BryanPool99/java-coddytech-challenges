package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

// Interfaz que define el contrato para operaciones financieras
public interface Transactable {
    // TODO: Declarar el método deposit que toma amount y devuelve boolean
    boolean deposit(double amount);

    // TODO: Declarar el método withdraw que toma amount y devuelve boolean
    boolean withdraw(double amount);
}
