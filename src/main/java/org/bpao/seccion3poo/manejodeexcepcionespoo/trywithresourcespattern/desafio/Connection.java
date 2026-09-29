package org.bpao.seccion3poo.manejodeexcepcionespoo.trywithresourcespattern.desafio;

// TODO: Create a Connection class that implements AutoCloseable
//
// Requerido:
// - Campo privado para el nombre de la conexión (String)
// - Constructor that takes the name and prints "[name] connection opened"
// - método query(String sql) que imprime "Executing on [name]: [sql]"
// - close() method that prints "[name] connection closed"
public class Connection implements AutoCloseable {
    // TODO: Añadir campo privado para el nombre de la conexión
    private String name;

    // TODO: Crear constructor
    public Connection(String name) {
        this.name = name;
        System.out.println(getName() + " connection opened");
    }

    public String getName() {
        return name;
    }

    // TODO: Implementar método query
    public void query(String sql) {
        System.out.println("Executing on " + this.getName() + ": " + sql);
    }

    // TODO: Implementar método close
    @Override
    public void close() {
        // TODO: Imprimir mensaje de cierre
        System.out.println(this.getName() + " connection closed");
    }
}
