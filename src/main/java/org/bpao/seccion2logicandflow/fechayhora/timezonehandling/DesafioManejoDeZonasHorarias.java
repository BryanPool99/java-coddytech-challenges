package org.bpao.seccion2logicandflow.fechayhora.timezonehandling;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado convertTime que reciba cuatro argumentos:

    Un String (dateTimeStr) en formato "yyyy-MM-dd HH:mm"
    Un String (sourceZone) con el ID de la zona horaria de origen
    Un String (targetZone) con el ID de la zona horaria de destino
    Un booleano (showOffset) que indica si se debe incluir el desplazamiento de la zona horaria en la

    El método debe:
    Analizar la fecha y hora de entrada en la zona horaria de origen
    Convertirla a la zona horaria de destino
    Devolver información formateada sobre ambas horas
    Los mensajes de retorno deben ser:

    Si la fecha y hora no son válidas: devolver "Invalid datetime format"
    Si la zona no es válida: devolver "Invalid time zone"
    Si showOffset es true: incluir el desplazamiento en la salida
    Formato: "Source: [time1], Target: [time2]"
*/
public class DesafioManejoDeZonasHorarias {
    public static String convertTime(String dateTimeStr, String sourceZone, String targetZone, boolean showOffset) {
        // Escribe tu código aquí
        try {
            // Crear formateadores
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            DateTimeFormatter outputFormatter = showOffset ?
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm xxx"):
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            // Analizar la fecha y hora de entrada
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, inputFormatter);

            // Crear objetos ZonedDateTime
            ZonedDateTime sourceDateTime = localDateTime.atZone(ZoneId.of(sourceZone));
            ZonedDateTime targetDateTime = sourceDateTime.withZoneSameInstant(ZoneId.of(targetZone));

            return String.format("Source: %s, Target: %s",
                    sourceDateTime.format(outputFormatter),
                    targetDateTime.format(outputFormatter));

        } catch (DateTimeParseException e) {
            return "Invalid datetime format";
        } catch (DateTimeException e) {
            return "Invalid time zone";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        String sourceZone = scanner.nextLine();
        String targetZone = scanner.nextLine();
        boolean showOffset = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(convertTime(dateTimeStr, sourceZone, targetZone, showOffset));
    }
}
