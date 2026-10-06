package org.bpao.seccion3poo.patronesdediseño2.statepattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Crea un nuevo Document
        Document document = new Document();
        // TODO: Imprime el estado inicial en formato "Status: [state]"
        System.out.println("Status: " + document.getStatus());
        // TODO: Divide la entrada por comas para obtener las acciones individuales
        String[] actions = input.split(",");
        // TODO: Recorre cada acción
        // - Si la acción es "edit", llama a edit() en document
        // - Si la acción es "approve", llama a approve() en document
        // - Después de cada acción, imprime el estado actual
        for (String action : actions) {
            if (action.equals("edit")) {
                document.edit();
            } else if (action.equals("approve")) {
                document.approve();
            }
            System.out.println("Status: " + document.getStatus());
        }
    }
}
