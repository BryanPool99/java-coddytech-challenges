package org.bpao.seccion2logicandflow.fechayhora.periodandduration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado calculateDifference que tome cuatro argumentos:

    Una String (start) en formato "yyyy-MM-dd HH:mm"
    Una String (end) en formato "yyyy-MM-dd HH:mm"
    Una String (unit) ya sea "period" o "duration"
    Una String (format) ya sea "full" o "simple"
    El método debe:

    Calcular la diferencia entre las fechas de inicio y fin
    Devolver la diferencia en el formato especificado
    Los mensajes de retorno deben ser:

    Si las fechas son inválidas: devolver "Invalid date format"
    Si la unidad es inválida: devolver "Invalid unit"
    Si el formato es inválido: devolver "Invalid format"
    Para period con formato "full": "Years: X, Months: Y, Days: Z"
    Para period con formato "simple": "XyYmZd"
    Para duration con formato "full": "Hours: X, Minutes: Y"
    Para duration con formato "simple": "XhYm"
*/
public class DesafioPeriodYDuration {
    public static String calculateDifference(String start, String end, String unit, String format) {
        // Escribe tu código aquí
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime startDate = LocalDateTime.parse(start, formatter);
            LocalDateTime endDate = LocalDateTime.parse(end, formatter);

            switch (unit.toLowerCase()) {
                case "period":
                    Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
                    if (format.equals("full")) {
                        return String.format("Years: %d, Months: %d, Days: %d",
                                period.getYears(), period.getMonths(), period.getDays());
                    } else if (format.equals("simple")) {
                        return String.format("%dy%dm%dd",
                                period.getYears(), period.getMonths(), period.getDays());
                    }
                    break;

                case "duration":
                    Duration duration = Duration.between(startDate, endDate);
                    long hours = duration.toHours();
                    long minutes = duration.toMinutesPart();
                    if (format.equals("full")) {
                        return String.format("Hours: %d, Minutes: %d", hours, minutes);
                    } else if (format.equals("simple")) {
                        return String.format("%dh%dm", hours, minutes);
                    }
                    break;

                default:
                    return "Invalid unit";
            }

            return "Invalid format";

        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String unit = scanner.nextLine();
        String format = scanner.nextLine();

        System.out.println(calculateDifference(start, end, unit, format));
    }
}
