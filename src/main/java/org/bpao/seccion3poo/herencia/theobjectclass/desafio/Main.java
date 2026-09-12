package org.bpao.seccion3poo.herencia.theobjectclass.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine(); // consumir nueva línea
        String brand = scanner.nextLine();

        // TODO: Crear un objeto Gadget con name y year
        Gadget myGadget = new Gadget(name,year);
        // TODO: Crear un objeto Smartphone con name, year y brand
        Smartphone mySmartphone = new Smartphone(name,year,brand);
        // TODO: Imprimir el nombre de la clase del gadget usando getClass().getSimpleName()
        System.out.println(myGadget.getClass().getSimpleName());
        // TODO: Imprimir si el toString() del gadget contiene "@" (true o false)
        System.out.println((myGadget.toString()).contains("@"));
        // TODO: Imprimir el smartphone (usa el toString() sobrescrito)
        System.out.println(mySmartphone.toString());
    }
}
