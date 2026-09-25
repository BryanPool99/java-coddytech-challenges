package org.bpao.seccion3poo.genericos.introduction_to_generics.desafio;

// OldBox.java - El enfoque pre-genéricos usando Object
public class OldBox {
    // TODO: Declara un campo privado 'content' de tipo Object
    private Object content;
    // TODO: Crea un constructor que acepte un Object y lo almacene
    public OldBox(Object content){
        this.content = content;
    }
    // TODO: Crea un método getContent() que devuelva el Object

    public Object getContent() {
        return content;
    }
}
