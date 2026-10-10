package org.bpao.seccion3poo.desafiofinales.bankingsystem.desafio;

// Custom exception for insufficient funds
public class InsufficientFundsException extends Exception {
    // TODO: Crear constructor que acepte la cantidad intentada y el saldo actual
    // TODO: Crear mensaje en el formato: "Insufficient funds: attempted [amount], available [balance]"
    public InsufficientFundsException(double amount, double balance) {
        // TODO: Llamar a super() con el mensaje formateado
        super(String.format("Insufficient funds: attempted %.2f, available %.2f", amount, balance));
    }
}
