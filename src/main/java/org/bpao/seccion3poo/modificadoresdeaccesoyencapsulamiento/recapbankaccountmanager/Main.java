package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.recapbankaccountmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String accountNumber = scanner.nextLine();
        String ownerName = scanner.nextLine();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();

        // TODO: Crear un objeto BankAccount con accountNumber y ownerName
        BankAccount myBankAccount = new BankAccount(accountNumber, ownerName);
        // TODO: Realizar el depósito e imprimir el resultado como "Deposit: true" o "Deposit: false"
        System.out.println("Deposit: " + myBankAccount.deposit(depositAmount));
        // TODO: Realizar el primer retiro e imprimir el resultado como "Withdraw 1: true" o "Withdraw 1: false"
        System.out.println("Withdraw 1: " + myBankAccount.withdraw(withdrawAmount1));
        // TODO: Realizar el segundo retiro e imprimir el resultado como "Withdraw 2: true" o "Withdraw 2: false"
        System.out.println("Withdraw 2: " + myBankAccount.withdraw(withdrawAmount2));
        // TODO: Imprimir el resumen de la cuenta
        System.out.println(myBankAccount.getAccountSummary());
    }
}
