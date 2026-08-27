package org.bpao.seccion2logicandflow.fechayhora.localdatebasics;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado processDate que reciba tres argumentos:

    Un String (dateStr) en formato "yyyy-MM-dd"
    Un entero (days) para sumar o restar
    Un String (operation) ya sea "add" o "subtract"
    El método debe:

    Analizar la cadena de fecha de entrada
    Sumar o restar el número especificado de días
    Devolver información formateada sobre el resultado
    Los mensajes de retorno deben ser:

    Si el formato de fecha es inválido: devolver "Invalid date format"
    Si la operación es inválida: devolver "Invalid operation"
    En caso de éxito: devolver "Original: [date], New: [new_date], Day of week: [day_name]"
*/
public class DesafioFundamentosDeLocalDate {
    public static String processDate(String dateStr, int days, String operation) {
        // Escribe tu código
        try {
            LocalDate date = LocalDate.parse(dateStr);
            LocalDate newDate;

            switch (operation.toLowerCase()) {
                case "add":
                    newDate = date.plusDays(days);
                    break;
                case "subtract":
                    newDate = date.minusDays(days);
                    break;
                default:
                    return "Invalid operation";
            }

            return String.format("Original: %s, New: %s, Day of week: %s",
                    date, newDate, newDate.getDayOfWeek());

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        System.out.println(processDate(dateStr, days, operation));
    }
}
