package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.staticmethods.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // TODO: Usar los métodos estáticos de StringUtils para analizar el texto
        // Llamar a StringUtils.countVowels(text) para obtener el recuento de vocales
        int vowelCount = StringUtils.countVowels(text);
        // Llamar a StringUtils.reverse(text) para obtener la cadena invertida
        String reversed = StringUtils.reverse(text);
        // Llamar a StringUtils.isPalindrome(text) para comprobar si es un palíndromo
        boolean palindrome = StringUtils.isPalindrome(text);
        // TODO: Imprimir los resultados en el formato:
        // Vowels: [count]
        System.out.println("Vowels: " + vowelCount);
        // Reversed: [reversed string]
        System.out.println("Reversed: " + reversed);
        // Palindrome: true/false
        System.out.println("Palindrome: " + palindrome);
    }
}
