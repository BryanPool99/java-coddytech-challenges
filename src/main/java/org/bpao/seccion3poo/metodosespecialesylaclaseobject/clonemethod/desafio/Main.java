package org.bpao.seccion3poo.metodosespecialesylaclaseobject.clonemethod.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int version = scanner.nextInt();

        // TODO: Crea un Document original con los valores de entrada
        Document document = new Document(title, author, version);
        // TODO: Clona el documento original para crear una copia
        Document cloneDocument = document.clone();
        // TODO: Modifica la version del clon incrementándola en 1
        cloneDocument.setVersion(document.getVersion() + 1);
        // TODO: Imprime "Original: " seguido del documento original
        System.out.println("Original: " + document.toString());
        // TODO: Imprime "Clone: " seguido del documento clonado
        System.out.println("Clone: " + cloneDocument.toString());
        // TODO: Imprime "Independent: " seguido de true/false (comprueba si original != clone)
        System.out.println("Independent: " + (document != cloneDocument));
    }
}
