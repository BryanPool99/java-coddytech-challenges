package org.bpao.seccion3poo.patronesdediseño2.adapterpattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();

        // TODO: Crea un FahrenheitSensor con el valor de entrada
        FahrenheitSensor fahrenheitSensor = new FahrenheitSensor(fahrenheit);
        // TODO: Crea un SensorAdapter que envuelva el sensor
        SensorAdapter sensorAdapter = new SensorAdapter(fahrenheitSensor);
        // TODO: Almacena el adaptador en una variable TemperatureProvider
        TemperatureProvider temperatureProvider = sensorAdapter;
        // TODO: Obtén la temperatura en Celsius e imprímela
        // Formato: "Temperature: [celsius] C" con un decimal
        // Pista: Usa String.format("%.1f", value) para el formateo
        System.out.println(String.format("Temperature: %.1f C", temperatureProvider.getTemperatureCelsius()));
    }
}
