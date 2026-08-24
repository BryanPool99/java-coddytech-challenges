package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.patternmatchingwithregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Crea un método llamado findWords que tome dos argumentos:

    Un String (text) en el que buscar
    Un String (word) a encontrar
    El método debe:

    Usar Pattern y Matcher para encontrar todas las ocurrencias de la palabra
    Devolver una cadena que contenga las posiciones donde se encontró la palabra
    Las posiciones deben estar separadas por espacios
    Los mensajes de retorno deben ser:

    Si algún input es null: return "Invalid input"
    Si la palabra no se encuentra: return "Not found"
    Si se encuentra: devolver posiciones (p. ej., "4 10 15")
*/
public class DesafioPatronesConRegex {
    public static String findWords(String text, String word) {
        // Escribe tu código aquí
        if (text==null || word==null) return "Invalid input";
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        boolean found = false;
        while (matcher.find()) {
            found = true;
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(matcher.start());
        }
        return found ? result.toString():"Not found";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();

        if (text.equals("null")) text = null;
        if (word.equals("null")) word = null;

        System.out.println(findWords(text, word));
    }
}
