package org.bpao.seccion2logicandflow.fechayhora.localtimeoperations;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
    Crea un método llamado processTime que tome cuatro argumentos:

    Una String (timeStr) en formato "HH:mm"
    Un entero (amount) para sumar o restar
    Una String (unit) ya sea "hours" o "minutes"
    Una String (operation) ya sea "add" o "subtract"
    El método debe:

    Parsear la cadena de tiempo de entrada
    Realizar la operación especificada
    Devolver información formateada sobre el resultado
    Los mensajes de retorno deben ser:

    Si formato de tiempo inválido: devolver "Invalid time format"
    Si unidad inválida: devolver "Invalid unit"
    Si operación inválida: devolver "Invalid operation"
    Para éxito: devolver "Original: [time], New: [new_time]"
*/
public class DesafioOperacionesConLocalTime {
    public static String processTime(String timeStr, int amount, String unit, String operation) {
        // Escribe tu código aquí
        try {
            LocalTime originalTime = LocalTime.parse(timeStr);
            LocalTime newTime;
            switch (unit.toLowerCase()) {
                case "hours":
                    newTime = "add".equals(operation.toLowerCase()) ? originalTime.plusHours(amount):originalTime.minusHours(amount);
                    break;
                case "minutes":
                    newTime = "add".equals(operation.toLowerCase()) ? originalTime.plusMinutes(amount):originalTime.minusMinutes(amount);
                    break;
                default:
                    return "Invalid unit";
            }
            return String.format("Original: %s, New: %s",originalTime,newTime);
        } catch (DateTimeParseException e) {
            return "Invalid time format";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();

        System.out.println(processTime(timeStr, amount, unit, operation));
    }
}
