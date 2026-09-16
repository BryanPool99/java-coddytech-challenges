package org.bpao.seccion3poo.interfacesyclasesabstractas.introductiontointerfaces.desafio;

// TODO: Define la interfaz Adjustable
// Esta interfaz debería:
// - Declarar un método setLevel(int level)
// - Incluir una constante MAX_LEVEL con valor 100
// Recuerda: las constantes en interfaces son implícitamente public static final
public interface Adjustable {
    int MAX_LEVEL = 100;

    void setLevel(int level);
}
