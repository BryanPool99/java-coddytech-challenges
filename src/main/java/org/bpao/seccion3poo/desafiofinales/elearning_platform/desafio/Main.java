package org.bpao.seccion3poo.desafiofinales.elearning_platform.desafio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // TODO: Crear colecciones para almacenar instructores, estudiantes y cursos
        // Hint: Usa HashMap con id como clave para una búsqueda fácil
        HashMap<String, Instructor> instructors = new HashMap<>();
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, Course> courses = new HashMap<>();
        ArrayList<String> courseOrder = new ArrayList<>();

        // TODO: Divide la entrada por comas para obtener los comandos individuales
        String[] commands = input.split(",");
        // TODO: Procesa cada comando:
        // - ADD_INSTRUCTOR:id:name:specialty -> Create instructor, add to collection, print "Instructor added: [name]"
        // - ADD_STUDENT:id:name -> Create student, add to collection, print "Student added: [name]"
        // - ADD_COURSE:courseId:title:instructorId -> Create course with instructor, add to collection, print "Course added: [title]"
        // - ENROLL:studentId:courseId -> Inscribe al estudiante en el curso, imprime "[studentName] enrolled in [courseTitle]"
        // - INFO:userId -> Encuentra el usuario (estudiante o instructor) e imprime su toString()
        for (String command : commands) {
            String[] parts = command.split(":");
            String action = parts[0];

            if (action.equals("ADD_INSTRUCTOR")) {
                String id = parts[1];
                String name = parts[2];
                String specialty = parts[3];
                Instructor instructor = new Instructor(id, name, specialty);
                instructors.put(id, instructor);
                System.out.println("Instructor added: " + name);
            } else if (action.equals("ADD_STUDENT")) {
                String id = parts[1];
                String name = parts[2];
                Student student = new Student(id, name);
                students.put(id, student);
                System.out.println("Student added: " + name);
            } else if (action.equals("ADD_COURSE")) {
                String courseId = parts[1];
                String title = parts[2];
                String instructorId = parts[3];
                Instructor instructor = instructors.get(instructorId);
                Course course = new Course(courseId, title, instructor);
                courses.put(courseId, course);
                courseOrder.add(courseId);
                System.out.println("Course added: " + title);
            } else if (action.equals("ENROLL")) {
                String studentId = parts[1];
                String courseId = parts[2];
                Student student = students.get(studentId);
                Course course = courses.get(courseId);
                course.enroll(student);
                System.out.println(student.getName() + " enrolled in " + course.getTitle());
            } else if (action.equals("INFO")) {
                String userId = parts[1];
                if (students.containsKey(userId)) {
                    System.out.println(students.get(userId).toString());
                } else if (instructors.containsKey(userId)) {
                    System.out.println(instructors.get(userId).toString());
                }
            }
        }

        // TODO: After processing all commands, print "--- Platform Summary ---"
        System.out.println("--- Platform Summary ---");

        // TODO: Para cada curso, imprime "[courseDetails] - [count] student(s)"
        for (String courseId : courseOrder) {
            Course course = courses.get(courseId);
            System.out.println(course.getDetails() + " - " + course.getEnrolledCount() + " student(s)");
        }
    }
}
