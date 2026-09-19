package org.bpao.seccion3poo.metodosespecialesylaclaseobject.equalsandhashcode.desafio;

import java.util.Objects;

public class Student {
    // TODO: Declara tres campos privados: studentId (String), name (String), gpa (double)
    private String studentId;
    private String name;
    private double gpa;

    // TODO: Crea un constructor que inicialice los tres campos
    public Student(String studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }
    // TODO: Crea métodos getter para cada campo

    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    // TODO: Sobrescribe el método equals()
    // - Check if comparing to same reference (return true)
    // - Comprueba si other es null o de una clase diferente (return false)
    // - Haz un cast y compara los campos studentId AND name

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj==null || getClass()!=obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId) && name.equals(student.name);
    }

    // TODO: Sobrescribe el método hashCode()
    // - Usa Objects.hash() con los mismos campos usados en equals()

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }
}
