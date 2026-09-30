package org.bpao.seccion3poo.patronesdediseño1.introtodesignpatterns.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternName = scanner.nextLine();

        // TODO: Declara una variable de tipo Pattern (la interfaz)
        Pattern pattern = null;

        // TODO: Basándote en patternName, crea el objeto de patrón apropiado:
        // - "Singleton" y "Factory" son patrones creacionales
        // - "Adapter" y "Decorator" son patrones estructurales
        // - "Observer" y "Strategy" son patrones de comportamiento
        if (patternName.equals("Singleton") || patternName.equals("Factory")) {
            pattern = new PatterInfo.CreationalPattern();
        } else if (patternName.equals("Adapter") || patternName.equals("Decorator")) {
            pattern = new PatterInfo.StructuralPattern();
        } else if (patternName.equals("Observer") || patternName.equals("Strategy")) {
            pattern = new PatterInfo.BehavioralPattern();
        }
        // TODO: Imprime la salida en el siguiente formato:
        // Pattern: [nombre del patrón de entrada]
        // Category: [categoría de getCategory()]
        // Purpose: [propósito de getPurpose()]
        System.out.println("Pattern: " + patternName);
        System.out.println("Category: " + pattern.getCategory());
        System.out.println("Purpose: " + pattern.getPurpose());
    }
}
