package org.bpao.seccion3poo.patronesdediseño2.statepattern.desafio;

// Define la interfaz DocumentState
// Esta interfaz declara los métodos que todos los estados deben implementar
public interface DocumentState {
    // TODO: Declara el método edit que toma un parámetro Document
    void edit(Document document);

    // TODO: Declara el método approve que toma un parámetro Document
    void approve(Document document);
}
