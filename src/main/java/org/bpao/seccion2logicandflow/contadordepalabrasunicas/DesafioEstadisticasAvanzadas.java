package org.bpao.seccion2logicandflow.contadordepalabrasunicas;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
    Mejora el programa para mostrar:

    Número Total de words
    Número de Unique words
    Cada word con su count y su percentage del Total, una línea por word,
    en orden alfabético (un TreeMap mantiene sus claves ordenadas; si usas un HashMap,
    ordena las claves antes de imprimir)
    Por ejemplo:

    Entrada:
    Coddy!

    Salida esperada:
    Total words: 1
    Unique words: 1
    Word statistics:
    coddy: 1 (100.00%)
*/
public class DesafioEstadisticasAvanzadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        TreeMap<String, Integer> wordCount = new TreeMap<>();
        int totalWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
            for (int j = 0; j < textArray[i].length; j++) {
                if (!textArray[i][j].isEmpty()) {
                    totalWords++;
                    String word = textArray[i][j]
                            .replaceAll("[^a-zA-Z ]", "")
                            .toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + wordCount.size());

        System.out.println("Word statistics:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            double percentage = (entry.getValue() * 100.0) / totalWords;
            System.out.printf("%s: %d (%.2f%%)\n",
                    entry.getKey(), entry.getValue(), percentage);
        }
    }
}
