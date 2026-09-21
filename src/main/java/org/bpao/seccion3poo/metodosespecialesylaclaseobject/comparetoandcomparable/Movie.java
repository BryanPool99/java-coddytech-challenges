package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparetoandcomparable;
// TODO: Haz que esta clase implemente Comparable<Movie>

public class Movie implements Comparable<Movie> {
    // Campos privados
    private String title;
    private String director;
    private double rating;

    // TODO: Crea un constructor que inicialice todos los campos
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }
    // TODO: Crea métodos getter para title, director y rating

    public String getTitle() {
        return this.title;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }
    // TODO: Sobrescribe el método compareTo()
    // Las películas deben ordenarse por rating en orden DESCENDENTE (el más alto primero)
    // Hint: Usa Double.compare() para una comparación segura de double
    // Hint: Para el orden descendente, invierte el orden de la comparación

    @Override
    public int compareTo(Movie otherMovie) {
        return Double.compare(otherMovie.rating, this.getRating());
    }

    // TODO: Sobrescribe el método toString()
    // Formato: [title] by [director] - Rating: [rating]

    @Override
    public String toString() {
        return String.format("%s by %s - Rating: %s", this.getTitle(), this.getDirector(), this.getRating());
    }
}
