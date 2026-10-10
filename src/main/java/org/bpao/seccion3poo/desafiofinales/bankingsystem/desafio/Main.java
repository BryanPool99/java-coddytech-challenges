package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Crea una instancia de Bank
        Bank bank = new Bank();

        // TODO: Separa la entrada por comas para obtener los comandos individuales
        String[] commands = input.split(",");

        // TODO: Procesa cada comando:
        // - SAVINGS:accountNumber:balance:interestRate -> Create SavingsAccount, print "Account created: [accountNumber]"
        // - CHECKING:accountNumber:balance:overdraftLimit -> Create CheckingAccount, print "Account created: [accountNumber]"
        // - DEPOSIT:accountNumber:amount -> Deposita e imprime "Deposited $[amount] to [accountNumber]"
        // - WITHDRAW:accountNumber:amount -> Withdraw and print success or "Withdrawal failed: [accountNumber]"
        // - TRANSFER:fromAccount:toAccount:amount -> Transfiere e imprime éxito o "Transfer failed: [exception message]"
        // - INTEREST:accountNumber -> Apply interest and print "Interest applied to [accountNumber]"
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];

            switch (action) {
                case "SAVINGS": {
                    String accountNumber = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    double interestRate = Double.parseDouble(parts[3]);
                    SavingsAccount savings = new SavingsAccount(accountNumber, balance, interestRate);
                    bank.addAccount(savings);
                    System.out.println("Account created: " + accountNumber);
                    break;
                }
                case "CHECKING": {
                    String accountNumber = parts[1];
                    double balance = Double.parseDouble(parts[2]);
                    double overdraftLimit = Double.parseDouble(parts[3]);
                    CheckingAccount checking = new CheckingAccount(accountNumber, balance, overdraftLimit);
                    bank.addAccount(checking);
                    System.out.println("Account created: " + accountNumber);
                    break;
                }
                case "DEPOSIT": {
                    String accountNumber = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof Transactable) {
                        ((Transactable) account).deposit(amount);
                        System.out.printf("Deposited $%.2f to %s%n", amount, accountNumber);
                    }
                    break;
                }
                case "WITHDRAW": {
                    String accountNumber = parts[1];
                    double amount = Double.parseDouble(parts[2]);
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof Transactable) {
                        boolean success = ((Transactable) account).withdraw(amount);
                        if (success) {
                            System.out.printf("Withdrew $%.2f from %s%n", amount, accountNumber);
                        } else {
                            System.out.println("Withdrawal failed: " + accountNumber);
                        }
                    }
                    break;
                }
                case "TRANSFER": {
                    String fromAccount = parts[1];
                    String toAccount = parts[2];
                    double amount = Double.parseDouble(parts[3]);
                    try {
                        String result = bank.transfer(fromAccount, toAccount, amount);
                        System.out.println(result);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Transfer failed: " + e.getMessage());
                    }
                    break;
                }
                case "INTEREST": {
                    String accountNumber = parts[1];
                    Account account = bank.findAccount(accountNumber);
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).applyInterest();
                        System.out.println("Interest applied to " + accountNumber);
                    }
                    break;
                }
            }
        }

        // TODO: Después de todos los comandos, imprime "--- Bank Summary ---"
        System.out.println("--- Bank Summary ---");

        // TODO: Imprime los detalles de cada cuenta usando getDetails()
        for (Account account : bank.getAccounts()) {
            System.out.println(account.getDetails());
        }

        // TODO: Print "Total deposits: $[total]" formatted to 2 decimal places
        System.out.printf("Total deposits: $%.2f%n", bank.getTotalDeposits());
    }
}
