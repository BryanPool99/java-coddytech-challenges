package org.bpao.seccion3poo.genericos.boundedtypeparameters.desafio;

// TODO: Crea una clase genérica NumberStats con parámetro de tipo acotado
// El parámetro de tipo T debe extender Number
public class NumberStats<T extends Number> {
    // TODO: Declara dos campos privados de tipo T: value1 y value2
    private T value1;
    private T value2;

    // TODO: Crea un constructor que acepte ambos valores
    public NumberStats(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    // TODO: Implementa el método getSum()
    // Devuelve la suma de ambos valores como un double
    // Pista: Usa el método doubleValue() de la clase Number
    public double getSum() {
        return this.value1.doubleValue() + this.value2.doubleValue();
    }

    // TODO: Implementa el método getAverage()
    // Devuelve el promedio de los dos valores como un double
    public double getAverage() {
        return this.getSum() / 2;
    }
}
