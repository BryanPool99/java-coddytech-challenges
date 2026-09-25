package org.bpao.seccion3poo.genericos.genericmethods.desafio;

public class ArrayUtils {
    // TODO: Implementa getLast - un método genérico que toma un array de tipo T
    // y devuelve el último elemento. Devuelve null si el array está vacío.
    public static <T> T getLast(T[] array) {
        if (array.length==0) return null;
        return array[array.length - 1];
    }

    // TODO: Implementa swap - un método genérico que toma un array de tipo T
    // y dos índices enteros, luego intercambia los elementos en esas posiciones.
    public static <T> void swap(T[] array, int i, int j) {
        // Tu código aquí
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // TODO: Implementa printWithLabel - un método genérico con dos parámetros de tipo K y V
    // Toma una etiqueta de tipo K y un valor de tipo V
    // Imprime en formato: [label]: [value]
    public static <K, V> void printWithLabel(K label, V value) {
        // Tu código aquí
        System.out.println(label + ": " + value);
    }
}
