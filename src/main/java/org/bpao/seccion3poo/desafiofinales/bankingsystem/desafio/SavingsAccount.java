package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

// Clase de cuenta de ahorros que extiende Account e implementa Transactable
public class SavingsAccount extends Account implements Transactable {
    // TODO: Añadir campo privado para interestRate (double)
    private double interestRate;

    // TODO: Crear constructor que reciba accountNumber, balance inicial e interestRate
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // TODO: Implementar getAccountType() para devolver "Savings"
    @Override
    public String getAccountType() {
        return "Savings";
    }

    // TODO: Implementar deposit() - sumar amount al balance y devolver true
    @Override
    public boolean deposit(double amount) {
        setBalance(getBalance() + amount);
        return false;
    }

    // TODO: Implementar withdraw() - devolver false si amount excede el balance; de lo contrario restar y devolver true
    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) return false;
        setBalance(getBalance() - amount);
        return true;
    }

    // TODO: Añadir el método applyInterest() que aumenta el balance según el porcentaje de la tasa de interés
    public void applyInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }
}
