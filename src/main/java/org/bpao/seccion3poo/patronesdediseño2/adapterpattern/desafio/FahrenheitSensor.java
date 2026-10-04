package org.bpao.seccion3poo.patronesdediseño2.adapterpattern.desafio;

// Clase de sensor legacy que genera la temperatura en Fahrenheit
// TODO: Crea una clase con:
// - Un campo private double para la temperatura en Fahrenheit
// - Un constructor que establece la temperatura
// - Un método readFahrenheit() que devuelve el valor almacenado
public class FahrenheitSensor {
    // TODO: Declara el campo private para la temperatura
    private double temperature;

    // TODO: Crea el constructor que acepta un parámetro double
    public FahrenheitSensor(double temperature) {
        this.temperature = temperature;
    }

    // TODO: Implementa el método readFahrenheit()
    public double readFahrenheit() {
        return this.temperature;
    }
}
