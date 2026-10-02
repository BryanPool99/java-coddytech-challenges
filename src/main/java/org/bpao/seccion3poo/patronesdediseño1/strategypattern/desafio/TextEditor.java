package org.bpao.seccion3poo.patronesdediseño1.strategypattern.desafio;

// TODO: Crea la clase de contexto TextEditor
public class TextEditor {
    // TODO: Añade un campo privado para contener la estrategia TextFormatter actual
    private TextFormatter textFormatter;

    // TODO: Implementa el método setFormatter(TextFormatter formatter)
    // Este método cambia la estrategia de formato activa
    public void setFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    // TODO: Implementa el método publishText(String text)
    // - Si hay un formateador establecido, aplícalo al texto
    // - Imprime "Published: [formatted text]" o "Published: [original text]" si no hay formateador
    public void publishText(String text) {
        if (textFormatter==null) {
            System.out.println("Published: " + text);
        } else {
            System.out.println("Published: " + textFormatter.format(text));
        }
    }
}
