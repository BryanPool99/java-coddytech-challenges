package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.regularexpressionsbasics;

import java.util.Scanner;

/*
    Crea un método llamado validateInput que toma dos argumentos:

    Una String (text) para validar
    Una String (type) que especifica el tipo de validación
    El método debe validar el texto según estos tipos:

    "number": debe contener solo dígitos (0-9)
    "word": debe contener solo letras (a-z o A-Z)
    "email": debe contener @ y al menos un carácter antes de él
    "phone": debe contener exactamente 10 dígitos
    Los mensajes de retorno deben ser:

    Si text es null: retornar "Invalid input"
    Si type es inválido: retornar "Invalid type"
    Si la validación pasa: retornar "Valid"
    Si la validación falla: retornar "Invalid"
*/
public class DesafioExpresionesRegulares {
    public static String validateInput(String text, String type) {
        // Escribe tu código aquí
        if (text==null) return "Invalid input";
        String result = "";
        if ("number".equals(type)) {
            result = text.matches("[0-9]+") ? "Valid":"Invalid";
        } else if ("word".equals(type)) {
            result = text.matches("[a-zA-Z]+") ? "Valid":"Invalid";
        } else if ("email".equals(type)) {
            result = text.matches(".+@.+") ? "Valid":"Invalid";
        } else if ("phone".equals(type)) {
            result = text.matches("[0-9]{10}") ? "Valid":"Invalid";
        } else {
            return "Invalid type";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String type = scanner.nextLine();

        if (text.equals("null")) text = null;
        System.out.println(validateInput(text, type));
    }
}
