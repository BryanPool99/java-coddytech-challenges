package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringbufferintroduction;

import java.util.Scanner;

/*
    Crea un método llamado processText que tome cuatro argumentos:

    Un String (text) para modificar
    Un String (target) para encontrar
    Un String (replacement) para reemplazar target
    Un int (operations) número de operaciones a realizar
    El método debe:

    Crear un StringBuffer con el texto de entrada
    Basado en el parámetro operations:
    Si operations = 1: Reemplazar todas las ocurrencias de target con replacement
    Si operations = 2: Reemplazar todas las ocurrencias y revertir toda la cadena
    Si operations = 3: Reemplazar todas las ocurrencias, revertir la cadena y convertir a mayúsculas
    Agregar un signo de exclamación al final
    Devolver la cadena final
    Los mensajes de retorno deben ser:

    Si cualquier entrada de string es null: return "Invalid input"
    Si operations es menor que 1 o mayor que 3: return "Invalid operation"
    Si target no se encuentra: devolver el texto original modificado según el número de operations
    Para operación exitosa: devolver el texto modificado
*/
public class DesafioMasterStringBuffer {
    public static String processText(String text, String target, String replacement, int operations) {
        // Escribe tu código
        if (text==null || target==null || replacement==null) {
            return "Invalid input";
        }

        if (operations < 1 || operations > 3) {
            return "Invalid operation";
        }

        StringBuffer sb = new StringBuffer(text);
        String tempText = text;

        while (tempText.indexOf(target)!=-1) {
            int index = tempText.indexOf(target);
            sb.replace(index, index + target.length(), replacement);
            tempText = sb.toString();
        }

        if (operations >= 2) {
            sb.reverse();
        }

        if (operations==3) {
            String upperText = sb.toString().toUpperCase();
            sb = new StringBuffer(upperText);
        }

        sb.append("!");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        int operations = scanner.nextInt();

        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;

        System.out.println(processText(text, target, replacement, operations));
    }
}
