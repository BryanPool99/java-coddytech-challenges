package org.bpao.seccion3poo.interfacesyclasesabstractas.recappaymentsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String cardNumber = scanner.nextLine();  // Últimos 4 dígitos
        String email = scanner.nextLine();       // Correo de PayPal
        double amount = scanner.nextDouble();    // Monto del pago

        // TODO: Crea un PaymentProcessor
        PaymentProcessor myPaymentProcessor = new PaymentProcessor();
        // TODO: Crea un CreditCard con el cardNumber
        CreditCard myCreditCard = new CreditCard(cardNumber);
        // TODO: Crea una cuenta de PayPal con el email
        PayPal myPayPal = new PayPal(email);
        // TODO: Procesa el pago con CreditCard e imprime el resultado
        System.out.println(myPaymentProcessor.processPayment(myCreditCard, amount));
        // TODO: Procesa el pago con PayPal e imprime el resultado
        System.out.println(myPaymentProcessor.processPayment(myPayPal, amount));
    }
}
