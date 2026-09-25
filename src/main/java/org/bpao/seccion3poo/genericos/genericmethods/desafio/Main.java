package org.bpao.seccion3poo.genericos.genericmethods.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        // TODO: Crea un array String[] que contenga ambas palabras
        String[] words = {firstWord, secondWord};
        // TODO: Usa ArrayUtils.getLast para obtener el último elemento
        // Imprime: "Last word: [result]"
        System.out.println("Last word: " + ArrayUtils.getLast(words));
        // TODO: Crea un array Integer[] que contenga ambos números
        Integer[] numbers = {firstNumber, secondNumber};
        // TODO: Llama a ArrayUtils.swap para intercambiar los elementos en los índices 0 y 1
        // Imprime: "After swap: [first], [second]"
        ArrayUtils.swap(numbers, 0, 1);
        System.out.println("After swap: " + numbers[0] + ", " + numbers[1]);
        // TODO: Llama a ArrayUtils.printWithLabel con firstWord como label y firstNumber como value
        ArrayUtils.printWithLabel(firstWord, firstNumber);
        // TODO: Llama a ArrayUtils.printWithLabel con firstNumber como label y secondWord como value
        ArrayUtils.printWithLabel(firstNumber, secondWord);
    }
}
