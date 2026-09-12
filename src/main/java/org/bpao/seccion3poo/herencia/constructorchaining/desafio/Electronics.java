package org.bpao.seccion3poo.herencia.constructorchaining.desafio;

// Electronics.java - Subclase de Product con información de garantía
public class Electronics extends Product {
    // TODO: Declarar un campo privado para warrantyYears (int)
    private int warrantyYears;

    // TODO: Crear el constructor principal que recibe name, price y warrantyYears
    // - Llamar a super(name, price) para inicializar el padre
    // - Establecer el campo warrantyYears
    // - Imprimir: "Electronics constructor: [warrantyYears] year warranty"
    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
        System.out.println("Electronics constructor: " + this.warrantyYears + " year warranty");
    }

    // TODO: Crear un segundo constructor que recibe name y price
    // - Encadenar al constructor principal con this(name, price, 1) para una garantía predeterminada de 1 año
    public Electronics(String name, double price) {
        this(name, price, 1);
    }

    // TODO: Crear un tercer constructor que recibe solo name
    // - Encadenar al segundo constructor con this(name, 0.0)
    public Electronics(String name) {
        this(name, 0.0);
    }

    public int getWarrantyYears() {
        return this.warrantyYears;
    }

    // TODO: Crear el método getDetails() que devuelva:
    // "[name] - $[price] ([warrantyYears] year warranty)"
    // Usar String.format("%.2f", price) para dar formato al precio
    public String getDetails() {
        return String.format("%s - $%.2f (%d year warranty)", this.getName(), this.getPrice(), this.getWarrantyYears());
    }
}
