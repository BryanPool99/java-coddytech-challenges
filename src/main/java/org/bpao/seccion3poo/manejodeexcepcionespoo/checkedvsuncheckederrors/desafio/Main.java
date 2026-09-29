package org.bpao.seccion3poo.manejodeexcepcionespoo.checkedvsuncheckederrors.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        // TODO: Test the checked exception method
        // Print: "=== Checked Exception Method ==="
        System.out.println("=== Checked Exception Method ===");
        // Llama a AgeVerifier.verifyAge(age) en un try-catch
        // - Catch InvalidAgeException: print "Checked exception caught: [message]"
        // - Catch NegativeAgeException: print "Unchecked exception caught: [message]"
        try {
            AgeVerifier.verifyAge(age);
        } catch (InvalidAgeException invalidAgeException) {
            System.out.println("Checked exception caught: " + invalidAgeException.getMessage());
        } catch (NegativeAgeException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }

        // TODO: Print a blank line, then "=== Unchecked Exception Method ==="
        System.out.println();
        System.out.println("=== Unchecked Exception Method ===");
        // Llama a AgeVerifier.verifyAgeUncheckedOnly(age) en un try-catch
        // - Catch NegativeAgeException: print "Runtime exception caught: [message]"
        // - Catch IllegalArgumentException: print "Illegal argument caught: [message]"
        try {
            AgeVerifier.verifyAgeUncheckedOnly(age);
        } catch (NegativeAgeException e) {
            System.out.println("Runtime exception caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument caught: " + e.getMessage());
        }
    }
}
