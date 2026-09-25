package org.bpao.seccion3poo.genericos.introductiontogenerics.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        // TODO: Crea un OldBox que almacene la word
        // Retrieve with cast to String and print: "OldBox (with cast): [value]"
        OldBox oldBox = new OldBox(word);
        System.out.println("OldBox (with cast): " + oldBox.getContent());
        // TODO: Crea un GenericBox<String> que almacene la word
        // Retrieve without casting and print: "GenericBox (no cast): [value]"
        GenericBox<String> stringGenericBox = new GenericBox<>(word);
        System.out.println("GenericBox (no cast): " + stringGenericBox.getContent());
        // TODO: Create a GenericBox<Integer> storing the number
        // Retrieve and print: "GenericBox Integer: [value]"
        GenericBox<Integer> integerGenericBox = new GenericBox<>(number);
        System.out.println("GenericBox Integer: " + integerGenericBox.getContent());
        // TODO: Imprime una línea en blanco, luego imprime:
        // "Type safety: Generics catch errors at compile time!"
        System.out.println();
        System.out.println("Type safety: Generics catch errors at compile time!");
    }
}
