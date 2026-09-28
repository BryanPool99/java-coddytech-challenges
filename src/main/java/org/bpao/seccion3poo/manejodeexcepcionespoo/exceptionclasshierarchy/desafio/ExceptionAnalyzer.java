package org.bpao.seccion3poo.manejodeexcepcionespoo.exceptionclasshierarchy.desafio;

public class ExceptionAnalyzer {
    // TODO: Implementa analyzeSpecific(String type)
    // Llama a ExceptionThrower.triggerRuntime(type) en un bloque try
    // Use separate catch blocks for NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException
    // Imprime: "Caught specific: [exception class simple name]"
    // Print: "Message: [exception message]"
    // Pista: Usa e.getClass().getSimpleName() y e.getMessage()
    public static void analyzeSpecific(String type) {
        // TODO: Implementa este método
        try {
            ExceptionThrower.triggerRuntime(type);
        } catch (NullPointerException nullPointerException) {
            System.out.println("Caught specific: " + nullPointerException.getClass().getSimpleName());
            System.out.println("Message: " + nullPointerException.getMessage());
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Caught specific: " + arrayIndexOutOfBoundsException.getClass().getSimpleName());
            System.out.println("Message: " + arrayIndexOutOfBoundsException.getMessage());
        } catch (IllegalArgumentException  illegalArgumentException) {
            System.out.println("Caught specific: " + illegalArgumentException.getClass().getSimpleName());
            System.out.println("Message: " + illegalArgumentException.getMessage());
        }
    }

    // TODO: Implementa analyzeWithParent()
    // Llama a ExceptionThrower.triggerArithmetic() en un bloque try
    // Catch using RuntimeException (the parent type)
    // Print: "Caught via parent: RuntimeException"
    // Imprime: "Actual type: [exception class simple name]"
    public static void analyzeWithParent() {
        // TODO: Implementa este método
        try {
            ExceptionThrower.triggerArithmetic();
        } catch (RuntimeException e) {
            System.out.println("Caught via parent: RuntimeException");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }

    // TODO: Implementa analyzeWithGrandparent()
    // Llama a ExceptionThrower.triggerGeneric() en un bloque try
    // Captura usando Exception (más alto en la jerarquía)
    // Print: "Caught via grandparent: Exception"
    // Imprime: "Actual type: [exception class simple name]"
    public static void analyzeWithGrandparent() {
        // TODO: Implementa este método
        try {
            ExceptionThrower.triggerGeneric();
        } catch (Exception e) {
            System.out.println("Caught via grandparent: Exception");
            System.out.println("Actual type: " + e.getClass().getSimpleName());
        }
    }
}
