package org.bpao.seccion3poo.herencia.constructorchaining.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int warrantyYears = scanner.nextInt();

        // TODO: Crear un objeto Electronics usando los tres parámetros
        Electronics myElectronics = new Electronics(name, price, warrantyYears);
        // TODO: Imprimir el resultado de getDetails()
        System.out.println(myElectronics.getDetails());
    }
}
