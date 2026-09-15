package org.bpao.seccion3poo.polimorfismo.upcastinganddowncasting.desafio;
// Clase base para todos los tipos de medios
public class Media {
    // TODO: Declara el campo title (String)
    private String title;
    // TODO: Crea un constructor que inicialice el title
    public Media(String title){
        this.title = title;
    }
    // TODO: Crea un método getter getTitle()

    public String getTitle() {
        return this.title;
    }

    // TODO: Crea un método play() que imprima: Playing: [title]
    public void play(){
        System.out.println("Playing: "+this.getTitle());
    }
}
