package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringtokenizer;

import java.util.*;

/*
    Crea un método llamado analyzeTokens que procese el texto de tres maneras:

    Tokenización básica:
    Contar tokens totales
    Identificar tokens únicos
    Encontrar el token más frecuente
    Categorías de tokens (aplicadas en este orden de prioridad exacto):

    Numbers — contiene solo dígitos
    Words — contiene solo letras
    Mixed — contiene al menos una letra y al menos un dígito (independientemente de cualquier otro carácter presente)
    Special — todo lo demás (tokens que no son Numbers, Words ni Mixed)

    Estadísticas de tokens:
    Longitud promedio de token
    Token más largo
    Token más corto

    El método debe aceptar:

    Un String (text) para analizar
    Un String (delimiter) para tokenización
    Un boolean (caseSensitive) para análisis sensible a mayúsculas/minúsculas
    El formato de retorno debe ser un informe estructurado con todos los hallazgos.

    Importante: La categoría Mixed coincide con cualquier token que contenga tanto al menos una letra como al menos
     un dígito — incluso si también contiene caracteres especiales (p. ej., mixedSpecial@234 es Mixed, no Special).
     Special solo se usa cuando un token no califica como Numbers, Words ni Mixed.
*/
public class DesafioMasterTokenizadorDeCadenas {
    public static String analyzeTokens(String text, String delimiter, boolean caseSensitive) {
        // Escribe tu código aquí
        if (text==null) return "Invalid text";
        // Inicializar estructuras de datos
        Map<String, Integer> tokenCount = new HashMap<>();
        List<String> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        List<String> mixed = new ArrayList<>();
        List<String> special = new ArrayList<>();

        // Crear StringTokenizer
        StringTokenizer stringTokenizer = (delimiter==null) ?
                new StringTokenizer(text):
                new StringTokenizer(text, delimiter);

        // Procesar tokens
        int totalTokens = stringTokenizer.countTokens();
        int totalLength = 0;
        String longest = "";
        String shortest = null;
        String mostFrequent = null;
        int maxFrequency = 0;

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            String compareToken = caseSensitive ? token:token.toLowerCase();
            // Actualizar conteo de tokens
            tokenCount.merge(compareToken, 1, Integer::sum);
            if (tokenCount.get(compareToken) > maxFrequency) {
                maxFrequency = tokenCount.get(compareToken);
                mostFrequent = token;
            }
            // Actualizar estadísticas de longitud
            totalLength += token.length();
            if (token.length() > longest.length()) {
                longest = token;
            }
            if (shortest==null || token.length() < shortest.length()) {
                shortest = token;
            }

            // Categorizar token
            if (token.matches("\\d+")) {
                numbers.add(token);
            } else if (token.matches("[a-zA-Z]+")) {
                words.add(token);
            } else if (token.matches(".*[a-zA-Z].*") && token.matches(".*\\d.*")) {
                mixed.add(token);
            } else {
                special.add(token);
            }
        }
        // Construir informe
        StringBuilder report = new StringBuilder();
        report.append("Basic Analysis:\n");
        report.append("Total tokens: ").append(totalTokens).append("\n");
        report.append("Unique tokens: ").append(tokenCount.size()).append("\n");
        report.append("Most frequent: ").append(mostFrequent).append(" (").append(maxFrequency).append(" times)\n\n");

        report.append("Categories:\n");
        report.append("Numbers: ").append(numbers.size()).append(" ").append(numbers).append("\n");
        report.append("Words: ").append(words.size()).append(" ").append(words).append("\n");
        report.append("Mixed: ").append(mixed.size()).append(" ").append(mixed).append("\n");
        report.append("Special: ").append(special.size()).append(" ").append(special).append("\n\n");

        report.append("Statistics:\n");
        report.append("Average length: ").append(String.format("%.2f", (double)totalLength/totalTokens)).append("\n");
        report.append("Longest token: ").append(longest).append("\n");
        report.append("Shortest token: ").append(shortest);

        return report.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        boolean caseSensitive = scanner.nextBoolean();

        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;

        System.out.println(analyzeTokens(text, delimiter, caseSensitive));
    }
}
