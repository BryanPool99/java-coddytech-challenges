package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparatorinterface.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee tres empleados de la entrada
        // Formato de cada línea: name,department,salary
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        // Analiza cada línea y crea objetos Employee
        String[] parts1 = line1.split(",");
        String[] parts2 = line2.split(",");
        String[] parts3 = line3.split(",");

        Employee emp1 = new Employee(parts1[0], parts1[1], Double.parseDouble(parts1[2]));
        Employee emp2 = new Employee(parts2[0], parts2[1], Double.parseDouble(parts2[2]));
        Employee emp3 = new Employee(parts3[0], parts3[1], Double.parseDouble(parts3[2]));

        // Crea un ArrayList de empleados y añade los tres
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        // Ordena por salario usando SalaryComparator e imprime cada empleado
        Collections.sort(employees, new SalaryComparator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Imprime una línea vacía
        System.out.println();

        // Ordena por nombre usando NameComparator e imprime cada empleado
        Collections.sort(employees, new NameComparator());
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
