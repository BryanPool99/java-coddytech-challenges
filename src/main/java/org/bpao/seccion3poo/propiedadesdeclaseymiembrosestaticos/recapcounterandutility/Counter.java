package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.recapcounterandutility;

public class Counter {
    // TODO: Crea una variable estática privada para rastrear el total de instancias
    private static int total;
    // TODO: Crea una variable de instancia privada 'id' para el identificador único
    private int id;

    // TODO: Crea un constructor que:
    // - Incremente el conteo total
    // - Asigne el conteo actual como el id de esta instancia
    public Counter() {
        total++;
        this.id = total;
    }
    // TODO: Crea un método getId() que devuelva el id único de este contador

    public int getId() {
        return this.id;
    }

    // TODO: Crea un método estático getTotalCount() que devuelva el total de objetos Counter creados
    public static int getTotalCount() {
        return total;
    }
}
