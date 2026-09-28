package org.bpao.seccion3poo.manejodeexcepcionespoo.exceptionclasshierarchy.desafio;

public class ExceptionThrower {
    // TODO: Implementa triggerRuntime(String type)
    // If type is "null", throw NullPointerException with message "Null value encountered"
    // If type is "index", throw ArrayIndexOutOfBoundsException with message "Invalid index"
    // If type is "argument", throw IllegalArgumentException with message "Bad argument"
    public static void triggerRuntime(String type) {
        // TODO: Implementa este método
        switch (type) {
            case "null":
                throw new NullPointerException("Null value encountered");
            case "index":
                throw new ArrayIndexOutOfBoundsException("Invalid index");
            case "argument":
                throw new IllegalArgumentException("Bad argument");
            default:
                break;
        }
    }

    // TODO: Implementa triggerArithmetic()
    // Throw an ArithmeticException with message "Division error"
    public static void triggerArithmetic() {
        // TODO: Implementa este método
        throw new ArithmeticException("Division error");
    }

    // TODO: Implementa triggerGeneric()
    // Throw a RuntimeException with message "Generic runtime error"
    public static void triggerGeneric() {
        // TODO: Implementa este método
        throw new RuntimeException("Generic runtime error");
    }
}
