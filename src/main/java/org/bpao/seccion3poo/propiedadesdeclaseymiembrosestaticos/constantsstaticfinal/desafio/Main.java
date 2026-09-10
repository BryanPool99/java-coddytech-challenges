package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.constantsstaticfinal.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        // TODO: Calcular el área usando MathConstants.PI
        // Fórmula: PI * radio * radio
        double areaCircle = MathConstants.PI * radius * radius;
        // TODO: Calcular la circunferencia usando MathConstants.PI
        // Fórmula: 2 * PI * radio
        double longCircle = 2 * MathConstants.PI * radius;
        // TODO: Calcular el diámetro de oro usando MathConstants.GOLDEN_RATIO
        // Fórmula: 2 * radio * GOLDEN_RATIO
        double diameterCircle = 2 * radius * MathConstants.GOLDEN_RATIO;
        // TODO: Imprimir los resultados con formato de 2 decimales
        // Usar String.format("%.2f", value) para el formato
        // Formato de salida:
        // Area: [value]
        System.out.println(String.format("Area: %.2f", areaCircle));
        // Circumference: [value]
        System.out.println(String.format("Circumference: %.2f", longCircle));
        // Golden Diameter: [value]
        System.out.println(String.format("Golden Diameter: %.2f", diameterCircle));

    }
}
