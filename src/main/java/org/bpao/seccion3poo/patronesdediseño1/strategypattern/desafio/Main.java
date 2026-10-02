package org.bpao.seccion3poo.patronesdediseño1.strategypattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String style = scanner.nextLine();

        // TODO: Crea una instancia de TextEditor
        TextEditor textEditor = new TextEditor();
        // TODO: Llama a publishText con el texto de entrada (antes de establecer cualquier formateador)
        textEditor.publishText(text);
        // TODO: Según la entrada de estilo ("upper", "lower" o "title"),
        // establece el formateador apropiado y llama a publishText de nuevo
        if (style.equals("upper")) {
            textEditor.setFormatter(new Formatters.UpperCaseFormatter());
        } else if (style.equals("lower")) {
            textEditor.setFormatter(new Formatters.LowerCaseFormatter());
        } else if (style.equals("title")) {
            textEditor.setFormatter(new Formatters.TitleCaseFormatter());
        }
        textEditor.publishText(text);
    }
}
