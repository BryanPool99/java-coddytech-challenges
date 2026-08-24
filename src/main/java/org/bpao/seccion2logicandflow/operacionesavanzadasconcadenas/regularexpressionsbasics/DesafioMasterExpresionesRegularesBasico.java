package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.regularexpressionsbasics;

import java.util.Scanner;

/*
    Crea un método llamado validatePassword que tome un String (password) y lo valide según las siguientes reglas:

    Debe tener entre 8 y 20 caracteres de largo
    Debe contener al menos:
    Una letra mayúscula (A-Z)
    Una letra minúscula (a-z)
    Un dígito (0-9)
    Un carácter especial de (@#$%^&+=)
    No debe contener espacios

    Además, crea un segundo método llamado getPasswordStrength que tome la misma password y devuelva:

    "Weak" si apenas cumple con los requisitos mínimos
    "Medium" si es más largo que 12 caracteres y tiene al menos 2 caracteres especiales
    "Strong" si es más largo que 16 caracteres y tiene al menos 3 caracteres especiales

    Los mensajes de retorno para validatePassword deben ser:
    Si password es null: return "Invalid input"
    Si la validación pasa: return "Valid"
    Si la validación falla: return specific reason
    ("Too short", "No uppercase", "No lowercase", "No digit", "No special character", "Contains space")
*/
public class DesafioMasterExpresionesRegularesBasico {
    public static String validatePassword(String password) {
        // Escribe tu código aquí
        if (password == null) {
            return "Invalid input";
        }

        if (password.length() < 8) {
            return "Too short";
        }

        if (password.length() > 20) {
            return "Too long";
        }

        if (!password.matches(".*[A-Z].*")) {
            return "No uppercase";
        }

        if (!password.matches(".*[a-z].*")) {
            return "No lowercase";
        }

        if (!password.matches(".*[0-9].*")) {
            return "No digit";
        }

        if (!password.matches(".*[@#$%^&+=].*")) {
            return "No special character";
        }

        if (password.matches(".*\\s.*")) {
            return "Contains space";
        }

        return "Valid";
    }

    public static String getPasswordStrength(String password) {
        // Escribe tu código aquí
        int specialChars = 0;
        for (char c : password.toCharArray()) {
            if ("@#$%^&+=".indexOf(c) != -1) {
                specialChars++;
            }
        }

        if (password.length() > 16 && specialChars >= 3) {
            return "Strong";
        } else if (password.length() > 12 && specialChars >= 2) {
            return "Medium";
        } else {
            return "Weak";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.equals("null")) password = null;

        String validation = validatePassword(password);
        System.out.println(validation);

        if (validation.equals("Valid")) {
            System.out.println(getPasswordStrength(password));
        }
    }
}
