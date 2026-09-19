package org.bpao.seccion3poo.interfacesyclasesabstractas.recappaymentsystem;

// TODO: Crea una clase PaymentProcessor
public class PaymentProcessor {
    // TODO: Implementa el método processPayment
    // Debería aceptar un objeto Payable y un amount double
    // Llama al método pay del método de pago y devuelve el resultado
    public String processPayment(Payable paymentMethod, double amount) {
        return paymentMethod.pay(amount);
    }
}
