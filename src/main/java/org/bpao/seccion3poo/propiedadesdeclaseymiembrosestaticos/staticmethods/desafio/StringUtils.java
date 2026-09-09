package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.staticmethods.desafio;

public class StringUtils {
    // TODO: Crea un método estático countVowels que reciba un String
    // y devuelva el recuento de vocales (a, e, i, o, u - sin distinguir mayúsculas de minúsculas)
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }

    // TODO: Crea un método estático reverse que reciba un String
    // y devuelva la versión invertida del mismo
    public static String reverse(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    // TODO: Crea un método estático isPalindrome que reciba un String
    // y devuelva true si se lee igual hacia adelante que hacia atrás
    // (comparación insensible a mayúsculas y minúsculas)
    public static boolean isPalindrome(String text) {
        String lower = text.toLowerCase();
        String reversed = reverse(text).toLowerCase();
        return lower.equals(reversed);
    }
}
