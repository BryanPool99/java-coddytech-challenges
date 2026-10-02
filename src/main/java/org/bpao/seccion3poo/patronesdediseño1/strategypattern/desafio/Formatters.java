package org.bpao.seccion3poo.patronesdediseño1.strategypattern.desafio;

// TODO: Implementa tres clases formateadoras concretas que implementen TextFormatter
public class Formatters {
    // UpperCaseFormatter - transforma el texto a todo mayúsculas
    static class UpperCaseFormatter implements TextFormatter {
        // TODO: Implementa el método format
        @Override
        public String format(String text) {
            return text.toUpperCase();
        }
    }

    // LowerCaseFormatter - transforma el texto a todo minúsculas
    static class LowerCaseFormatter implements TextFormatter {
        // TODO: Implementa el método format
        @Override
        public String format(String text) {
            return text.toLowerCase();
        }
    }

    // TitleCaseFormatter - capitaliza la primera letra de cada palabra, el resto en minúsculas
    static class TitleCaseFormatter implements TextFormatter {
        // TODO: Implementa el método format
        // Hint: Las palabras están separadas por espacios
        @Override
        public String format(String text) {
            if (text == null || text.trim().isEmpty()) {
                return "";
            }
            // El regex "\\s+" maneja múltiples espacios seguidos correctamente
            String[] words = text.split("\\s+");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                if (!word.isEmpty()) {
                    // Capitaliza la primera letra y une el resto en minúsculas
                    String capitalizedWord = word.substring(0, 1).toUpperCase() +
                                             word.substring(1).toLowerCase();

                    result.append(capitalizedWord).append(" ");
                }
            }

            // Elimina el espacio final extra antes de devolver el resultado
            return result.toString().trim();
        }
    }
}
