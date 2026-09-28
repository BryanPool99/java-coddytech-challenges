package org.bpao.seccion3poo.manejodeexcepcionespoo.exceptionclasshierarchy.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        // TODO: Print "=== Specific Catch ===" and call ExceptionAnalyzer.analyzeSpecific(type)
        System.out.println("=== Specific Catch ===");
        ExceptionAnalyzer.analyzeSpecific(type);
        // TODO: Imprime una línea en blanco, luego "=== Parent Catch ===", luego llama a ExceptionAnalyzer.analyzeWithParent()
        System.out.println();
        System.out.println("=== Parent Catch ===");
        ExceptionAnalyzer.analyzeWithParent();
        // TODO: Print a blank line, then "=== Grandparent Catch ===", then call ExceptionAnalyzer.analyzeWithGrandparent()
        System.out.println();
        System.out.println("=== Grandparent Catch ===");
        ExceptionAnalyzer.analyzeWithGrandparent();
    }
}
