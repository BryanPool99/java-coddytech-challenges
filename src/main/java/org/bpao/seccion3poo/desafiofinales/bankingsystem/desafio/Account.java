package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

// Clase base abstracta que representa cualquier cuenta bancaria
public abstract class Account {
    // TODO: Añade campos privados para accountNumber (String) y balance (double)
    private String accountNumber;
    private double balance;

    // TODO: Crea un constructor que inicialice accountNumber y balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // TODO: Añade getter para accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // TODO: Añade getter para balance
    public double getBalance() {
        return balance;
    }

    // TODO: Añade setter protected para balance (para que las subclases puedan modificarlo)
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // TODO: Declara el método abstracto getAccountType() que devuelve String
    public abstract String getAccountType();

    // TODO: Implementa el método getDetails()
    // Debe devolver "[accountNumber] ([accountType]): $[balance]" con el balance formateado a 2 decimales
    public String getDetails() {
        return String.format("%s (%s): $%.2f", getAccountNumber(), getAccountType(), getBalance());
    }
}
