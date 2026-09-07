package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.getterandsettermethods.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusInput = scanner.nextDouble();

        // TODO: Crear un objeto Temperature
        Temperature newTemperature = new Temperature();
        // TODO: Usar el setter para establecer el valor en celsius
        newTemperature.setCelsius(celsiusInput);
        // TODO: Imprimir si la temperatura es válida (formato: "Valid: true" o "Valid: false")
        System.out.println("Valid: " + newTemperature.isValid());
        // TODO: Imprimir el equivalente en Fahrenheit (formato: "Fahrenheit: X.X")
        // Sugerencia: Usar String.format("%.1f", value) para un lugar decimal
        System.out.println(String.format("Fahrenheit: %.1f",newTemperature.getFahrenheit()));
    }
}
