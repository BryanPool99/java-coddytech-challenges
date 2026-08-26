package org.bpao.seccion2logicandflow.contadordepalabrasunicas;

import java.util.Scanner;

/*
    Crea un programa que lea texto del usuario y lo almacene en un arreglo 2D.
    El texto puede contener múltiples oraciones separadas por puntos.
    Imprime cada palabra en el formato "Word[row,col]: word".

    Para almacenar palabras en un arreglo 2D, necesitamos dividir cada oración en palabras:
    String[][] textArray = new String[sentences.length][];
    for (int i = 0; i < sentences.length; i++) {
       textArray[i] = sentences[i].trim().split(" ");
    }
*/
public class EntradaYAlmacenamientoDeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];

        // Escribe tu código
        for (int i = 0;i<sentences.length;i++){
            textArray[i] = sentences[i].trim().split(" ");
        }

        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                if (!textArray[i][j].isEmpty()) {
                    System.out.println("Word[" + i + "," + j + "]: " + textArray[i][j]);
                }
            }
        }
    }
}
