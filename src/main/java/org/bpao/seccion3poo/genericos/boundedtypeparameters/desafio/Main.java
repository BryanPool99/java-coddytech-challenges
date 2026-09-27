package org.bpao.seccion3poo.genericos.boundedtypeparameters.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        // TODO: Crea un NumberStats<Integer> con los dos valores enteros
        NumberStats<Integer> integerNumberStats = new NumberStats<>(int1, int2);
        // Imprime la suma y el promedio en el formato:
        // Integer sum: [sum]
        System.out.println("Integer sum: " + integerNumberStats.getSum());
        // Integer average: [average]
        System.out.println("Integer average: " + integerNumberStats.getAverage());

        // TODO: Crea un NumberStats<Double> con los dos valores double
        NumberStats<Double> doubleNumberStats = new NumberStats<>(double1, double2);
        // Imprime la suma y el promedio en el formato:
        // Double sum: [sum]
        // Double average: [average]
        System.out.println("Double sum: " + doubleNumberStats.getSum());
        System.out.println("Double average: " + doubleNumberStats.getAverage());
        // TODO: Crea un ComparableBox<Integer> con los dos valores enteros
        ComparableBox<Integer> integerComparableBox = new ComparableBox<>(int1, int2);
        // Imprime el máximo y el máximo como double en el formato:
        // Max integer: [max]
        // Max as double: [maxAsDouble]
        System.out.println("Max integer: " + integerComparableBox.getMax());
        System.out.println("Max as double: " + integerComparableBox.getMaxAsDouble());
    }
}
