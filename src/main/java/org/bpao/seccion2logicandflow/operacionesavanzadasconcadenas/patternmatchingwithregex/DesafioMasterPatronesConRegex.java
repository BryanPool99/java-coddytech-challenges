package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.patternmatchingwithregex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Crea un método llamado analyzeText que tome un String (text) y
    realice un análisis avanzado de coincidencias de patrones. El método debe:

    Contar y categorizar todas las palabras en:
    Palabras simples (solo letras)
    Números (enteros y decimales)
    Direcciones de email (contiene @ y dominio)
    URLs (comienza con http:// o https://)
    Para cada categoría, devolver:
    El conteo de coincidencias
    La posición de la primera ocurrencia
    El contenido coincidente real (hasta 3 elementos)

    El formato de retorno debe ser:
    Category: count, positions: [pos1, pos2, ...], found: [item1, item2, ...]

    Adicionalmente, crea un método validateMatches que tome un String (text) y devuelva true si:

    Todas las direcciones de email terminan con .com, .org o .net
    Todas las URLs son seguras (https://)
    Todos los números son positivos
    Todas las palabras tienen al menos 3 caracteres de largo
    Los mensajes de retorno deben ser:

    Si text es null: return "Invalid input"
    Si text está vacío: return "Empty text"
    Si no se encuentran coincidencias: return "No matches found"
*/
public class DesafioMasterPatronesConRegex {
    public static String analyzeText(String text) {
        // Escribe tu código aquí
        if (text==null) return "Invalid input";
        if (text.isEmpty()) return "Empty text";

        StringBuilder result = new StringBuilder();
        //Patrones a usar
        Pattern wordPattern = Pattern.compile("\\\\b[a-zA-Z]+\\\\b");//para palabras
        Pattern numberPattern = Pattern.compile("\\b\\d+(\\.\\d+)?\\b");//para numeros
        Pattern emailPattern = Pattern.compile("\\b[\\w.-]+@[\\w.-]+\\.[\\w.-]+\\b");//para correo
        Pattern urlPattern = Pattern.compile("https?://[\\w.-]+\\.[\\w.-]+\\b");//para url
        // Categorías
        analyzePattern(text, wordPattern, "Words", result);
        analyzePattern(text, numberPattern, "Numbers", result);
        analyzePattern(text, emailPattern, "Emails", result);
        analyzePattern(text, urlPattern, "URLs", result);

        return result.length() > 0 ? result.toString():"No matches found";
    }

    private static void analyzePattern(String text, Pattern pattern, String category, StringBuilder result) {
        Matcher matcher = pattern.matcher(text);
        List<Integer> positions = new ArrayList<>();
        List<String> matches = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            count++;
            if (positions.size() < 3) {
                positions.add(matcher.start());
                matches.add(matcher.group());
            }
        }

        if (count > 0) {
            if (result.length() > 0) {
                result.append("\n");
            }
            result.append(category).append(": ")
                    .append(count).append(", positions: ")
                    .append(positions).append(", found: ")
                    .append(matches);
        }
    }

    public static boolean validateMatches(String text) {
        // Escribe tu código aquí
        if (text==null || text.isEmpty()) return false;
        //Validar correos
        Pattern emailPattern = Pattern.compile("\\b[\\w.-]+@[\\w.-]+\\.(com|org|net)\\b");
        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            if (!emailMatcher.group().matches(".*\\.(com|org|net)$")) {
                return false;
            }
        }
        // Validar URLs
        Pattern urlPattern = Pattern.compile("http://.*");
        if (urlPattern.matcher(text).find()) {
            return false;
        }

        // Validar números
        Pattern numberPattern = Pattern.compile("-\\d+(\\.\\d+)?");
        if (numberPattern.matcher(text).find()) {
            return false;
        }

        // Validar palabras
        Pattern wordPattern = Pattern.compile("\\b[a-zA-Z]{1,2}\\b");
        if (wordPattern.matcher(text).find()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text.equals("null")) text = null;

        System.out.println(analyzeText(text));
        System.out.println(validateMatches(text));
    }
}
