package org.bpao.seccion3poo.patronesdediseño2.statepattern.desafio;

// Implementa las tres clases de estado concretas
public class States {
    // DraftState: Estado inicial donde se permite la edición
    static class DraftState implements DocumentState {
        // TODO: Implementa el método edit
        // - Print "Editing draft..."
        @Override
        public void edit(Document document) {
            System.out.println("Editing draft...");
        }

        // TODO: Implementa el método approve
        // - Print "Draft approved. Moving to review."
        // - Transiciona el documento a ReviewState
        @Override
        public void approve(Document document) {
            System.out.println("Draft approved. Moving to review.");
            document.setState(new ReviewState());
        }
    }

    // ReviewState: El documento está en revisión, no se permite la edición
    static class ReviewState implements DocumentState {
        // TODO: Implementa el método edit
        // - Print "Cannot edit during review."
        @Override
        public void edit(Document document) {
            System.out.println("Cannot edit during review.");
        }

        // TODO: Implementa el método approve
        // - Print "Review complete. Publishing document."
        // - Transition document to PublishedState
        @Override
        public void approve(Document document) {
            System.out.println("Review complete. Publishing document.");
            document.setState(new PublishedState());
        }
    }

    // PublishedState: Final state, no changes allowed
    static class PublishedState implements DocumentState {
        // TODO: Implementa el método edit
        // - Print "Cannot edit published document."
        @Override
        public void edit(Document document) {
            System.out.println("Cannot edit published document.");
        }

        // TODO: Implementa el método approve
        // - Print "Document already published."
        @Override
        public void approve(Document document) {
            System.out.println("Document already published.");
        }
    }
}
