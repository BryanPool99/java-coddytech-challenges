package org.bpao.seccion3poo.conceptosavanzadosdepoo.compositionvsinheritance.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String processorBrand = scanner.nextLine();
        double processorSpeed = Double.parseDouble(scanner.nextLine());
        String memoryType = scanner.nextLine();
        int memorySize = Integer.parseInt(scanner.nextLine());

        // TODO: Crea un Processor con la marca y la velocidad
        Processor processor = new Processor(processorBrand, processorSpeed);
        // TODO: Crea una Memory con el tipo y el tamaño
        Memory memory = new Memory(memoryType, memorySize);
        // TODO: Crea un Computer componiendo el Processor y la Memory
        Computer myComputer = new Computer(processor, memory);
        // TODO: Imprime el resultado de boot()
        System.out.println(myComputer.boot());
        // TODO: Imprime el resultado de getSpecs()
        System.out.println(myComputer.getSpecs());
    }
}
