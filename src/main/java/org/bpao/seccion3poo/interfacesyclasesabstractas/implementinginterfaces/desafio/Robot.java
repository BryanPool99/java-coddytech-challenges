package org.bpao.seccion3poo.interfacesyclasesabstractas.implementinginterfaces.desafio;

// TODO: Crea una clase Robot que implemente la interfaz Speaker
public class Robot implements Speaker {
    // TODO: Añade un campo privado para model (String)
    private String model;
    // TODO: Crea un constructor que tome un parámetro model
    public Robot(String model){
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
    // TODO: Implementa el método speak()
    // It should return: "Robot [model] says: Beep boop!"

    @Override
    public String speak() {
        return String.format("Robot %s says: Beep boop!",this.getModel());
    }
}
