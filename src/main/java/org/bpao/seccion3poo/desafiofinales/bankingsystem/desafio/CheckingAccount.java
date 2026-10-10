package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

// Clase de cuenta corriente que extiende Account e implementa Transactable
public class CheckingAccount extends Account implements Transactable {
    // TODO: Añadir campo privado para overdraftLimit (double)
    private double overdraftLimit;

    // TODO: Crear constructor que tome accountNumber, saldo inicial y overdraftLimit
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    // TODO: Implementar getAccountType() para devolver "Checking"

    @Override
    public String getAccountType() {
        return "Checking";
    }

    // TODO: Implementar deposit() - sumar amount y devolver true
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }

    // TODO: Implementar withdraw() - permitir si amount <= balance + overdraftLimit, devolver false en caso contrario
    @Override
    public boolean withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
}
