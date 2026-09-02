package org.bpao.seccion3poo.objectorientedprogramming.methods.desafio;

public class StringHelper {
    private String text;

    public StringHelper(String text) {
        this.text = text;
    }

    // TODO: Crea un método toUpperCase() que devuelva this.text en mayúsculas
    // Hint: usa this.text.toUpperCase()
    public String toUpperCase() {
        return this.text.toUpperCase();
    }

    // TODO: Crea un método getLength() que devuelva la longitud de this.text como un int
    // Hint: usa this.text.length()
    public int getLength() {
        return this.text.length();
    }

    // TODO: Crea un método contains(String word) que devuelva true/false si this.text contiene word
    // Hint: usa this.text.contains(word)
    public boolean contains(String word) {
        return this.text.contains(word);
    }

    // TODO: Crea un método repeat(int times) que devuelva this.text repetido 'times' veces
    // Cada repetición seguida de un espacio
    // Hint: usa un bucle for y concatenación de strings
    public String repeat(int times) {
        String result = "";
        for (int i = 1; i <= times; i++) {
            if (i==times) {
                result += this.text;
            } else {
                result += this.text + " ";
            }
        }
        return result;
    }
}
