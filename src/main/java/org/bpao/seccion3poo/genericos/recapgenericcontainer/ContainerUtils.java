package org.bpao.seccion3poo.genericos.recapgenericcontainer;

public class ContainerUtils {
    // TODO: Implementar printAll(Container<?> container)
    // Usa un comodín sin restricciones para imprimir todos los elementos, uno por línea
    public static void printAll(Container<?> container) {
        for (Object obj : container.getAll()) {
            System.out.println(obj);
        }
    }

    // TODO: Implementar countItems(Container<? extends Number> container)
    // Usa un comodín con límite superior para calcular la suma de todos los valores numéricos
    // Devuelve el resultado como un double
    public static double countItems(Container<? extends Number> container) {
        double sum = 0;
        for (Number num : container.getAll()) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // TODO: Implementar addDefaults(Container<? super Integer> container)
    // Usa un comodín con límite inferior para añadir los enteros 1, 2 y 3
    public static void addDefaults(Container<? super Integer> container) {
        container.add(1);
        container.add(2);
        container.add(3);
    }

    // TODO: Implementar <T> T getLastOrDefault(Container<T> container, T defaultValue)
    // Un método genérico que devuelve el último elemento, o defaultValue si está vacío
    public static <T> T getLastOrDefault(Container<T> container, T defaultValue) {
        if (container.isEmpty()) return defaultValue;
        int idxLast = container.size() - 1;
        return container.get(idxLast);
    }
}
