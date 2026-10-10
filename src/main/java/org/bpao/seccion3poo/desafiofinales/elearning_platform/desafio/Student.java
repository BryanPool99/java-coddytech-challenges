package org.bpao.seccion3poo.desafiofinales.elearning_platform.desafio;

import java.util.ArrayList;

// Clase que representa a un estudiante, extiende User
public class Student extends User {
    // TODO: Añadir ArrayList privado para rastrear los IDs de los cursos inscritos
    private ArrayList<String> courseIds;

    // TODO: Crear constructor que llame al constructor padre e inicialice el ArrayList
    public Student(String id, String name) {
        super(id, name);
        this.courseIds = new ArrayList<>();
    }

    // TODO: Implementar getRole() para devolver "Student"
    @Override
    public String getRole() {
        return "Student";
    }

    // TODO: Añadir método addCourse(String courseId) para añadir el curso a la lista
    public void addCourse(String courseId) {
        this.courseIds.add(courseId);
    }

    // TODO: Añadir método getEnrolledCourseCount() para devolver el número de cursos inscritos
    public int getEnrolledCourseCount() {
        return this.courseIds.size();
    }

    // TODO: Sobrescribir toString() para devolver "Student: [name] ([enrolledCount] courses)"

    @Override
    public String toString() {
        return String.format("Student: %s (%d courses)", getName(), getEnrolledCourseCount());
    }
}
