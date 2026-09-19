package org.bpao.seccion3poo.interfacesyclasesabstractas.recappaymentsystem;

// TODO: Crea una clase PayPal que implemente Payable
public class PayPal implements Payable {
    // TODO: Añade un campo email (String)
    private String email;

    // TODO: Crea un constructor para inicializar email
    public PayPal(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    // TODO: Implementa el método pay
    // Formato de retorno: "Paid [amount] via PayPal account [email]"
    // Recuerda formatear amount con dos decimales
    @Override
    public String pay(double amount) {
        return String.format("Paid %.2f via PayPal  account %s", amount, this.getEmail());
    }
}
