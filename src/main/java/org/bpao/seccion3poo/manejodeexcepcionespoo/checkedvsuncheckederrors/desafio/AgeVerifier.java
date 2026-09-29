package org.bpao.seccion3poo.manejodeexcepcionespoo.checkedvsuncheckederrors.desafio;

// AgeVerifier.java
// Contains methods that demonstrate checked vs unchecked exceptions
public class AgeVerifier {
    // TODO: Implementar verifyAge(int age)
    // - Lanza NegativeAgeException (no comprobada) si age < 0
    //   Message: "Age cannot be negative: [age]"
    // - Lanza InvalidAgeException (comprobada) si age < 18
    //   Message: "Must be 18 or older: [age]"
    // - Otherwise prints: "Age [age] verified successfully"
    // IMPORTANT: Debe declarar "throws InvalidAgeException" ya que es comprobada!
    public static void verifyAge(int age) throws NegativeAgeException, InvalidAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        } else if (age < 18) {
            throw new InvalidAgeException("Must be 18 or older: " + age);
        } else {
            System.out.println("Age " + age + " verified successfully");
        }
    }

    // TODO: Implementar verifyAgeUncheckedOnly(int age)
    // - Lanza NegativeAgeException si age < 0
    //   Message: "Age cannot be negative: [age]"
    // - Throws IllegalArgumentException if age < 18
    //   Mensaje: "Too young: [age]"
    // - Otherwise prints: "Age [age] verified (unchecked method)"
    // NOTE: No se necesita declaración throws - ¡todas las excepciones son no comprobadas!
    public static void verifyAgeUncheckedOnly(int age) {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative: " + age);
        } else if (age < 18) {
            throw new IllegalArgumentException("Too young: " + age);
        } else {
            System.out.println("Age " + age + " verified (unchecked method)");
        }
    }
}
