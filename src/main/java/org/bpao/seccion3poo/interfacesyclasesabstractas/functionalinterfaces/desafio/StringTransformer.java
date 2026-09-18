package org.bpao.seccion3poo.interfacesyclasesabstractas.functionalinterfaces.desafio;

// TODO: Add the @FunctionalInterface annotation
// TODO: Define a functional interface called StringTransformer
// TODO: Declara un único método abstracto llamado 'transform'
//       que toma un parámetro String y devuelve un String
@FunctionalInterface
public interface StringTransformer {
    String transform(String text);
}
