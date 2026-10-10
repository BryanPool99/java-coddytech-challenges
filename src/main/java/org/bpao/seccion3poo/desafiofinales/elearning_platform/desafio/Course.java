package org.bpao.seccion3poo.desafiofinales.elearning_platform.desafio;

import java.util.ArrayList;

// Clase que representa un curso, implementa Enrollable
public class Course implements Enrollable {
    // TODO: Añade campos privados para courseId, title, instructor y ArrayList de Students inscritos
    private String courseId;
    private String title;
    private Instructor instructor;
    private ArrayList<Student> students = new ArrayList<>();

    // TODO: Crea un constructor que tome courseId, title e instructor
    public Course(String courseId, String title, Instructor instructor) {
        this.courseId = courseId;
        this.title = title;
        this.instructor = instructor;
    }

    // TODO: Implementa enroll(Student student) - añade student a la lista, llama a addCourse() del student, devuelve true
    @Override
    public boolean enroll(Student student) {
        this.students.add(student);
        student.addCourse(this.courseId);
        return true;
    }

    // TODO: Implementa getEnrolledCount() para devolver el número de students inscritos
    @Override
    public int getEnrolledCount() {
        return this.students.size();
    }

    // TODO: Añade el método getDetails() que devuelve "[courseId] [title] by [instructorName]"
    public String getDetails() {
        return String.format("[%s] %s by %s", getCourseId(), getTitle(), getInstructor().getName());
    }

    // TODO: Añade getters según sea necesario (getCourseId, getTitle, etc.)
    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
