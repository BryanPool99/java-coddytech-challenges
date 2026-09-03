package org.bpao.seccion3poo.objectorientedprogramming.fieldsattributes.desafio;

public class BankAccount {
    // TODO: Crea un campo privado String 'accountName'
    private String accountName;
    // TODO: Crea un campo privado double 'balance'
    private double balance;

    // TODO: Crea un constructor que reciba accountName e initialBalance
    // Asígnalos usando 'this'
    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // TODO: Crea un getter getAccountName() que devuelva accountName
    public String getAccountName() {
        return this.accountName;
    }

    // TODO: Crea un getter getBalance() que devuelva balance
    public double getBalance() {
        return this.balance;
    }

    // TODO: Crea un método deposit(double amount)
    // Añade amount a balance si amount > 0
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // TODO: Crea un método withdraw(double amount) que devuelva un String
    // Si amount > 0 y amount <= balance, resta y devuelve "Success"
    // Otherwise return "Insufficient funds"
    public String withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return "Success";
        } else {
            return "Insufficient funds";
        }
    }
}
