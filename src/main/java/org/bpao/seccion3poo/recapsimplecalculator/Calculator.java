package org.bpao.seccion3poo.recapsimplecalculator;

public class Calculator {
    // TODO: Crear campos privados:
    // - name (String)
    // - memory (double)
    // - operationCount (int)
    private String name;
    private double memory;
    private int operationCount;

    public Calculator(String name, double memory, int operationCount) {
        this.name = name;
        this.memory = memory;
        this.operationCount = operationCount;
    }

    // TODO: Crear un constructor con el parámetro name
    // Establecer name, memory = 0, operationCount = 0
    // Usar la palabra clave 'this'
    public Calculator(String name) {
        this(name, 0, 0);
    }

    // TODO: Crear un constructor por defecto
    // Encadenar al otro constructor con name = "Default"
    public Calculator() {
        this("default");
    }

    // TODO: Crear getters: getName(), getMemory(), getOperationCount()
    public String getName() {
        return this.name;
    }

    public double getMemory() {
        return this.memory;
    }

    public int getOperationCount() {
        return this.operationCount;
    }

    // TODO: Crear add(double a, double b) - devuelve la suma
    // Almacenar el resultado en memory, incrementar operationCount
    public double add(double a, double b) {
        double result = a + b;
        this.memory = result;
        this.operationCount++;
        return result;
    }

    // TODO: Crear subtract(double a, double b) - devuelve la diferencia
    // Incrementar operationCount
    public double subtract(double a, double b) {
        double result = a - b;
        this.operationCount++;
        return result;
    }

    // TODO: Crear multiply(double a, double b) - devuelve el producto
    // Incrementar operationCount
    public double multiply(double a, double b) {
        double result = a * b;
        this.operationCount++;
        return result;
    }

    // TODO: Crear divide(double a, double b) - devuelve el cociente
    // Devolver 0 si b es 0, incrementar operationCount
    public double divide(double a, double b) {
        double result = 0;
        if (b==0) {
            this.operationCount++;
            return result;
        } else {
            result = a / b;
        }
        this.operationCount++;
        return result;
    }

    // TODO: Crear power(double base, double exponent) - devuelve base^exponent
    // Usar Math.pow(), incrementar operationCount
    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        this.operationCount++;
        return result;
    }
}
