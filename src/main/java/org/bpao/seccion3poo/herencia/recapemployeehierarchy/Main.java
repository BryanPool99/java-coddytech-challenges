package org.bpao.seccion3poo.herencia.recapemployeehierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las entradas
        String managerName = scanner.nextLine();
        double managerSalary = scanner.nextDouble();
        int teamSize = scanner.nextInt();
        scanner.nextLine(); // consumir el salto de línea
        String developerName = scanner.nextLine();
        String language = scanner.nextLine();

        // El salario del Developer está fijado en 75000.0
        double developerSalary = 75000.0;

        // TODO: Crear un objeto Manager con managerName, managerSalary y teamSize
        Manager myManager = new Manager(managerName, managerSalary, teamSize);
        // TODO: Crear un objeto Developer con developerName, developerSalary y language
        Developer myDeveloper = new Developer(developerName, developerSalary, language);
        // TODO: Imprimir los detalles del manager usando getManagerDetails()
        System.out.println(myManager.getManagerDetails());
        // TODO: Llamar al método work() del manager
        myManager.work();
        // TODO: Imprimir los detalles del developer usando getDeveloperDetails()
        System.out.println(myDeveloper.getDeveloperDetails());
        // TODO: Llamar al método work() del developer
        myDeveloper.work();
    }
}
