package org.bpao.seccion3poo.genericos.boundedtypeparameters.desafio;

// TODO: Crea una clase genérica ComparableBox con múltiples límites
// El parámetro de tipo T debe extender Number E implementar Comparable<T>
public class ComparableBox<T extends Number & Comparable<T>> {
    // TODO: Declara dos campos privados de tipo T: first y second
    private T first;
    private T second;

    // TODO: Crea un constructor que acepte ambos valores
    public ComparableBox(T first, T second) {
        this.first = first;
        this.second = second;
    }
    // TODO: Implementa el método getMax()
    // Devuelve el valor mayor usando compareTo()
    public T getMax() {
        return first.compareTo(second) > 0 ? first : second;
    }
    // TODO: Implementa el método getMaxAsDouble()
    // Devuelve el valor mayor convertido a double
    public double getMaxAsDouble() {
        return getMax().doubleValue();
    }
}
