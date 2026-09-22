package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparatorinterface.desafio;

import java.util.Comparator;

// TODO: Implementa la interfaz Comparator<Employee>
public class SalaryComparator implements Comparator<Employee> {
    // TODO: Implementa el método compare()
    // Ordena por salario en orden DESCENDENTE (los mejor pagados primero)
    // Pista: Usa Double.compare() para una comparación segura
    // Recuerda: Para orden descendente, invierte la comparación
    @Override
    public int compare(Employee e1, Employee e2) {
        // TODO: Implementa este método
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
