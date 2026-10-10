# Plataforma de E-Learning
Este desafío final combina varios conceptos de OOP en un sistema cohesivo:

### Interfaces
Define contratos de comportamiento que las clases deben implementar:

```java
public interface Enrollable {
    boolean enroll(Student student);
    int getEnrolledCount();
}
```

### Clases abstractas
Crea clases base con comportamiento compartido y métodos abstractos:

```java
public abstract class User {
    private String id;
    private String name;
    
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public abstract String getRole();
}
```

### Herencia
Extiende las clases base para crear tipos especializados:

```java
public class Student extends User {
    private ArrayList<String> enrolledCourses;
    
    public Student(String id, String name) {
        super(id, name);
        this.enrolledCourses = new ArrayList<>();
    }
    
    @Override
    public String getRole() {
        return "Student";
    }
}
```

### Implementación de interfaces
Las clases pueden implementar interfaces para cumplir contratos:

```java
public class Course implements Enrollable {
    private ArrayList<Student> enrolledStudents;
    
    @Override
    public boolean enroll(Student student) {
        enrolledStudents.add(student);
        student.addCourse(courseId);
        return true;
    }
    
    @Override
    public int getEnrolledCount() {
        return enrolledStudents.size();
    }
}
```

### Polimorfismo
Las distintas clases pueden sobrescribir métodos para proporcionar un comportamiento especializado:

```java
@Override
public String toString() {
    return "Student: " + name + " (" + enrolledCourses.size() + " courses)";
}
```

### Encapsulación
Usa campos privados con acceso controlado mediante métodos para proteger la integridad de los datos y mantener las relaciones entre los objetos.
