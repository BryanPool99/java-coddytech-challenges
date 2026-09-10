package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.recapcounterandutility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = scanner.nextInt();

        // TODO: Usa los métodos estáticos de MathUtils para calcular e imprimir:
        // - Cuadrado: [value]
        System.out.println("Cuadrado: " + MathUtils.square(number));
        // - Cubo: [value]
        System.out.println("Cubo: " + MathUtils.cube(number));
        // - Circle area (radius=[number]): [value] (formatted to 2 decimal places)
        System.out.println(String.format("Circle area (radius=%d): %.2f", number, MathUtils.circleArea(number)));
        // TODO: Crea una cantidad 'count' de objetos Counter
        // Por cada Counter creado, imprime: Counter [id] created
        for (int i = 0; i < count; i++) {
            Counter newCount = new Counter();
            System.out.println(String.format("Counter %d created", newCount.getId()));
        }
        // TODO: Imprime el número total de contadores creados
        // Total counters: [count]
        System.out.println(String.format("Total counters: %d", Counter.getTotalCount()));
    }
}
