package org.bpao.seccion2logicandflow.operacionesavanzadasconcadenas.stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
    Crea un método llamado tokenizeText que reciba dos argumentos:

    Un String (text) para tokenizar
    Un String (delimiter) por el cual dividir
    El método debe:

    Crear un StringTokenizer con el texto y el delimitador dados
    Devolver una cadena que contenga el recuento de tokens seguido de cada token en una línea nueva
    Los mensajes de retorno deben ser:

    Si text es null: devolver "Invalid text"
    Si delimiter es null: usar el espacio como delimitador
    Formato: "Token count: X\nToken: token1\nToken: token2\n..."
*/
public class DesafioTokenizadorDeCadenas {
    public static String tokenizeText(String text, String delimiter) {
        // Escribe tu código aquí
        if (text==null) return "Invalid text";
        if (delimiter==null) delimiter = " ";
        StringTokenizer st = new StringTokenizer(text, delimiter);
        StringBuilder stringBuilder = new StringBuilder("Token count: ");
        stringBuilder.append(st.countTokens());
        while (st.hasMoreTokens()) {
            stringBuilder.append("\nToken: " + st.nextToken());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();

        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;

        System.out.println(tokenizeText(text, delimiter));
    }
}
