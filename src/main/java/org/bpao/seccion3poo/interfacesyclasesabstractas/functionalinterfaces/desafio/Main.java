package org.bpao.seccion3poo.interfacesyclasesabstractas.functionalinterfaces.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String operation = scanner.nextLine();

        TextProcessor processor;

        // TODO: Basado en el tipo de operación, crea un TextProcessor con la lambda apropiada:
        // - "upper": transforma el texto a mayúsculas
        // - "lower": transforma el texto a minúsculas
        // - "reverse": invierte el texto (pista: usa StringBuilder)
        if ("upper".equals(operation)) {
            processor = new TextProcessor(s -> s.toUpperCase());
        } else if ("lower".equals(operation)) {
            processor = new TextProcessor(s -> s.toLowerCase());
        } else {
            processor = new TextProcessor(s -> new StringBuilder(s).reverse().toString());
        }
        // TODO: Llama a process() con el texto de entrada e imprime el resultado
        // Formato de salida: "Result: [transformed text]"
        System.out.println("Result: " + processor.process(text));
    }
}
