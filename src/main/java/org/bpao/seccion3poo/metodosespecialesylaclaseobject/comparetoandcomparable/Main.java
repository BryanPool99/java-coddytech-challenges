package org.bpao.seccion3poo.metodosespecialesylaclaseobject.comparetoandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lee tres líneas de datos de películas
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        // TODO: Crea un ArrayList para almacenar objetos Movie
        List<Movie> movies = new ArrayList<>();
        // TODO: Analiza cada línea (formato: title,director,rating)
        // Hint: Usa split(",") para separar las partes
        // Hint: Usa Double.parseDouble() para el rating
        String title1 = line1.split(",")[0];
        String director1 = line1.split(",")[1];
        double rating1 = Double.parseDouble(line1.split(",")[2]);
        String title2 = line2.split(",")[0];
        String director2 = line2.split(",")[1];
        double rating2 = Double.parseDouble(line2.split(",")[2]);
        String title3 = line3.split(",")[0];
        String director3 = line3.split(",")[1];
        double rating3 = Double.parseDouble(line3.split(",")[2]);
        // TODO: Crea objetos Movie y añádelos a la lista
        Movie movie1 = new Movie(title1, director1, rating1);
        Movie movie2 = new Movie(title2, director2, rating2);
        Movie movie3 = new Movie(title3, director3, rating3);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        // TODO: Ordena la lista usando Collections.sort()
        Collections.sort(movies);
        // TODO: Imprime cada película (una por línea)
        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
