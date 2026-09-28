package org.bpao.seccion3poo.genericos.recapgenericcontainer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String word = scanner.nextLine();
        int intValue = Integer.parseInt(scanner.nextLine());
        double doubleValue = Double.parseDouble(scanner.nextLine());

        // TODO: Crear un Container<String> y añadir la palabra dos veces
        Container<String> stringContainer = new Container<>();
        stringContainer.add(word);
        stringContainer.add(word);
        // Imprimir "String container:" luego usar ContainerUtils.printAll()
        System.out.println("String container:");
        ContainerUtils.printAll(stringContainer);
        // TODO: Crear un Container<Double> y añadir el valor double
        Container<Double> doubleContainer = new Container<>();
        doubleContainer.add(doubleValue);
        // Imprimir una línea en blanco, luego "Number sum: [sum]" usando ContainerUtils.countItems()
        System.out.println();
        System.out.println("Number sum: " + ContainerUtils.countItems(doubleContainer));
        // TODO: Crear un Container<Number> y llamar a ContainerUtils.addDefaults() en él
        Container<Number> numberContainer = new Container<>();
        ContainerUtils.addDefaults(numberContainer);
        // Imprimir una línea en blanco, luego "After adding defaults:" y usar ContainerUtils.printAll()
        System.out.println();
        System.out.println("After adding defaults:");
        ContainerUtils.printAll(numberContainer);
        // TODO: Crear un Container<Integer> vacío
        Container<Integer> integerContainer = new Container<>();
        // Usar ContainerUtils.getLastOrDefault() con intValue como valor por defecto
        //ContainerUtils.getLastOrDefault(integerContainer,intValue);
        // Imprimir una línea en blanco, luego "Last or default: [result]"
        System.out.println();
        System.out.println("Last or default: " + ContainerUtils.getLastOrDefault(integerContainer, intValue));
    }
}
