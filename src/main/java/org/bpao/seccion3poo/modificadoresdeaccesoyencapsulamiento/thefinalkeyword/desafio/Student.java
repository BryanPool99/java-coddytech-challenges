package org.bpao.seccion3poo.modificadoresdeaccesoyencapsulamiento.thefinalkeyword.desafio;

public class Student {
    // TODO: Declarar un campo final para studentId (String)
    private final String studentId;
    // TODO: Declarar un campo final para enrollmentYear (int)
    private final int enrollmentYear;
    // TODO: Declarar un campo privado para name (String) - este NO es final
    private String name;

    // TODO: Crear un constructor que reciba studentId, name y enrollmentYear
    // y que inicialice todos los campos
    public Student(String studentId, String name, int enrollmentYear) {
        this.studentId = studentId;
        this.name = name;
        this.enrollmentYear = enrollmentYear;
    }
    // TODO: Crear el getter getStudentId()

    public String getStudentId() {
        return this.studentId;
    }

    // TODO: Crear el getter getEnrollmentYear()

    public int getEnrollmentYear() {
        return this.enrollmentYear;
    }

    // TODO: Crear el getter getName()

    public String getName() {
        return this.name;
    }

    // TODO: Crear el setter setName(String name)

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Crear el método getInfo() que devuelva:
    // "ID: [studentId] | Name: [name] | Enrolled: [enrollmentYear]"
    public String getInfo() {
        return String.format("ID: %s | Name: %s | Enrolled: %d", this.getStudentId(), this.getName(), this.getEnrollmentYear());
    }
}
