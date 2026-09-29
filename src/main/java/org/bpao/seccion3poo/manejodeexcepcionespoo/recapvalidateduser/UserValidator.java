package org.bpao.seccion3poo.manejodeexcepcionespoo.recapvalidateduser;
// UserValidator.java
// Una sesión de validación que implementa AutoCloseable

// TODO: Crea una clase llamada UserValidator que implemente AutoCloseable
public class UserValidator implements AutoCloseable {
    // TODO: El constructor debe imprimir "Validator session started"
    public UserValidator() {
        // TODO: Implementar
        System.out.println("Validator session started");
    }

    // TODO: Implementar el método validateUsername
    // - Lanza InvalidUsernameException si username es null, está vacío o tiene menos de 3 caracteres
    //   con el mensaje "Username must be at least 3 characters"
    // - De lo contrario, imprime "Username '[username]' is valid"
    public void validateUsername(String username) throws InvalidUsernameException {
        // TODO: Implementar la lógica de validación
        if (username==null || username.length() < 3) {
            throw new InvalidUsernameException("Username must be at least 3 characters");
        } else {
            System.out.println(String.format("Username '%s' is valid", username));
        }
    }

    // TODO: Implementar el método validateAge
    // - Lanza InvalidAgeException si age es negativo con el mensaje "Age cannot be negative: [age]"
    // - Lanza ValidationException si age es menor de 13 con el mensaje "Must be at least 13 years old"
    // - De lo contrario, imprime "Age [age] is valid"
    public void validateAge(int age) throws ValidationException {
        // TODO: Implementar la lógica de validación
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        } else if (age < 13) {
            throw new ValidationException("Must be at least 13 years old");
        } else {
            System.out.println("Age " + age + " is valid");
        }
    }

    // TODO: Implementar el método close para imprimir "Validator session closed"
    @Override
    public void close() {
        // TODO: Implementar
        System.out.println("Validator session closed");
    }
}
