package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.recapbankaccountmanager;

public class BankAccount {
    // TODO: Declarar un número de cuenta inmutable (final)
    private final String accountNumber;
    // TODO: Declarar un saldo privado inicializado en 0.0
    private double saldo;
    // TODO: Declarar un nombre de propietario privado
    private String ownerName;

    // TODO: Crear un constructor que reciba accountNumber y ownerName
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.saldo = 0.0;
    }
    // TODO: Crear un getter para el número de cuenta

    public String getAccountNumber() {
        return this.accountNumber;
    }

    // TODO: Crear un getter para el nombre del propietario

    public String getOwnerName() {
        return this.ownerName;
    }

    // TODO: Crear un getter para el saldo

    public double getSaldo() {
        return this.saldo;
    }

    // TODO: Crear un método de depósito que devuelva true si el monto es positivo, false en caso contrario
    // Solo añadir al saldo si el monto es positivo
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.saldo += amount;
            return true;
        }
        return false;
    }

    // TODO: Crear un método de retiro que devuelva true si el monto es positivo Y existen fondos suficientes
    // Solo restar del saldo si se cumplen las condiciones
    public boolean withdraw(double amount) {
        if (amount > 0 && this.saldo >= amount) {
            this.saldo -= amount;
            return true;
        }
        return false;
    }

    // TODO: Crear el método getAccountSummary
    // Formato de retorno: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]"
    // Usar String.format("%.2f", balance) para formatear el saldo a 2 decimales
    public String getAccountSummary() {
        return String.format("Account %s | Owner: %s | Balance: $%.2f", this.getAccountNumber(), this.getOwnerName(), this.getSaldo());
    }
}
