package org.bpao.seccion3poo.conceptosavanzadosdepoo.aggregationvscomposition.desafio;

// Clase Course - demuestra tanto agregación (Professor) como composición (Lectures)
public class Course {
    // TODO: Declara campos privados:
    // - title (String)
    // - professor (Professor) - agregación: se pasa desde fuera
    // - lectures (Lecture[]) - composición: se crea internamente
    private String title;
    private Professor professor;
    private Lecture[] lectures;

    // TODO: Crea el constructor que toma title, professor y numberOfLectures
    // - Almacena title y professor
    // - Crea el array lectures y rellénalo con nuevos objetos Lecture
    // - Cada lecture en el índice i tiene topic "Topic " + (i + 1) y duration 45
    public Course(String title, Professor professor, int numberOfLectures) {
        this.title = title;
        this.professor = professor;
        this.lectures = new Lecture[numberOfLectures];
        for (int i = 0; i < numberOfLectures; i++) {
            this.lectures[i] = new Lecture("Topic " + (i + 1), 45);
        }
    }

    // TODO: Crea el método getInfo() que devuelve:
    // Course: [title]
    // Instructor: [professor.toString()]
    // Lectures: [número de lectures]
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: " + this.title + "\n");
        sb.append("Instructor: " + this.professor.toString() + "\n");
        sb.append("Lectures: " + this.lectures.length);
        return sb.toString();
    }
    // TODO: Crea el método listLectures() que devuelve el toString() de cada lecture en su propia línea

    public String listLectures(){
        StringBuilder sb = new StringBuilder();
        for (Lecture lecture : this.lectures){
            sb.append(lecture.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
