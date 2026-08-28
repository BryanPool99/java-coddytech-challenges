package org.bpao.seccion2logicandflow.fechayhora.localdatetimeusage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado processDateTime que tome cuatro argumentos:

    Un String (dateTimeStr) en formato "yyyy-MM-dd HH:mm"
    Un entero (amount) para agregar o restar
    Un String (unit) ya sea "hours", "days" o "months"
    Un String (operation) ya sea "add" o "subtract"
    El método debe:

    Analizar la cadena de fecha y hora de entrada
    Realizar la operación especificada
    Devolver información formateada sobre el resultado
    Los mensajes de retorno deben ser:

    Si el formato es inválido: devolver "Invalid date time format"
    Si la unidad es inválida: devolver "Invalid unit"
    Si la operación es inválida: devolver "Invalid operation"
    Para éxito: devolver "Original: [datetime], New: [new_datetime], Day: [day_name]"
*/
public class DesafioUsoDeLocalDateTime {
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
        // Escribe tu código aquí
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, formatter);
            LocalDateTime newDateTime;

            if (!unit.equals("hours") && !unit.equals("days") && !unit.equals("months")) {
                return "Invalid unit";
            }

            switch (operation.toLowerCase()) {
                case "add":
                    newDateTime = switch (unit) {
                        case "hours" -> dateTime.plusHours(amount);
                        case "days" -> dateTime.plusDays(amount);
                        case "months" -> dateTime.plusMonths(amount);
                        default -> dateTime;
                    };
                    break;
                case "subtract":
                    newDateTime = switch (unit) {
                        case "hours" -> dateTime.minusHours(amount);
                        case "days" -> dateTime.minusDays(amount);
                        case "months" -> dateTime.minusMonths(amount);
                        default -> dateTime;
                    };
                    break;
                default:
                    return "Invalid operation";
            }

            return String.format("Original: %s, New: %s, Day: %s",
                    dateTime.format(formatter),
                    newDateTime.format(formatter),
                    newDateTime.getDayOfWeek());

        } catch (DateTimeParseException e) {
            return "Invalid date time format";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();

        System.out.println(processDateTime(dateTimeStr, amount, unit, operation));
    }
}
