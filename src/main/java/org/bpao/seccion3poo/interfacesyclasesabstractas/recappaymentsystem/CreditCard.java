package org.bpao.seccion3poo.interfacesyclasesabstractas.recappaymentsystem;

// TODO: Crea una clase CreditCard que implemente Payable
public class CreditCard implements Payable {
    // TODO: Añade un campo cardNumber (String) para los últimos 4 dígitos
    private String cardNumber;

    // TODO: Crea un constructor para inicializar cardNumber
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    // TODO: Implementa el método pay
    // Return format: "Paid [amount] using Credit Card ending in [cardNumber]"
    // Recuerda formatear amount con dos decimales
    @Override
    public String pay(double amount) {
        return String.format("Paid %.2f using Credit Card ending in %s", amount, this.getCardNumber());
    }
}
