package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.getterandsettermethods.desafio;

public class Temperature {
    // TODO: Declarar un campo privado para celsius (double)
    private double celsius;
    // TODO: Declarar un campo privado para valid (boolean)
    private boolean valid;

    // TODO: Implementar el getter getCelsius()
    public double getCelsius() {
        return celsius;
    }

    // TODO: Implementar el setter setCelsius()
    // - Solo aceptar valores iguales o superiores al cero absoluto (-273.15)
    // - Si es válido, asignar celsius y establecer valid a true
    // - Si no es válido, no cambiar celsius y establecer valid a false
    public void setCelsius(double val) {
        if (val >= -273.15) {
            this.celsius = val;
            this.valid = true;
        } else {
            this.valid = false;
        }
    }

    // TODO: Implementar el getter isValid() (los getters booleanos usan el prefijo "is")
    public boolean isValid() {
        return valid;
    }

    // TODO: Implementar el getter getFahrenheit()
    // - Convertir celsius a Fahrenheit usando: (celsius * 9/5) + 32
    public double getFahrenheit() {
        return this.getCelsius() * 9 / 5 + 32;
    }
}
