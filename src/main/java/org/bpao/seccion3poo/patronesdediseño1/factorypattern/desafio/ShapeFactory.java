package org.bpao.seccion3poo.patronesdediseño1.factorypattern.desafio;

// TODO: Crea la clase ShapeFactory
// Debería tener un método estático: createShape(String type)
// El método debería devolver un Shape basado en el tipo:
// - "circle" -> return new Circle()
// - "rectangle" -> return new Rectangle()
// - "triangle" -> return new Triangle()
// - cualquier otro valor -> return null
public class ShapeFactory {
    public static Shape createShape(String type) {
        if (type.equals("circle")) {
            return new Shapes.Circle();
        } else if (type.equals("rectangle")) {
            return new Shapes.Rectangle();
        } else if (type.equals("triangle")) {
            return new Shapes.Triangle();
        }
        return null;
    }
}
