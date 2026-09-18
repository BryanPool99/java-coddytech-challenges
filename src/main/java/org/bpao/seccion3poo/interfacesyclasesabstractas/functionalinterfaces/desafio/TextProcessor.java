package org.bpao.seccion3poo.interfacesyclasesabstractas.functionalinterfaces.desafio;

// TODO: Crea una clase llamada TextProcessor
// TODO: Añade un campo para contener un StringTransformer
// TODO: Crea un constructor que reciba un StringTransformer e inicialice el campo
// TODO: Crea un método llamado process(String text) que:
//       - aplica el transformador al texto
//       - devuelve el resultado transformado
public class TextProcessor {
    private StringTransformer stringTransformer;

    public TextProcessor(StringTransformer stringTransformer) {
        this.stringTransformer = stringTransformer;
    }

    String process(String text) {
        return stringTransformer.transform(text);
    }
}
