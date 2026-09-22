package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparatorinterface.desafio;

import java.util.Comparator;

// TODO: Implementar la interfaz Comparator<Employee>
public class NameComparator implements Comparator<Employee> {
    // TODO: Implementar el método compare()
    // Ordenar por nombre en orden ASCENDENTE (A a Z)
    // Pista: Usa el método compareTo() de String
    @Override
    public int compare(Employee e1, Employee e2) {
        // TODO: Implementar este método
        return e1.getName().compareTo(e2.getName());
    }
}
