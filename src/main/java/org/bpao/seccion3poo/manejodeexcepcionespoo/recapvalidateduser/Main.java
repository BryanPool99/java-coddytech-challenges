package org.bpao.seccion3poo.manejodeexcepcionespoo.recapvalidateduser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String username = scanner.nextLine();
        int age = scanner.nextInt();

        // TODO: Usa try-with-resources para crear un UserValidator
        // Dentro del bloque try:
        //   1. Valida el username
        //   2. Valida el age
        //   3. Si ambos pasan, imprime "User registration successful!"
        try (UserValidator userValidator = new UserValidator()) {
            userValidator.validateUsername(username);
            userValidator.validateAge(age);
            System.out.println("User registration successful!");
        }
        // TODO: Captura InvalidUsernameException e imprime "Username error: [message]"
        catch (InvalidUsernameException invalidUsernameException) {
            System.out.println("Username error: " + invalidUsernameException.getMessage());
        }
        // TODO: Captura InvalidAgeException e imprime "Age error: [message]"
        catch (InvalidAgeException invalidAgeException) {
            System.out.println("Age error: " + invalidAgeException.getMessage());
        }
        // TODO: Captura ValidationException (padre) e imprime "Validation error: [message]"
        catch (ValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        // Note: ¡El validador debe cerrarse automáticamente independientemente del éxito o el fracaso!
    }
}
