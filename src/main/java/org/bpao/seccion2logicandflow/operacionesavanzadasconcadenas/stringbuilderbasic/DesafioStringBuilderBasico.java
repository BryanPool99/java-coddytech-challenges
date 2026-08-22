package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringbuilderbasic;

import java.util.Scanner;

/*
    En este desafío, aplicarás tus conocimientos de StringBuilder para construir un mensaje personalizado basado en la entrada del usuario.

    Crea un método llamado buildMessage que tome cuatro argumentos:

    Un String (greeting) – Representa el saludo inicial.
    Un String (name) – Representa el nombre de una persona.
    Un String (action) – Representa una acción que se realiza.
    Un boolean (excited) – Determina si el mensaje debe ser emocionado o no.
    El método debe:

    Verificar valores null: Si alguna entrada es null, devolver "Invalid input".
    Usar StringBuilder para construir el mensaje en el formato:

    greeting, name is action.

    Ejemplo: "Hello, Alice is learning Java."
    Si excited es true, agregar un signo de exclamación "!" al final.
*/
public class DesafioStringBuilderBasico {
    public static String buildMessage(String greeting, String name, String action, boolean excited) {
        // Escribe tu código aquí usando StringBuilder
        if (greeting!=null && name!=null && action!=null) {
            StringBuilder sb = new StringBuilder(greeting);
            sb.append(", " + name);
            sb.append(" is " + action + ".");
            if (excited) {
                sb.append("!");
            }
            return sb.toString();
        }
        return "Invalid input";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        String name = scanner.nextLine();
        String action = scanner.nextLine();
        boolean excited = Boolean.parseBoolean(scanner.nextLine());

        if (greeting.equals("null")) greeting = null;
        if (name.equals("null")) name = null;
        if (action.equals("null")) action = null;

        System.out.println(buildMessage(greeting, name, action, excited));
    }
}
