package org.bpao.seccion2logicandflow.contadordepalabrasunicas;

import java.util.Scanner;

/*
    Modifica el programa anterior para limpiar cada palabra eliminando la puntuación y convirtiéndola a minúsculas.
    Imprime tanto la palabra original como la procesada.

    Por ejemplo

    Entrada:
    Coddy

    Expected Output:
    Original[0,0]: Coddy
    Processed[0,0]: coddy
*/
public class DesafioProcesamientoDePalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];

        // Escribe tu código
        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
        }

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                if (!textArray[i][j].isEmpty()) {
                    String originalText = textArray[i][j];
                    String processedText = originalText.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                    System.out.println("Original[" + i + "," + j + "]: " + originalText);
                    System.out.println("Processed[" + i + "," + j + "]: " + processedText);
                }
            }
        }
    }
}
