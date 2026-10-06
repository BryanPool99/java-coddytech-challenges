package org.bpao.seccion3poo.patronesdediseño2.compositepattern.desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer entradas
        String emp1Name = scanner.nextLine();
        int emp1Salary = Integer.parseInt(scanner.nextLine());
        String emp2Name = scanner.nextLine();
        int emp2Salary = Integer.parseInt(scanner.nextLine());
        String subDeptName = scanner.nextLine();
        String emp3Name = scanner.nextLine();
        int emp3Salary = Integer.parseInt(scanner.nextLine());

        // TODO: Create the "Engineering" department as the root
        Department engineering = new Department("Engineering");
        // TODO: Crea y añade dos empleados a Engineering usando los datos de emp1 y emp2
        Employee employee1 = new Employee(emp1Name, emp1Salary);
        Employee employee2 = new Employee(emp2Name, emp2Salary);
        engineering.add(employee1);
        engineering.add(employee2);
        // TODO: Crea un subdepartamento usando subDeptName
        Department subDept = new Department(subDeptName);
        // TODO: Crea y añade un empleado al subdepartamento usando los datos de emp3
        Employee employee3 = new Employee(emp3Name, emp3Salary);
        subDept.add(employee3);
        // TODO: Añade el subdepartamento a Engineering
        engineering.add(subDept);
        // TODO: Call showDetails("") on the Engineering department
        engineering.showDetails("");
        // TODO: Imprime el salario total en el formato: Total Salary: $[amount]
        System.out.println("Total Salary: $" + engineering.getSalary());
    }
}
