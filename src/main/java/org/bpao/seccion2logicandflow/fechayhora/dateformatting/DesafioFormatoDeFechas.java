package org.bpao.seccion2logicandflow.fechayhora.dateformatting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado formatDate que acepte tres argumentos:

    Un String (dateStr) con el formato "yyyy-MM-dd"
    Un String (inputPattern), el patrón de la fecha de entrada
    Un String (outputPattern), el patrón de salida deseado

    El método debe:
    Analizar la fecha de entrada usando el patrón de entrada
    Formatearla usando el patrón de salida
    Gestionar estos patrones:
    "basic": "yyyy-MM-dd"
    "long": "MMMM d, yyyy"
    "short": "MM/dd/yy"
    "custom": La cadena de patrón real
    Los mensajes que se deben devolver son:

    Si la fecha no es válida: devolver "Invalid date format"
    Si el patrón no es válido: devolver "Invalid pattern"
    Si la operación tiene éxito: devolver la fecha formateada
*/
public class DesafioFormatoDeFechas {
    public static String formatDate(String dateStr, String inputPattern, String outputPattern) {
        // Escribe tu código aquí
        try {
            String inPattern = switch(inputPattern) {
                case "basic" -> "yyyy-MM-dd";
                case "long" -> "MMMM d, yyyy";
                case "short" -> "MM/dd/yy";
                default -> inputPattern;
            };

            String outPattern = switch(outputPattern) {
                case "basic" -> "yyyy-MM-dd";
                case "long" -> "MMMM d, yyyy";
                case "short" -> "MM/dd/yy";
                default -> outputPattern;
            };

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inPattern);
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern(outPattern);

            LocalDate date = LocalDate.parse(dateStr, inputFormatter);
            return date.format(outputFormatter);

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        } catch (IllegalArgumentException e) {
            return "Invalid pattern";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        String inputPattern = scanner.nextLine();
        String outputPattern = scanner.nextLine();

        System.out.println(formatDate(dateStr, inputPattern, outputPattern));
    }
}
