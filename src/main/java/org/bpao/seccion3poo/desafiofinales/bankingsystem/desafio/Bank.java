package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

import java.util.ArrayList;

// Clase Bank que gestiona cuentas
public class Bank {
    // TODO: Añadir ArrayList para almacenar cuentas
    private ArrayList<Account> accounts;

    // TODO: Crear constructor que inicializa el ArrayList
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    // TODO: Implementar addAccount(Account account) - añade la cuenta al banco
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    // TODO: Implementar findAccount(String accountNumber) - devuelve Account o null si no se encuentra
    public Account findAccount(String accountNumber) {
        return this.accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElse(null);
    }

    // TODO: Implementar transfer(String fromAccount, String toAccount, double amount)
    // Debe lanzar InsufficientFundsException si la fuente no tiene fondos suficientes
    // En caso de éxito, devolver "Transferred $[amount] from [fromAccount] to [toAccount]"
    public String transfer(String fromAccount, String toAccount, double amount) throws InsufficientFundsException {
        Account source = findAccount(fromAccount);
        Account destination = findAccount(toAccount);
        if (source instanceof Transactable && destination instanceof Transactable) {
            Transactable sourceTransactable = (Transactable) source;
            Transactable destTransactable = (Transactable) destination;

            if (!sourceTransactable.withdraw(amount)) {
                throw new InsufficientFundsException(amount, source.getBalance());
            }
            destTransactable.deposit(amount);
            return String.format("Transferred $%.2f from %s to %s", amount, fromAccount, toAccount);
        }
        return null;
    }

    // TODO: Implement getTotalDeposits() - returns sum of all account balances
    public double getTotalDeposits() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    // TODO: Añadir método para obtener todas las cuentas para imprimir el resumen

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
