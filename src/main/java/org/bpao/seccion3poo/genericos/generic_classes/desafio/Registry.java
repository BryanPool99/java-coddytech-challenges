package org.bpao.seccion3poo.genericos.generic_classes.desafio;

// Clase genérica con dos parámetros de tipo que empareja un destinatario con su regalo
public class Registry<K, V> {
    // TODO: Declara el campo privado 'recipient' de tipo K
    private K recipient;
    // TODO: Declara el campo privado 'gift' de tipo V
    private V gift;

    // TODO: Crea un constructor que acepte ambos valores
    public Registry(K recipient, V gift) {
        this.recipient = recipient;
        this.gift = gift;
    }
    // TODO: Implementa el método getRecipient()

    public K getRecipient() {
        return recipient;
    }

    // TODO: Implementa el método getGift()

    public V getGift() {
        return gift;
    }

    // TODO: Implementa el método getEntry() que devuelve:
    // "[recipient] -> [gift]"
    public String getEntry() {
        return String.format("%s -> %s", this.getRecipient(), this.getGift());
    }
}
