package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.accesslevelsoverview.desafio;

public class Student {
    // TODO: Define los cuatro campos con diferentes modificadores de acceso:
    // - private: studentId (String)
    // - default (sin modificador): grade (int)
    // - protected: name (String)
    // - public: school (String)
    private String studentId;
    int grade;
    protected String name;
    public String school;

    // TODO: Crea un constructor que tome los cuatro parámetros
    // e inicialice todos los campos
    public Student(String studentId, String name, int grade, String school) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
        this.school = school;
    }

    // TODO: Implementa el método getInfo() que devuelva:
    // "[studentId] name - Grade grade at school"
    public String getInfo() {
        return "[" + this.studentId + "] " + this.name + " - " + "Grade " + this.grade + " at " + this.school;
    }
}
