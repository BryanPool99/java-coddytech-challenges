package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.advancedstringformatting;

import java.util.Scanner;

/*
    Crea un método llamado formatData que tome cuatro argumentos:

    Un String (name) para el nombre del producto
    Un double (price) para el precio del producto
    Un entero (quantity) para la cantidad
    Un String (format) para el tipo de formato de salida
    El método debe formatear los datos basándose en estos tipos:

    "basic": return "ITEM: {name}, PRICE: ${price}"
    "detailed": return "PRODUCT: {name}\nPRICE: ${price}\nQUANTITY: {quantity}"
    "total": return "TOTAL FOR {quantity}x {name}: ${total}" (total = price * quantity)
    Todos los precios deben formatearse con exactamente 2 decimales.

    Mensaje de retorno:
    Si cualquier entrada es null o formato inválido: return "Invalid input"
 */
public class DesafioFormatoAvanzadoDeCadenas {
    public static String formatData(String name, double price, int quantity, String format) {
        // Escribe tu código aquí
        if (name==null || format==null) return "Invalid input";
        return switch (format) {
            case "basic" -> String.format("ITEM: %s, PRICE: $%.2f", name, price);
            case "detailed" -> String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d", name, price, quantity);
            case "total" -> String.format("TOTAL FOR %dx %s: $%.2f", quantity, name, (price * quantity));
            default -> "Invalid input";
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        if (name.equals("null")) name = null;
        if (format.equals("null")) format = null;

        System.out.println(formatData(name, price, quantity, format));
    }
}
