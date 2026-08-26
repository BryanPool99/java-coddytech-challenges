package org.bpao.seccion2logicandflow.contadordepalabrasunicas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Agrega funcionalidad de conteo de palabras al programa.
    Usa un HashMap para almacenar y contar las frecuencias de palabras.
    Imprime el conteo de cada palabra única.

    Por ejemplo:

    Entrada:
    Coddy

    Salida Esperada:
    Word counts:
    coddy: 1

*/
public class DesafioConteoDePalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];

        // Escribe tu código
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
            for (int j = 0; j < textArray[i].length; j++) {
                if (!textArray[i][j].isEmpty()) {
                    String word = textArray[i][j]
                            .replaceAll("[^a-zA-Z ]", "")
                            .toLowerCase();
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        }

        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
