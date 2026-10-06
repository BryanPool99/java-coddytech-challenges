package org.bpao.seccion3poo.patronesdediseño2.statepattern.desafio;

// Clase Document - el Context en el State Pattern
// Esta clase mantiene el estado actual y le delega las acciones
public class Document {
    // TODO: Declara un campo private para contener el DocumentState actual
    private DocumentState documentState;

    // TODO: Constructor - inicializa el estado a DraftState
    public Document() {
        this.documentState = new States.DraftState();
    }

    // TODO: Implementa el método setState para cambiar el estado actual
    public void setState(DocumentState documentState) {
        this.documentState = documentState;
    }

    // TODO: Implementa el método edit que delega al edit del estado actual
    public void edit() {
        documentState.edit(this);
    }

    // TODO: Implementa el método approve que delega al approve del estado actual
    public void approve() {
        documentState.approve(this);
    }

    // TODO: Implementa el método getStatus que devuelve el nombre simple de la clase del estado actual
    // Pista: usa getClass().getSimpleName()
    public String getStatus() {
        return documentState.getClass().getSimpleName();
    }
}
