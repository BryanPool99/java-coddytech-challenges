package org.bpao.seccion3poo.patronesdediseño2.adapterpattern.desafio;

// Clase adaptadora que hace que FahrenheitSensor sea compatible con TemperatureProvider
// TODO: Implementar la interfaz TemperatureProvider
// TODO: Envolver una instancia de FahrenheitSensor
// TODO: Convertir Fahrenheit a Celsius usando: (fahrenheit - 32) * 5 / 9
public class SensorAdapter implements TemperatureProvider {
    // TODO: Declarar un campo privado para el FahrenheitSensor
    private FahrenheitSensor fahrenheitSensor;

    // TODO: Crear un constructor que acepte un FahrenheitSensor
    public SensorAdapter(FahrenheitSensor fahrenheitSensor) {
        this.fahrenheitSensor = fahrenheitSensor;
    }

    // TODO: Implementar el método getTemperatureCelsius()
    // Recuerda leer del sensor y convertir a Celsius
    @Override
    public double getTemperatureCelsius() {
        return (this.fahrenheitSensor.readFahrenheit() - 32) * 5 / 9;
    }
}
