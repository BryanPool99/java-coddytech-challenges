package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringbuilderbasic;

import java.util.Scanner;

/*
    Crea un método llamado buildPhrase que tome tres argumentos:

    Una String (start) para el comienzo de la frase
    Una String (middle) para la parte media
    Una String (end) para el final
    El método debe:

    Crear un StringBuilder con la cadena start
    Agregar un espacio y la cadena middle
    Agregar un espacio y la cadena end
    Agregar un signo de exclamación al final
    Devolver la cadena final
    Los mensajes de retorno deben ser:

    Si cualquier entrada es null: devolver "Invalid input"
    Para una operación exitosa: devolver la frase construida
*/
public class ConceptoBasicoDeStringBuiilder {
    public static String buildPhrase(String start, String middle, String end) {
        // Escribe tu código aquí
        if (start!=null && middle!=null && end!=null) {
            StringBuilder sb = new StringBuilder(start);
            sb.append(" " + middle);
            sb.append(" " + end);
            sb.append("!");
            return sb.toString();
        }
        return "Invalid input";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String middle = scanner.nextLine();
        String end = scanner.nextLine();

        if (start.equals("null")) start = null;
        if (middle.equals("null")) middle = null;
        if (end.equals("null")) end = null;

        System.out.println(buildPhrase(start, middle, end));
    }
}
