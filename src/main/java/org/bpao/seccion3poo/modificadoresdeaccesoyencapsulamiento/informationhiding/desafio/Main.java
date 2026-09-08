package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.informationhiding.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la contraseña a establecer
        String passwordToSet = scanner.nextLine();
        // Leer el intento de contraseña para verificar
        String passwordAttempt = scanner.nextLine();

        // TODO: Crear un objeto Password con una longitud mínima de 6
        Password myPassword = new Password(6);
        // TODO: Establecer la contraseña e imprimir el resultado ("Set: true" o "Set: false")
        System.out.println("Set: " + myPassword.setPassword(passwordToSet));
        // TODO: Imprimir la contraseña enmascarada ("Masked: ******")
        System.out.println("Masked: " + myPassword.getMaskedPassword());
        // TODO: Verificar el intento de contraseña e imprimir el resultado ("Match: true" o "Match: false")
        System.out.println("Match: " + myPassword.checkPassword(passwordAttempt));
    }
}
