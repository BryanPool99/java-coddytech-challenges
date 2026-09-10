package org.bpao.seccion3poo.propiedadesdeclaseymiembrosestaticos.recapcounterandutility;

public class MathUtils {
    // TODO: Crea una constante pública PI con el valor 3.14159
    public static final double PI = 3.14159;
    // TODO: Crea una constante pública HALF con el valor 0.5
    public static final double HALF = 0.5;

    // TODO: Crea un método estático square(int n) que devuelva n al cuadrado
    public static int square(int n) {
        return n * n;
    }

    // TODO: Crea un método estático cube(int n) que devuelva n al cubo
    public static int cube(int n) {
        return n * n * n;
    }

    // TODO: Crea un método estático circleArea(double radius) que devuelva PI * radius * radius
    public static double circleArea(double radius) {
        return MathUtils.PI * radius * radius;
    }
}
